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

	/**
	 * == Springboot 에서 Bean 을 등록하는 순서
	 *
	 * 1. Component Scan
	 * 2. Auto Configuration
	 *
	 * -> Bean 이름이 중복 될 경우 1번이 우선순위를 가짐
	 */

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);


		/**
		 * == 아래처럼 설정하면, Web Application 이 아니기에 바로 종료 된다.
		 */
//		SpringApplication app = new SpringApplication(BootApplication.class);
//		app.setWebApplicationType(WebApplicationType.NONE);


		/**
		 * == 내장 웹 서버의 이해
		 *
		 * Maven:Spring-boot-autoconfiguration
		 * -> spring.factories
		 * -> boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration
		 * -> 서블릿 웹 서버를 설정하는 자동설정 파일
		 */
//		Tomcat tomcat = new Tomcat();
//		tomcat.setPort(8060);
//
//		Context con = tomcat.addContext("/", "/");
//
//		// 서블렛
//		HttpServlet servlet = new HttpServlet() {
//			@Override
//			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//				PrintWriter writer = resp.getWriter();
//				writer.println("<html><head><");
//			}
//		};
//
//		String servletName = "helloServlet";
//		tomcat.addServlet("/", servletName, servlet);
//
//		// 서블렛
//		con.addServletMappingDecoded("/hello", servletName);
//
//		// 톰캣 시작
//		try {
//			tomcat.start();
//		} catch (LifecycleException e) {
//			e.printStackTrace();
//		}
//
//		// 톰캣이 요청을 기다림
//		tomcat.getServer().await();
	}
}
