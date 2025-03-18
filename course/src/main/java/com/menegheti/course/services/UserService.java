package com.menegheti.course.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.menegheti.course.repositories.UserRepository;

public class UserService {
	
	@Autowired
	private UserRepository repository;
	

}
