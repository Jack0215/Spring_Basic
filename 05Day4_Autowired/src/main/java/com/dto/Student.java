package com.dto;


import org.springframework.beans.factory.annotation.Autowired;


public class Student {
					
	private String name;
	private int age;
	
	@Autowired //자동주입받게끔 하겠다. xml에서 Bean을 쓰지 않음 //has a 표현 //by type
	private Cat cat;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Cat cat) {
		System.out.println("Cat을 변수로 넣은 생성자");
		this.cat = cat;
		// TODO Auto-generated constructor stub
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
