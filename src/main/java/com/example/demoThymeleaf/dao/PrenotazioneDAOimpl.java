package com.example.demoThymeleaf.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demoThymeleaf.entity.PrenotazioneEntity;
import com.example.demoThymeleaf.repository.PrenotazioneRepository;

@Component
public class PrenotazioneDAOimpl implements PrenotazioneDAO{
	
	@Autowired
	PrenotazioneRepository repository;
		
	@Override
	public void addPrenotazione(PrenotazioneEntity prenotazione) {
		
		repository.save(prenotazione);
	}


	@Override
	public Optional<PrenotazioneEntity> getPrenotazione(long id) {
		
		return repository.findById(id);
	}


	@Override
	public List<PrenotazioneEntity> getAll() {
		return repository.findAll();
	}


	@Override
	public void changePrenotazione(PrenotazioneEntity prenotazione) {

		
		repository.updatePrenotazione(prenotazione.getId(), prenotazione.getName(), prenotazione.getSurname(),
				prenotazione.getEmail(), prenotazione.getAge(), prenotazione.getCity());
	}
	 
	 
	

}
