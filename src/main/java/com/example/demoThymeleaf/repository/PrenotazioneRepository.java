package com.example.demoThymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demoThymeleaf.entity.CittaEntity;
import com.example.demoThymeleaf.entity.PrenotazioneEntity;

 
@Repository
public interface PrenotazioneRepository extends JpaRepository<PrenotazioneEntity, Long> {
	
	@Modifying
	@Query("update PrenotazioneEntity u set u.name = :name, u.surname = :surname, u.email = :email, u.age = :age,"
			+ " u.city = :city where u.id = :id")
	void updatePrenotazione(@Param(value = "id") long id, @Param(value = "name") String name, @Param(value = "surname") 
	String surname,@Param(value = "email") String email,@Param(value = "age") int age, @Param(value = "city") CittaEntity city);
 
}