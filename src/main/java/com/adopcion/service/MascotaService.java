package com.adopcion.service;

import com.adopcion.model.Mascota;
import java.util.List;

public interface MascotaService {
	Mascota save(Mascota mascota);
	List<Mascota> findAll();
}
