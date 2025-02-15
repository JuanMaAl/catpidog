package com.adopcion.catpidog.controller;

import com.adopcion.catpidog.dto.AdopcionDTO;
import com.adopcion.catpidog.model.Adopcion;
import com.adopcion.catpidog.service.AdopcionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/adopciones")
public class AdopcionController {
	
	@Autowired
	private AdopcionService adopcionService;
	
	@PostMapping
	public ResponseEntity<Adopcion>
	crearAdopcion(@RequestBody AdopcionDTO adopcionDTO) {
		Adopcion nuevaAdopcion = adopcionService.crearAdopcion(adopcionDTO);
		return ResponseEntity.status(201).body(nuevaAdopcion);
	}
	
	@GetMapping
	public ResponseEntity<List<Adopcion>>
	obtenerAdopciones() {
		List<Adopcion> adopciones = adopcionService.obtenerAdopciones();
		adopcionService.obtenerAdopciones();
		return ResponseEntity.ok(adopciones);
		}
}
