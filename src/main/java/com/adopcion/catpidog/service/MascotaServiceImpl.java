package com.adopcion.catpidog.service;

import com.adopcion.catpidog.model.Mascota;
import com.adopcion.catpidog.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaServiceImpl implements MascotaService{

	@Autowired
	private MascotaRepository mascotaRepository;
	
	@Override
	public Mascota save(Mascota mascota) {
		return mascotaRepository.save(mascota);
	}
	
	@Override
	public List<Mascota> findAll() {
		return mascotaRepository.findAll();
	}
}
