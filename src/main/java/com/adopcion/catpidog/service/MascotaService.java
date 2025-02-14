package com.adopcion.catpidog.service;

import com.adopcion.catpidog.model.Mascota;
import com.adopcion.catpidog.dto.MascotaDTO;
import java.util.List;

public interface MascotaService {
	Mascota save(Mascota mascota);
	List<Mascota> findAll();
	Mascota update(Long id, Mascota mascotaActualizada);
	boolean delete(Long id);
	
	Mascota crearMascota(MascotaDTO mascotaDTO);
}