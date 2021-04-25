package com.springboot.project.embeddedserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmbeddedServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmbeddedServerApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		
		return "Hello SpringBoot project";
		
	}

}
