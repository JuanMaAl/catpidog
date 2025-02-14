package com.adopcion.catpidog.service;

import com.adopcion.catpidog.dto.UsuarioDTO;
import com.adopcion.catpidog.model.Usuario;

public interface UsuarioService {
	Usuario crearUsuario(UsuarioDTO usuarioDTO);
}
