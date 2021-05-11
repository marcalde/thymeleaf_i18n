package com.example.demoThymeleaf.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoThymeleaf.dao.CittaDAO;
import com.example.demoThymeleaf.entity.CittaEntity;

@Service
public class CittaService {
	
	@Autowired
	CittaDAO cittaDAO;

	
	@Transactional
	public void addCitta(CittaEntity citta) {
		cittaDAO.addCitta(citta);
	}
	
	@Transactional
	public Optional<CittaEntity> getCitta(long id) {
		return cittaDAO.getCitta(id);
	}
	
	@Transactional
	public List<CittaEntity> getAll(){
		return cittaDAO.getAll();
	}
	
}
