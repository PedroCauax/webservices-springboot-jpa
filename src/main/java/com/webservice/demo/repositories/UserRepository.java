package com.webservice.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.demo.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
}