package com.example.demo;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloRestController {

	@GetMapping
	public String hello() {
		System.out.println(Calendar.getInstance().getTime()+ " - Rest Service Called");
		return "Hello From Docker";
	}
	
}
