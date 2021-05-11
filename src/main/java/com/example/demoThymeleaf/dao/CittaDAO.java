package com.example.demoThymeleaf.dao;

import java.util.List;
import java.util.Optional;

import com.example.demoThymeleaf.entity.CittaEntity;

public interface CittaDAO {

	public void addCitta(CittaEntity citta);
	
	public Optional<CittaEntity> getCitta(long id);
	
	public List<CittaEntity> getAll();
	
}
