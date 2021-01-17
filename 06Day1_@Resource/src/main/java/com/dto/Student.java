package com.dto;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;


public class Student {
					
	private String name;
	private int age;
	
	@Resource (name= "cat1") // 여러개의 bean 중에 name이 일치하는 것을 받아온다. 
							 // Qualifier와 같은 기능이다.
							 // name=cat1이 없으면 오류 발생
	private Cat cat; 
	
	
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
	
	public void setCat(Cat cat) {
		this.cat = cat;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		System.out.println("toString 생성자");
		return "Student [name=" + name + ", age=" + age + ", cat=" + cat + "]";
	}  
	
	
}
