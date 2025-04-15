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
	private String descripcion;
	private String imageSrc;
	private String altText;
	
	public TipoMascota() {}
	
	public TipoMascota(String nombre, String descripcion, String imageSrc, String altText) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imageSrc = imageSrc;
		this.altText = altText;
		
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
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getImageSrc() {
		return imageSrc;
	}
	
	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}
	
	public String getAltText() {
		return altText;
	}
	
	public void setAllText(String altText) {
		this.altText = altText;
	}
}