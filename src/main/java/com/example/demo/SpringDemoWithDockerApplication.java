package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringDemoWithDockerApplication {

	@GetMapping("/meassage")
	public String message() {
		return "Welcome Suresh.. Your First Spring Applicaation..";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoWithDockerApplication.class, args);
	}

}
