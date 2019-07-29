package com.mvit.json001.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvit.json001.dao.DaoImpl;
import com.mvit.json001.model.Usuario;


/**
 * @author vemf
 *
 */
@RestController
public class UsuarioController {

	@Autowired
	private DaoImpl dao;

	@GetMapping(value = "/getAllUsers")
	public List<Usuario> getAllUsuario() {
		List<Usuario> prodList = new ArrayList<Usuario>();

		prodList = dao.getAllUsuarios();
		return prodList;
	}

	@GetMapping("/getUsuario/{UsuarioId}")
	public Usuario getArticleDetail(@PathVariable Integer UsuarioId) {
		Usuario prod = null;

		prod = dao.getUsuario(UsuarioId);
		
		return prod;
	}

	@PostMapping(value = "/addUsuario")
	public Usuario addUsuario(@RequestBody Usuario Usuario) {
		dao.addUsuario(Usuario);
		return Usuario;

	}

}
