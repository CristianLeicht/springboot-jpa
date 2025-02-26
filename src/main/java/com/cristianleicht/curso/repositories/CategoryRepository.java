package com.cristianleicht.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianleicht.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
