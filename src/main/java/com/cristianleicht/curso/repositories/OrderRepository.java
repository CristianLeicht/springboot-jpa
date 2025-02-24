package com.cristianleicht.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianleicht.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
