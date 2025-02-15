package com.adopcion.catpidog.service;

import com.adopcion.catpidog.dto.AdopcionDTO;
import com.adopcion.catpidog.model.Adopcion;
import com.adopcion.catpidog.model.Mascota;
import com.adopcion.catpidog.model.Usuario;
import com.adopcion.catpidog.repository.AdopcionRepository;
import com.adopcion.catpidog.repository.MascotaRepository;
import com.adopcion.catpidog.repository.UsuarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdopcionServiceImpl implements AdopcionService {
	
	@Autowired
	private AdopcionRepository adopcionRepository;
	
	@Autowired
	private MascotaRepository mascotaRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Adopcion crearAdopcion(AdopcionDTO adopcionDTO) {
		Mascota mascota = mascotaRepository.findById(adopcionDTO.getMascotaId())
				.orElseThrow(() -> new RuntimeException("Mascota no encontrada"));
		
		Usuario usuario = usuarioRepository.findById(adopcionDTO.getUsuarioId())
				.orElseThrow(() -> new RuntimeException("Usuario no econtrado"));
		
		if (!mascota.getDisponible() ) {
			throw new RuntimeException("La mascota no está disponible para adopción");
		}
		
		Adopcion adopcion = new Adopcion();
		adopcion.setMascota(mascota);
		adopcion.setUsuario(usuario);
		
		adopcion.setFechaAdopcion(adopcionDTO.getFechaAdopcion());
		
		mascota.setDisponible(false);
		mascotaRepository.save(mascota);
		
		return adopcionRepository.save(adopcion);
	}
	
	@Override
	public List<Adopcion> obtenerAdopciones() {
		return adopcionRepository.findAll();
	}
	

}
