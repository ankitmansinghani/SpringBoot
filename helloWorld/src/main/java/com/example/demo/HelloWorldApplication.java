package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorld.class);
		HelloWorld helloWorld = (HelloWorld) context.getBean("ChamanJinga");
		
	}
	
}
