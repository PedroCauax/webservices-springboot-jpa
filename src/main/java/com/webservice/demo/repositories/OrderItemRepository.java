package com.webservice.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.demo.entities.OrderItem;
import com.webservice.demo.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}