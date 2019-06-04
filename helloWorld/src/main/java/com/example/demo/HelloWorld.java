package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorld {
	@Bean(name = "ChamanJinga")
	protected HelloWorld helloWorld() {
		System.out.println("Hellow World");
		return new HelloWorld();

	}


}
