package com.pvt.dogpark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DogParkApplication extends SpringBootServletInitializer { // extends WebSecurityConfigurerAdapter {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DogParkApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DogParkApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/goodbye")
	public String goodbye(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Goodbye %s!", name);
	}

	@GetMapping("/Ciao")
	public String ciao(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Ciao %s!", name);
	}

}
