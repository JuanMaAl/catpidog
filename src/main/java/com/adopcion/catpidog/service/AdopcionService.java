package com.adopcion.catpidog.service;

import com.adopcion.catpidog.dto.AdopcionDTO;
import com.adopcion.catpidog.model.Adopcion;

public interface AdopcionService {
	Adopcion crearAdopcion(AdopcionDTO adopcionDTO);
}
