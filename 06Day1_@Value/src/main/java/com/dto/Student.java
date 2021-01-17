package com.dto;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;


public class Student {
	
	@Value("홍길동")	//초기값 설정
	private String name;
	
	@Value("10") //초기값 설정
	private int age;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}

	public void setName(String name) {
		this.name = name; 
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		System.out.println("toString 생성자");
		return "Student [name=" + name + ", age=" + age + "]";
	}  
	
	
}
