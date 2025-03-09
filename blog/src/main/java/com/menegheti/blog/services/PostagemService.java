package com.menegheti.blog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menegheti.blog.interfaces.PostagemRepository;

@Service
public class PostagemService {
	
	@Autowired
	private PostagemRepository repo;
	

}
