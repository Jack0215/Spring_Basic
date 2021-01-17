package com.dto;

public class Student {
	private String name;
	private int age;
	private Cat cat;
	public Student(String name, int age, com.dto.Cat cat) {
		super();
		this.name = name;
		this.age = age;
		this.cat = cat;
	}
	public String getInfo() {
		return name+"\t"+age+"\t"+cat.getCatInfo();
	}
	public String getInfo2() {
		return cat.getCatInfo();
	}
	
}
