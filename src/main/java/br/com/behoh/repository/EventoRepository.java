package br.com.behoh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.behoh.model.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long>{

}