package com.dto;

public class Student {
	private String name;
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
	public String getInfo() {
		return name+"\t"+age+"\t";
	}
	
	
}
