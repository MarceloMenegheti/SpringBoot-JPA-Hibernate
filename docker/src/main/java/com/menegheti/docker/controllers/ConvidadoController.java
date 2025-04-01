package com.menegheti.docker.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menegheti.docker.entity.Convidado;

@RestController
@RequestMapping("/")
public class ConvidadoController {
	
	@GetMapping
	public List<Convidado> getConvidados(){
		List<Convidado> list = new ArrayList<>();
		list.add(new Convidado("Fulano","3345336-78"));
		list.add(new Convidado("Ciclano","55335656-78"));
		return list;
	}
}
