package com.example.demoThymeleaf.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoThymeleaf.dao.PrenotazioneDAO;
import com.example.demoThymeleaf.entity.PrenotazioneEntity;


@Service
public class PrenotazioneService {
	
	@Autowired
	private PrenotazioneDAO prenotazioneDAO;
	
	@Transactional
	public void addPrenotazione(PrenotazioneEntity prenotazione) {
		prenotazioneDAO.addPrenotazione(prenotazione);
	}
	
	@Transactional
	public Optional<PrenotazioneEntity> getPrenotazione(long id) {
		return prenotazioneDAO.getPrenotazione(id);
	}
	
	@Transactional
	public List<PrenotazioneEntity> getAll(){
		return prenotazioneDAO.getAll();
	}
	
	@Transactional
	public void updatePrenotazione(PrenotazioneEntity prenotazione) {
		prenotazioneDAO.changePrenotazione(prenotazione);
	}

}
