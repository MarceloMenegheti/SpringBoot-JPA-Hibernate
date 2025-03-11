package com.menegheti.blog.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.menegheti.blog.entities.Postagem;
import com.menegheti.blog.services.PostagemService;



@RestController
@RequestMapping(value="/postagem")
public class PostagemController {
	
	@Autowired
	private PostagemService postagemService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Object> salvar(@RequestBody Postagem obj) {
		obj = postagemService.salvar(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Postagem>> buscarTodos() {
		List<Postagem> list = postagemService.buscarTodos();
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Postagem> buscarPorId(@PathVariable Integer id) {
		Postagem obj = postagemService.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Postagem obj,@PathVariable Integer id) {
		obj.setId(id);
		obj = postagemService.editar(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable Integer id) {
		postagemService.deletar(id);
		return ResponseEntity.noContent().build();
		
	}
}
