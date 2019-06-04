package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CallerComponent {

	private TempClass classx;

	public TempClass getClass1() {
		System.out.println("No i won't change veriable name");
		return classx;
	}

	@Autowired
	public void setClass1(TempClass class1) {
		this.classx = class1;
	}
	
}
