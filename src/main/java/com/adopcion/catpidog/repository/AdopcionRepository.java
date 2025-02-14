package com.adopcion.catpidog.repository;

import com.adopcion.catpidog.model.Adopcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdopcionRepository extends JpaRepository<Adopcion, Long>{
}
