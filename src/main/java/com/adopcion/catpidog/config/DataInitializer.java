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
            tipoMascotaRepository.save(new TipoMascota("Perro", "Un compañero leal y juguetón.", "/assets/tipos-mascotas/perro.png", "Una imagen de un perro feliz"));
            tipoMascotaRepository.save(new TipoMascota("Gato", "Independiente y cariñoso a su manera.", "/assets/tipos-mascotas/gato.png", "Una imagen de un gato feliz"));
            tipoMascotaRepository.save(new TipoMascota("Conejo", "Pequeño, suave y muy curioso.", "/assets/tipos-mascotas/conejo.png", "Una imagen de un conejo feliz"));
            tipoMascotaRepository.save(new TipoMascota("Pez", "Tranquilo y colorido habitante acuático.", "/assets/tipos-mascotas/pez.png", "Una imagen de un pez feliz"));
            tipoMascotaRepository.save(new TipoMascota("Roedor", "Pequeños mamíferos activos y divertidos.", "/assets/tipos-mascotas/roedor.png", "Una imagen de un roedor feliz"));
            tipoMascotaRepository.save(new TipoMascota("Pájaro", "Alegre con su canto y plumaje variado.", "/assets/tipos-mascotas/pajaro.png", "Una imagen de un pájaro feliz"));
            tipoMascotaRepository.save(new TipoMascota("Tortuga", "Un reptil tranquilo y de larga vida.", "/assets/tipos-mascotas/tortuga.png", "Una imagen de una tortuga feliz"));
            tipoMascotaRepository.save(new TipoMascota("Réptil", "Variedad de especies fascinantes y únicas.", "/assets/tipos-mascotas/reptil.png", "Una imagen de un reptil feliz"));
            tipoMascotaRepository.save(new TipoMascota("Arácnido", "Criaturas de ocho patas, algunas como mascotas.", "/assets/tipos-mascotas/aracnido.png", "Una imagen de un arácnido feliz"));
            tipoMascotaRepository.save(new TipoMascota("Insecto", "Pequeños seres con comportamientos sorprendentes.", "/assets/tipos-mascotas/insecto.png", "Una imagen de un insecto feliz"));
            tipoMascotaRepository.save(new TipoMascota("Otros", "Otros animales domésticos o de granja.", "/assets/tipos-mascotas/otros.png", "Una imagen con un cerdo feliz, una vaca feliz y una oveja feliz"));
        }
    }
}
