package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker")
public class UserLoginRestController {

	private static final Logger log = LoggerFactory.getLogger(UserLoginRestController.class);

	@PostMapping("/login")
	@ResponseBody
	public User userLogin(@RequestBody User user) {

		log.info("User Id: {}", user.getUserId());
		log.info("Password: {}", user.getPassword());

		user.setLoginMessage("Logged in successfully !");
		user.setName("Saanvi Roy Choudhury");
		user.setAge(18);
		log.info("User Object Details: {}", user);
		
		return user;

	}

}