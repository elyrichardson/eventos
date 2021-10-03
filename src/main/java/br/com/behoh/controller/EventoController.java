package br.com.behoh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.behoh.service.EventoService;

@Controller
public class EventoController {
	//Exibir lista de eventos
	@Autowired
	private EventoService eventoService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEventos", eventoService.getAllEventos());
		return "index";
	}
}
