package com.example.demoThymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoThymeleaf.entity.CittaEntity;

@Repository
public interface CittaRepository extends JpaRepository<CittaEntity, Long>{

}
