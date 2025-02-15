package com.adopcion.catpidog.controller;

import com.adopcion.catpidog.dto.UsuarioDTO;
import com.adopcion.catpidog.model.Usuario;
import com.adopcion.catpidog.service.UsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping
	public ResponseEntity<Usuario>
	registrarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
		Usuario nuevoUsuario = usuarioService.crearUsuario(usuarioDTO);
		return ResponseEntity.status(201).body(nuevoUsuario);
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>>
	obtenerTodosLosUsuarios() {
		List<Usuario> usuarios = usuarioService.obtenerTodosLosUsuarios();
		usuarioService.obtenerTodosLosUsuarios();
		return ResponseEntity.ok(usuarios);
	}
}