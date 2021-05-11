package com.example.demoThymeleaf.dao;

import java.util.List;
import java.util.Optional;

import com.example.demoThymeleaf.entity.PrenotazioneEntity;


public interface PrenotazioneDAO {

	public void addPrenotazione(PrenotazioneEntity prenotazione);
	
	public Optional<PrenotazioneEntity> getPrenotazione(long id);
	
	public List<PrenotazioneEntity> getAll();
	
	public void changePrenotazione(PrenotazioneEntity prenotazione);
	
}
