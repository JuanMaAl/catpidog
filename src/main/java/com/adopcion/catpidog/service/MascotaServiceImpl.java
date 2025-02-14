package com.adopcion.catpidog.service;

import com.adopcion.catpidog.model.Mascota;
import com.adopcion.catpidog.model.TipoMascota;
import com.adopcion.catpidog.repository.MascotaRepository;
import com.adopcion.catpidog.repository.TipoMascotaRepository;
import com.adopcion.catpidog.dto.MascotaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaServiceImpl implements MascotaService{

	@Autowired
	private MascotaRepository mascotaRepository;
	
	@Autowired
	private TipoMascotaRepository tipoMascotaRepository;
	
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
					mascota.setDisponible(mascotaActualizada.getDisponible());
					mascota.setTipoMascota(mascotaActualizada.getTipoMascota());
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
	
	@Override
	public Mascota crearMascota(MascotaDTO mascotaDTO) {
		TipoMascota tipoMascota =
				tipoMascotaRepository.findById(mascotaDTO.getTipoMascotaId())
				.orElseThrow(() -> new RuntimeException("Tipo de mascota no encontrado con id: " +
				mascotaDTO.getTipoMascotaId()));
		
		Mascota mascota = new Mascota();
		mascota.setNombre(mascotaDTO.getNombre());
		mascota.setTipoMascota(tipoMascota);
		mascota.setEdad(mascotaDTO.getEdad());
		mascota.setDisponible(mascotaDTO.getDisponible());
	
		return mascotaRepository.save(mascota);
	}
}