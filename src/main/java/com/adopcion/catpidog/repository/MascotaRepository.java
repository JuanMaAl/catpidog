package com.adopcion.catpidog.repository;

import com.adopcion.catpidog.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaRepository extends JpaRepository<Mascota,Long>{
}