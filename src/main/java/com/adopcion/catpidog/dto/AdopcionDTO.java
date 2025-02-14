package com.adopcion.catpidog.dto;

import java.util.Date;

public class AdopcionDTO {
	private Long mascotaId;
	private Long usuarioId;
	private Date fechaAdopcion;
	
	// Constructores
	public AdopcionDTO() {}
	
	public AdopcionDTO(Long mascotaId, Long usuarioId, Date fechaAdopcion) {
		this.mascotaId = mascotaId;
		this.usuarioId = usuarioId;
		this.fechaAdopcion = fechaAdopcion;
	}
	
	// Getters y Setters
	public Long getMascotaId() {
		return mascotaId;
	}
	
	public void setMascotaId(Long mascotaId) {
		this.mascotaId = mascotaId;
	}
	
	public Long getUsuarioId() {
		return usuarioId;
	}
	
	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}
	
	public Date getFechaAdopcion() {
		return fechaAdopcion;
	}
	
	public void setFechaAdopcion(Date fechaAdopcion) {
		this.fechaAdopcion = fechaAdopcion;
	}
}
