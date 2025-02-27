package com.cristianleicht.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianleicht.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
