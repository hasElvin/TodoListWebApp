package com.example.springboot.todolistwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebAppApplication.class, args);
	}

	public static void testMethod() {
		System.out.println("nothing");
	}
}
