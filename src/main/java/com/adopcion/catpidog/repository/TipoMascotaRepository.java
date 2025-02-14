package com.adopcion.catpidog.repository;

import com.adopcion.catpidog.model.TipoMascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoMascotaRepository extends JpaRepository<TipoMascota, Long>{

}
