package com.adopcion.catpidog.repository;

import com.adopcion.catpidog.model.TipoMascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoMascotaRepository extends JpaRepository<TipoMascota, Long> {

    Optional<TipoMascota> findByNombre(String nombre);
}