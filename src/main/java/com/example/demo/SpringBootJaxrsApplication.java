package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //Container spring
public class SpringBootJaxrsApplication {

	public static void main(String[] args) {
		System.out.println("Dans le main");
		SpringApplication.run(SpringBootJaxrsApplication.class, args);
	}

}
