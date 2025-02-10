package com.adopcion.service;

import com.adopcion.model.Mascota;
import com.adopcion.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasctoraServiceImpl implements MascotaService{

	@Autowired
	private MascotaRepository mascotaRepository;
	
	@Override
	public Mascota save(Mascota mascota) {
		return mascotaRepository.save(mascota);
	}
	
	@Override
	public List<Mascota> findAll() {
		return mascotaRespository.findAll();
	}
}
