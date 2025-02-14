package com.adopcion.catpidog.dto;

public class MascotaDTO {
	private String nombre;
	private Long tipoMascotaId;
	private int edad;
	private Boolean disponible;
	
	// Constructor
	public MascotaDTO() {}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Long getTipoMascotaId( ) {
		return tipoMascotaId;
	}
	
	public void setTipoMascotaId(Long tipoMascotaId) {
		this.tipoMascotaId = tipoMascotaId;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Boolean getDisponible() {
		return disponible;
	}
	
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}
}
