package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
//		SpringApplication.run(BootApplication.class, args);
		SpringApplication app = new SpringApplication(BootApplication.class);
		app.addListeners(new SampleListener());
		app.run(args);

	}
}
