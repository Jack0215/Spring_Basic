package com.dto;

public class Student {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// property
	private String name;
	private int age;
	private Cat cat;
	// setter injection
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public String getInfo() {
		return name+"\t"+age+"\t"+cat.getInfo();
	}

}
