package com.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// property
	private String name;
	private int age;
	private Map<String, Cat> map;  // has a 표현
	
	public Student(String name, int age, Map<String, Cat> map) {
		super();
		this.name = name;
		this.age = age;
		this.map = map;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Map<String, Cat> getMapCat() {
		return map;
	}

	public Map<String, Cat> setMapCat(Map<String, Cat> map) {
		return this.map = map;
	}

	public String getInfo() {
		return name+age+map;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", listCat=" + map + "]";
	}
	

}
