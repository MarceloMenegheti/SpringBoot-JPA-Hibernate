package com.menegheti.blog.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menegheti.blog.entities.Postagem;
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
	
	public Postagem salvar(Postagem obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public void deletar(int id) {
		buscarPorId(id);
		repo.deleteById(id);
	}
}
