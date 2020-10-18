package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BootApplication.class);
		app.addListeners(new ValueUse());
		app.run(args);
	}

}
