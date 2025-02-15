package com.adopcion.catpidog.service;

import com.adopcion.catpidog.dto.UsuarioDTO;
import com.adopcion.catpidog.model.Usuario;
import com.adopcion.catpidog.repository.UsuarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario crearUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		usuario.setNombre(usuarioDTO.getNombre());
		usuario.setCorreoElectronico(usuarioDTO.getCorreoElectronico());
		usuario.setTelefono(usuarioDTO.getTelefono());
		return usuarioRepository.save(usuario);
	}
	
	@Override
	public List<Usuario> obtenerTodosLosUsuarios() {
		return usuarioRepository.findAll();
	}
	
	@Override
	public boolean delete(Long id) {
		if (usuarioRepository.existsById(id)) {
			usuarioRepository.deleteById(id);
			return true;
		}
		return false;
	}
}
