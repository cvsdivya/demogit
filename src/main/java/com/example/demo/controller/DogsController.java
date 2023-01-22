package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Dog;
import com.example.demo.model.Tutorial;
import com.example.demo.service.impl.DogsService;

@RestController
@RequestMapping("/dogapi")
public class DogsController {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(DogsController.class);

	
	@Autowired
	DogsService dogsService;
	
	
	 @PostMapping("/createdog")
	  public ResponseEntity<Dog> createDog(@RequestBody Dog dog) {
	    try {
	    	LOGGER.info("Create dog..........");
	    	LOGGER.debug("debug Create dog..........");

	    	//dog= dogsService.add(dog);
	      return new ResponseEntity<Dog>(dogsService.add(dog), HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }

}
