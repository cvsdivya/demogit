package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Dog;

@Repository
public interface DogsRepository extends JpaRepository<Dog, Long> {
	
}

