package com.adopcion.controller;

import com.adopcion.model.Mascota;
import com.adopcion.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")

public class MascotaController {
	
	@Autowired
	private MascotaService mascotaService;
	
	@PostMapping
	public ResponseEntity<Mascota> registrarMascota(@RequestBody Mascota mascota) {
		Mascota nuevaMascota = mascotaService.save(mascota);
		return ResponseEntity.status(201).body(nuevaMascota);
	}
	
	@GetMapping
	public List<Mascota> obtenerMascotas() {
		return mascotaService.findAll();
	}
}
