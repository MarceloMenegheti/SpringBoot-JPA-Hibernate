package com.menegheti.course.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menegheti.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@GetMapping
	public ResponseEntity<User> findAll(){
	User u = new User(1L,"marcelo","marcelo@gmail.com","1999233244","spring123");
	return ResponseEntity.ok().body(u);
	}
}
