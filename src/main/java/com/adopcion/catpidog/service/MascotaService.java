package com.adopcion.catpidog.service;

import com.adopcion.catpidog.model.Mascota;
import java.util.List;

public interface MascotaService {
	Mascota save(Mascota mascota);
	List<Mascota> findAll();
	Mascota update(Long id, Mascota mascotaActualizada);
}