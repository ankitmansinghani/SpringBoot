package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class TempClass {

	public String name;

	public TempClass() {
		this.name = "temp";
		System.out.println("Hello " + this.name);
	}
}
