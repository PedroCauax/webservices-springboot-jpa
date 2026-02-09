package com.webservice.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.demo.entities.Order;
import com.webservice.demo.repositories.OrderRepository;

@Service
public class OrderService  {
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
	    return orderRepository.findByIdWithItems(id);
	}
}
