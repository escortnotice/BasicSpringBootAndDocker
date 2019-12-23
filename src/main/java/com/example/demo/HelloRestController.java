package com.example.demo;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloRestController {

	
	private static final Logger log = LoggerFactory.getLogger(HelloRestController.class);
	private static final String WELCOME_MESSAGE = "Bonjour !!";
	
	@GetMapping
	public String hello() {
		log.info("/Hello Rest Service Called with welcome message " + WELCOME_MESSAGE + " at serverdatetime {}",Calendar.getInstance().getTime());
		return  WELCOME_MESSAGE + " /Hello Rest Service";
	}
	
}
