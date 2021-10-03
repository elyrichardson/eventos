package br.com.behoh;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import br.com.behoh.model.Evento;
import br.com.behoh.repository.EventoRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class EventoRepositoryTests {
	@Autowired
	private EventoRepository eventoRepository;
	@Autowired
	private TestEntityManager testEntityManager;
	
	@Test
	public void testCreateEvento() throws ParseException {
		Evento evento = new Evento();
		evento.setNome("Evento de Teste");
		evento.setVagas(20);
		evento.setDataIni(new SimpleDateFormat("yyyy-MM-dd").parse("2021-10-01"));
		evento.setDataFim(new SimpleDateFormat("yyyy-MM-dd").parse("2021-10-10"));
		Evento novoEvento = eventoRepository.save(evento);
		Evento testEvento = testEntityManager.find(Evento.class, novoEvento.getId());
		assertThat(testEvento.getNome()).isEqualTo(evento.getNome());
		
		
	}
}
