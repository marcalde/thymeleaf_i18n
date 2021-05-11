package com.example.demoThymeleaf.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoThymeleaf.entity.PrenotazioneEntity;
import com.example.demoThymeleaf.model.Prenotazione;
import com.example.demoThymeleaf.service.CittaService;
import com.example.demoThymeleaf.service.PrenotazioneService;
import com.fasterxml.jackson.databind.ObjectMapper;


@Controller
public class PrenotazioneController  {
	
	@Autowired
	PrenotazioneService prenotazioneService;
	
	@Autowired
	CittaService cittaService;

	List<Prenotazione> prenotazioni = new ArrayList<Prenotazione>();
	
	
	@GetMapping("/API/prenotaz")
	public String prova(PrenotazioneEntity prenotazione, Model model) {
		
		model.addAttribute("cities", cittaService.getAll());
		model.addAttribute("prenotazioneEntity", new PrenotazioneEntity());
		
		return "prenotazione";
	}

	@PostMapping(value="/API/prenotaz", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE) 
	String registra(@ModelAttribute("prenotazioneEntity") PrenotazioneEntity prenotazione, BindingResult result, Model model) {
		
		System.out.println(prenotazione.toString());
		
		prenotazioneService.addPrenotazione(prenotazione);
		model.addAttribute("cities", cittaService.getAll());
		
		return "prenotazione_recap";
	}

	
	@PostMapping(value="/API/prenotazCambio", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE) 
	String cambia(@ModelAttribute("prenotazioneEntity") PrenotazioneEntity prenotazione, BindingResult result, Model model) {
		
		System.out.println(prenotazione.toString());
		
		prenotazioneService.updatePrenotazione(prenotazione);
		
		return "prenotazione_change";
	}
	
	
	

}
