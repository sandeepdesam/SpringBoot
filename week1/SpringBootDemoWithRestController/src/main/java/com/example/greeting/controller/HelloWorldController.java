package com.example.greeting.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass()); 
	
	@RequestMapping("/")
	public String helloWorld() {
		LOGGER.info("Main method initiated ");
		LOGGER.debug("after initated ");
		
		return "Hellow World.Welcome to Spring Boot";
	}

}
