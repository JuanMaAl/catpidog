package com.adopcion.catpidog.service;

import java.util.List;

import com.adopcion.catpidog.dto.AdopcionDTO;
import com.adopcion.catpidog.model.Adopcion;

public interface AdopcionService {
	Adopcion crearAdopcion(AdopcionDTO adopcionDTO);
	List<Adopcion> obtenerAdopciones();
}
