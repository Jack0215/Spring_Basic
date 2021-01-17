package com.dto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Student {
					
	private String name;
	private int age;
	
	@Autowired
	@Qualifier("pet03") //여러 bean 중에서 특정 id를 찾아 값을 가져온다. 
						//aotiwire라서 값이 없으면 오류는 아니고 null
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
