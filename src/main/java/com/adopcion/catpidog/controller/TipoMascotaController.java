package com.adopcion.catpidog.controller;

import com.adopcion.catpidog.model.TipoMascota;
import com.adopcion.catpidog.service.TipoMascotaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipos")
@CrossOrigin(origins = "http://localhost:5173")

public class TipoMascotaController {
	
	@Autowired
	private TipoMascotaService tipoMascotaService;
	

	
	@GetMapping
	public List<TipoMascota> obtenerTiposMascotas() {
		return tipoMascotaService.obtenerTiposMascota();
	}
}
