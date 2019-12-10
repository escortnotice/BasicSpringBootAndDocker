package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class BasicSpringBootAndDockerApplication {

	@Value("#{'${allowedOrigins:*}'.split(',')}")
	private List<String> allowedOrigins;
	
	public static void main(String[] args) {
		SpringApplication.run(BasicSpringBootAndDockerApplication.class, args);
	}

	//Enable CORS
	@Bean
	public CorsFilter corsFilter() {
		//NOTES:  THIS IS NEEDED FOR STAND ALONE SWAGGER UI
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.setAllowedOrigins(allowedOrigins);
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");

		source.registerCorsConfiguration("/*/**", config);
		return new CorsFilter(source);
	}
}
