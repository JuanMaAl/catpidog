package com.adopcion.catpidog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TipoMascota {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	public TipoMascota() {}
	
	public TipoMascota(String nombre) {
		this.nombre = nombre;
	}
	
	// Getters and Setters 
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}