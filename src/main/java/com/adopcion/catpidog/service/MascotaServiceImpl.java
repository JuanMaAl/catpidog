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
	
	@Override
	public Mascota update(Long id, Mascota mascotaActualizada) {
		return mascotaRepository.findById(id)
				.map(mascota -> {
					mascota.setNombre(mascotaActualizada.getNombre());
					mascota.setEdad(mascotaActualizada.getEdad());
					return mascotaRepository.save(mascota);
				})
				.orElseThrow(() -> new RuntimeException("Mascota no encontrada con id" + id));
	}
	
	@Override
	public boolean delete(Long id) {
		if (mascotaRepository.existsById(id)) {
			mascotaRepository.deleteById(id);
			return true;
		}
		return false;
	}
}
