package com.adopcion.catpidog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopcion.catpidog.model.TipoMascota;
import com.adopcion.catpidog.repository.TipoMascotaRepository;

@Service
public class TipoMascotaService {
	
	@Autowired
	private TipoMascotaRepository tipoMascotaRepository;
	
	public List<TipoMascota> obtenerTiposMascota() {
			return tipoMascotaRepository.findAll();
	}
}
