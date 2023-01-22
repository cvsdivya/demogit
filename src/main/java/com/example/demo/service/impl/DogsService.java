package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dog;
import com.example.demo.repository.DogsRepository;

@Service
public class DogsService {
	
	 @Autowired 
	 DogsRepository repository;

	    public Dog add(Dog dto) {
	        return repository.save(dto);
	    }

	    public void delete(long id) {
	        repository.deleteById(id);
	    }

	    public List<Dog> getDogs() {
	        return (List<Dog>) repository.findAll();
	    }

		/*
		 * public Dog getDogById(long id) { Optional<Dog> optionalDog =
		 * repository.findById(id); return optionalDog.orElseThrow(() -> new
		 * DogNotFoundException("Couldn't find a Dog with id: " + id)); }
		 */
}
