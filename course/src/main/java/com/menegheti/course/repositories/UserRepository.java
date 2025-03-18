package com.menegheti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.menegheti.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
