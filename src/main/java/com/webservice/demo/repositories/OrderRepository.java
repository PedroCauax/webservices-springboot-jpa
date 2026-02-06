package com.webservice.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.demo.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
}