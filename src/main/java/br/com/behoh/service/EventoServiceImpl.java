package br.com.behoh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.behoh.model.Evento;
import br.com.behoh.repository.EventoRepository;

@Service
public class EventoServiceImpl implements EventoService{

	@Autowired
	private EventoRepository eventoRepository;
	
	@Override
	public List<Evento> getAllEventos() {
		return eventoRepository.findAll();
	}

}
