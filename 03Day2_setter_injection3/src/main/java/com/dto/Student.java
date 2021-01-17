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
	public Student(int age) {
		this.age = age;
	} // main에서 args로 해서 사용할 수 있음

	public String getInfo() {
		return name + "\t" + age;
	}

}
