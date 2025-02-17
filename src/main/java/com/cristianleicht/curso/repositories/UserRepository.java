package com.cristianleicht.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianleicht.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
