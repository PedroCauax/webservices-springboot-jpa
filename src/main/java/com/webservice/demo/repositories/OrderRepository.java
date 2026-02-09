package com.webservice.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.webservice.demo.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	@Query("SELECT o FROM Order o JOIN FETCH o.items WHERE o.id = :id")
    Order findByIdWithItems(@Param("id") Long id);
}