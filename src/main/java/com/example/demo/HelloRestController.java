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

	
	@GetMapping
	public String hello() {
		log.info("Rest Service Called: serverdatetime {}",Calendar.getInstance().getTime());
		return "Hello From Docker";
	}
	
}
