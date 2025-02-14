package com.adopcion.catpidog.model;

import jakarta.persistence.*;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String correoElectronico;
	private String telefono;
	
	// Constructores
	public Usuario() {}
	
	public Usuario(String nombre, String correoElectronico, String telefono) {
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.telefono = telefono;
	}
	
	// Getters y Setters
	public Long getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
