package com.dto;

public class Student {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// property
	private String name;
	private int age;

	// setter injection
	public void setName(String name) {
		this.name = name;
	}
	
	//constructor injection
	public void setAge(int age) {
		this.age = age;
	}

	public String getInfo() {
		return name + "\t" + age;
	}

}
