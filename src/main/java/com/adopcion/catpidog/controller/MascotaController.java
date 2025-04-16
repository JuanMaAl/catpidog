package com.adopcion.catpidog.controller;

import com.adopcion.catpidog.dto.MascotaDTO;
import com.adopcion.catpidog.model.Mascota;
import com.adopcion.catpidog.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")
@CrossOrigin(origins = "http://localhost:5173")

public class MascotaController {
	
	@Autowired
	private MascotaService mascotaService;
	
	@PostMapping
	public ResponseEntity<Mascota> registrarMascota(@RequestBody MascotaDTO mascotaDTO) {
		Mascota nuevaMascota = mascotaService.crearMascota(mascotaDTO);
		return ResponseEntity.status(201).body(nuevaMascota);
	}
	
	@GetMapping
	public List<Mascota> obtenerMascotas() {
		return mascotaService.findAll();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Mascota> actualizarMascota(@PathVariable
			Long id, @RequestBody Mascota mascota) {
		Mascota mascotaActualizada = mascotaService.update(id, mascota);
		if (mascotaActualizada != null) {
			return ResponseEntity.ok(mascotaActualizada);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminarMascota(@PathVariable 
			Long id) {
		boolean eliminado = mascotaService.delete(id);
		if (eliminado) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}	
}
