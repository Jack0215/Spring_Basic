package com.dto;


import org.springframework.beans.factory.annotation.Autowired;


public class Student {
					
	private String name;
	private int age;
	
	@Autowired(required = false)//주입을 받을 때 bean이 없으면 null로 받겠다.
	private Cat cat; //has a 표현 by type

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Cat cat) {
		this.cat = cat;
	}
	
	public Student(String name, int age, Cat cat) {
		super();
		this.name = name;
		this.age = age;
		this.cat = cat;
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
		return "Student [name=" + name + ", age=" + age + ", cat=" + cat + "]";
	}  
	
	
}
