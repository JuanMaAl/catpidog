package com.adopcion.catpidog.config;

import com.adopcion.catpidog.model.TipoMascota;
import com.adopcion.catpidog.repository.TipoMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
	
	@Autowired
	private TipoMascotaRepository tipoMascotaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		if (tipoMascotaRepository.count() == 0) {
			tipoMascotaRepository.save(new TipoMascota("Perro"));
			tipoMascotaRepository.save(new TipoMascota("Gato"));
			tipoMascotaRepository.save(new TipoMascota("Conejo"));
			tipoMascotaRepository.save(new TipoMascota("Pez"));
			tipoMascotaRepository.save(new TipoMascota("Roedor"));
			tipoMascotaRepository.save(new TipoMascota("Pájaro"));
			tipoMascotaRepository.save(new TipoMascota("Tortuga"));
			tipoMascotaRepository.save(new TipoMascota("Réptil"));
			tipoMascotaRepository.save(new TipoMascota("Arácnido"));
			tipoMascotaRepository.save(new TipoMascota("Insecto"));
			tipoMascotaRepository.save(new TipoMascota("Otros"));
		}
	}

}
