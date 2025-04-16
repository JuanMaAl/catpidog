package com.adopcion.catpidog.config;

import com.adopcion.catpidog.model.Mascota;
import com.adopcion.catpidog.model.TipoMascota;
import com.adopcion.catpidog.repository.MascotaRepository;
import com.adopcion.catpidog.repository.TipoMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private TipoMascotaRepository tipoMascotaRepository;

    @Autowired
    private MascotaRepository mascotaRepository;

    @Override
    public void run(String... args) throws Exception {
        // Inicializar tipos de mascota si no existen
        if (tipoMascotaRepository.count() == 0) {
            TipoMascota perroTipo = new TipoMascota("Perro", "Un compañero leal y juguetón.", "/assets/tipos-mascotas/perro.png", "Una imagen de un perro feliz");
            TipoMascota gatoTipo = new TipoMascota("Gato", "Independiente y cariñoso a su manera.", "/assets/tipos-mascotas/gato.png", "Una imagen de un gato feliz");
            TipoMascota conejoTipo = new TipoMascota("Conejo", "Pequeño, suave y muy curioso.", "/assets/tipos-mascotas/conejo.png", "Una imagen de un conejo feliz");
            TipoMascota pezTipo = new TipoMascota("Pez", "Tranquilo y colorido habitante acuático.", "/assets/tipos-mascotas/pez.png", "Una imagen de un pez feliz");
            TipoMascota roedorTipo = new TipoMascota("Roedor", "Pequeños mamíferos activos y divertidos.", "/assets/tipos-mascotas/roedor.png", "Una imagen de un roedor feliz");
            TipoMascota pajaroTipo = new TipoMascota("Pájaro", "Alegre con su canto y plumaje variado.", "/assets/tipos-mascotas/pajaro.png", "Una imagen de un pájaro feliz");
            TipoMascota tortugaTipo = new TipoMascota("Tortuga", "Un reptil tranquilo y de larga vida.", "/assets/tipos-mascotas/tortuga.png", "Una imagen de una tortuga feliz");
            TipoMascota reptilTipo = new TipoMascota("Réptil", "Variedad de especies fascinantes y únicas.", "/assets/tipos-mascotas/reptil.png", "Una imagen de un reptil feliz");
            TipoMascota aracnidoTipo = new TipoMascota("Arácnido", "Criaturas de ocho patas, algunas como mascotas.", "/assets/tipos-mascotas/aracnido.png", "Una imagen de un arácnido feliz");
            TipoMascota insectoTipo = new TipoMascota("Insecto", "Pequeños seres con comportamientos sorprendentes.", "/assets/tipos-mascotas/insecto.png", "Una imagen de un insecto feliz");
            TipoMascota otrosTipo = new TipoMascota("Otros", "Otros animales domésticos o de granja.", "/assets/tipos-mascotas/otros.png", "Una imagen con un cerdo feliz, una vaca feliz y una oveja feliz");

            tipoMascotaRepository.saveAll(List.of(perroTipo, gatoTipo, conejoTipo, pezTipo, roedorTipo, pajaroTipo, tortugaTipo, reptilTipo, aracnidoTipo, insectoTipo, otrosTipo));
        }

        // Inicializar mascotas si no existen
        if (mascotaRepository.count() == 0) {
            TipoMascota perroTipo = tipoMascotaRepository.findByNombre("Perro").orElse(null);
            TipoMascota gatoTipo = tipoMascotaRepository.findByNombre("Gato").orElse(null);
            TipoMascota conejoTipo = tipoMascotaRepository.findByNombre("Conejo").orElse(null);
            TipoMascota pezTipo = tipoMascotaRepository.findByNombre("Pez").orElse(null);
            TipoMascota roedorTipo = tipoMascotaRepository.findByNombre("Roedor").orElse(null);
            TipoMascota pajaroTipo = tipoMascotaRepository.findByNombre("Pájaro").orElse(null);
            TipoMascota tortugaTipo = tipoMascotaRepository.findByNombre("Tortuga").orElse(null);
            TipoMascota reptilTipo = tipoMascotaRepository.findByNombre("Réptil").orElse(null);
            TipoMascota aracnidoTipo = tipoMascotaRepository.findByNombre("Arácnido").orElse(null);
            TipoMascota insectoTipo = tipoMascotaRepository.findByNombre("Insecto").orElse(null);
            TipoMascota otrosTipo = tipoMascotaRepository.findByNombre("Otros").orElse(null);

            if (perroTipo != null) {
                mascotaRepository.save(new Mascota("Buddy", 3, true, "Un labrador dorado muy amigable y le encanta jugar.", "/assets/mascotas/perro/buddy.jpg", "Un labrador dorado feliz", perroTipo));
                mascotaRepository.save(new Mascota("Max", 5, true, "Un pastor alemán atento y protector.", "/assets/mascotas/perro/max.jpg", "Un pastor alemán atento", perroTipo));
                mascotaRepository.save(new Mascota("Luna", 2, false, "Una beagle juguetona y curiosa, siempre olfateando.", "/assets/mascotas/perro/luna.jpg", "Una beagle juguetona", perroTipo));
            }

            if (gatoTipo != null) {
                mascotaRepository.save(new Mascota("Milo", 1, true, "Un siamés elegante y con una personalidad vocal.", "/assets/mascotas/gato/milo.jpg", "Un siamés elegante", gatoTipo));
                mascotaRepository.save(new Mascota("Cleo", 4, true, "Una persa tranquila y de pelaje suave, ideal para un hogar calmado.", "/assets/mascotas/gato/cleo.jpg", "Una persa tranquila", gatoTipo));
                mascotaRepository.save(new Mascota("Simba", 2, false, "Un maine coon grande y curioso, le encanta explorar.", "/assets/mascotas/gato/simba.jpg", "Un maine coon curioso", gatoTipo));
            }

            if (conejoTipo != null) {
                mascotaRepository.save(new Mascota("Coco", 1, true, "Un conejo enano adorable y fácil de cuidar.", "/assets/mascotas/conejo/coco.jpg", "Un conejo enano adorable", conejoTipo));
                mascotaRepository.save(new Mascota("Nieve", 2, true, "Un conejo blanco suave y tranquilo, perfecto para niños.", "/assets/mascotas/conejo/nieve.jpg", "Un conejo blanco suave", conejoTipo));
            }

            if (pezTipo != null) {
                mascotaRepository.save(new Mascota("Nemo", 1, true, "Un pez payaso alegre y activo, ideal para un acuario comunitario.", "/assets/mascotas/pez/nemo.jpg", "Un pez payaso alegre", pezTipo));
                mascotaRepository.save(new Mascota("Dory", 2, true, "Un pez cirujano azul amigable y curioso.", "/assets/mascotas/pez/dory.jpg", "Un pez cirujano azul amigable", pezTipo));
            }

            if (roedorTipo != null) {
                mascotaRepository.save(new Mascota("Jerry", 1, true, "Un hámster dorado juguetón, perfecto para observar.", "/assets/mascotas/roedor/jerry.jpg", "Un hámster dorado juguetón", roedorTipo));
                mascotaRepository.save(new Mascota("Stuart", 2, true, "Un ratón aventurero y listo.", "/assets/mascotas/roedor/stuart.jpg", "Un ratón aventurero", roedorTipo));
            }

            if (pajaroTipo != null) {
                mascotaRepository.save(new Mascota("Rio", 2, true, "Un guacamayo colorido y sociable.", "/assets/mascotas/pajaro/rio.jpg", "Un guacamayo colorido", pajaroTipo));
                mascotaRepository.save(new Mascota("Kiwi", 1, true, "Un periquito parlanchín y fácil de domesticar.", "/assets/mascotas/pajaro/kiwi.jpg", "Un periquito parlanchín", pajaroTipo));
            }

            if (tortugaTipo != null) {
                mascotaRepository.save(new Mascota("Sheldon", 10, true, "Una tortuga terrestre sabia y de bajo mantenimiento.", "/assets/mascotas/tortuga/sheldon.jpg", "Una tortuga terrestre sabia", tortugaTipo));
                mascotaRepository.save(new Mascota("Crush", 50, true, "Una tortuga marina relajada y longeva.", "/assets/mascotas/tortuga/crush.jpg", "Una tortuga marina relajada", tortugaTipo));
            }

            if (reptilTipo != null) {
                mascotaRepository.save(new Mascota("Pascal", 1, true, "Un camaleón curioso y con la habilidad de cambiar de color.", "/assets/mascotas/reptil/pascal.jpg", "Un camaleón curioso", reptilTipo));
                mascotaRepository.save(new Mascota("Monty", 3, true, "Una serpiente de maíz tranquila y de colores atractivos.", "/assets/mascotas/reptil/monty.jpg", "Una serpiente de maíz tranquila", reptilTipo));
            }

            if (aracnidoTipo != null) {
                mascotaRepository.save(new Mascota("Lucas", 1, true, "Una araña saltarina amigable y activa.", "/assets/mascotas/aracnido/lucas.jpg", "Una araña saltarina amigable", aracnidoTipo));
                mascotaRepository.save(new Mascota("Charlotte", 2, false, "Una araña de jardín inteligente y útil para el control de plagas.", "/assets/mascotas/aracnido/charlotte.jpg", "Una araña de jardín inteligente", aracnidoTipo));
            }

            if (insectoTipo != null) {
                mascotaRepository.save(new Mascota("Mantis", 1, true, "Una mantis religiosa observadora y fascinante.", "/assets/mascotas/insecto/mantis.jpg", "Una mantis religiosa observadora", insectoTipo));
                mascotaRepository.save(new Mascota("Flynn", 1, true, "Una mariquita con suerte y de colores vibrantes.", "/assets/mascotas/insecto/flynn.jpg", "Una mariquita con suerte", insectoTipo));
            }

            if (otrosTipo != null) {
                mascotaRepository.save(new Mascota("Wilbur", 2, true, "Un cerdo cariñoso e inteligente.", "/assets/mascotas/otros/wilbur.jpg", "Un cerdo cariñoso", otrosTipo));
                mascotaRepository.save(new Mascota("Daisy", 4, true, "Una vaca tranquila y de buen temperamento.", "/assets/mascotas/otros/daisy.jpg", "Una vaca tranquila", otrosTipo));
                mascotaRepository.save(new Mascota("Shaun", 1, true, "Una oveja traviesa y juguetona.", "/assets/mascotas/otros/shaun.jpg", "Una oveja traviesa", otrosTipo));
            }
        }
    }
}