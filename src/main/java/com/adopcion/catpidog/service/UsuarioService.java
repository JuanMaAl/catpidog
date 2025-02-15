package com.adopcion.catpidog.service;

import java.util.List;

import com.adopcion.catpidog.dto.UsuarioDTO;
import com.adopcion.catpidog.model.Usuario;

public interface UsuarioService {
	Usuario crearUsuario(UsuarioDTO usuarioDTO);
	List<Usuario> obtenerTodosLosUsuarios();
}
