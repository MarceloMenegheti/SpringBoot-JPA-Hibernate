package com.menegheti.blog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menegheti.blog.interfaces.PostagemRepository;

@Service
public class PostagemService {
	
	@Autowired
	private PostagemRepository repo;
	
	public List<Postagem> buscarTodos(){
		return repo.findAll();
	}
	
	public Postagem buscarPorId(int id) {
		Optional<Postagem> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjetoNaoEncontrado(
				"Objeto nao encontrado! Id: " + id + ", tipo: " + Postagem.class.getName()));
	}
}
