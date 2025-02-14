package com.adopcion.catpidog.repository;

import com.adopcion.catpidog.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
