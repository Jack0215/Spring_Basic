package com.dto;

public class Student {
	private String name;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Student 기본 생성자 호출");
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Student 인자가 있는 생성자 호출");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
