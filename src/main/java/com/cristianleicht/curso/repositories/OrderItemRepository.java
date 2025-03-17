package com.cristianleicht.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianleicht.curso.entities.OrderItem;
import com.cristianleicht.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
