package br.com.behoh;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import br.com.behoh.model.Usuario;
import br.com.behoh.repository.UsuarioRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UsuarioRepositoryTests {
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private TestEntityManager testEntityManager;
	
	@Test
	public void testCreateUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNome("Ely");
		usuario.setEmail("ely.richardson@gmail.com");
		usuario.setSenha("senha@123");
		Usuario novoUsuario = usuarioRepository.save(usuario);
		Usuario testUsuario = testEntityManager.find(Usuario.class, novoUsuario.getId());
		assertThat(testUsuario.getEmail()).isEqualTo(usuario.getEmail());
		
		
	}
}
