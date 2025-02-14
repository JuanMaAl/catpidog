package com.adopcion.catpidog.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Adopcion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "mascota_id")
	private Mascota mascota;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	@Temporal(TemporalType.DATE)
	private Date fechaAdopcion;
	
	// Constructores
	public Adopcion() {}
	
	public Adopcion(Mascota mascota, Usuario usuario, Date fechaAdopcion) {
		this.mascota = mascota;
		this.usuario = usuario;
		this.fechaAdopcion = fechaAdopcion;
	}
	
	// Getters y Setters
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Mascota getMascota() {
		return mascota;
	}
	
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Date getFechaAdopcion() {
		return fechaAdopcion;
	}
	
	public void setFechaAdopcion(Date fechaAdopcion) {
		this.fechaAdopcion = fechaAdopcion;
	}
}
