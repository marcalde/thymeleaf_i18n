package com.example.demoThymeleaf.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="prenotazioni_v2")
public class PrenotazioneEntity {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SURNAME")
	private String surname;
	
	@Column(name = "EMAIL")
	private String email;

	@Column(name = "AGE")
	private int age;
	/*
	@Column(name = "CITY")
	private String city;
	*/
	@ManyToOne
	@JoinColumn(name="CITY_ID")
	private CittaEntity city;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

/*
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
*/

	public CittaEntity getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "PrenotazioneEntity [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email
				+ ", age=" + age + ", city=" + city.toString() + "]";
	}

	public void setCity(CittaEntity city) {
		this.city = city;
	}

}
