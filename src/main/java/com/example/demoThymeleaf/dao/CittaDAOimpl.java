package com.example.demoThymeleaf.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demoThymeleaf.entity.CittaEntity;
import com.example.demoThymeleaf.repository.CittaRepository;

@Component
public class CittaDAOimpl implements CittaDAO{

	@Autowired
	CittaRepository repository;
	
	@Override
	public void addCitta(CittaEntity citta) {

		repository.save(citta);
		
	}

	@Override
	public Optional<CittaEntity> getCitta(long id) {
		
		return repository.findById(id);
	}

	@Override
	public List<CittaEntity> getAll() {
		
		return repository.findAll();
	}

}
