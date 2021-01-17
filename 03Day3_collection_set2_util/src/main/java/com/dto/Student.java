package com.dto;

import java.util.List;
import java.util.Set;

public class Student {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// property
	private String name;
	private int age;
	private Set<Cat> set;  // has a 표현
	
	public Student(String name, int age, Set<Cat> set) {
		super();
		this.name = name;
		this.age = age;
		this.set = set;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<Cat> getSetCat() {
		return set;
	}

	public Set<Cat> setSetCat(Set<Cat> set) {
		return this.set = set;
	}

	public String getInfo() {
		return name+age+set;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", listCat=" + set + "]";
	}
	

}
