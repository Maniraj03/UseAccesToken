package com.mani.SimpleWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebAppApplication.class, args);
		System.out.println("Hi I am here");
	}

}
