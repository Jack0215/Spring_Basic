package com.dto;

public class Person {
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Person 기본 생성자 호출");
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Person 인자가 있는 생성자 호출");
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
