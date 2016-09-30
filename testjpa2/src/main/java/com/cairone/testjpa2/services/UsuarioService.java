package com.cairone.testjpa2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cairone.testjpa2.entities.UsuarioEntity;
import com.cairone.testjpa2.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired private UsuarioRepository usuarioRepository = null;
	
	public Iterable<UsuarioEntity> buscarTodos() {
		return usuarioRepository.findAll();
	}
}
