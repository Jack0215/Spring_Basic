package com.dto;

import java.util.List;

public class Student {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// property
	private String name;
	private int age;
	private List<Cat> listCat;  // has a 표현
	
	public Student(String name, int age, List<Cat> listCat) {
		super();
		this.name = name;
		this.age = age;
		this.listCat = listCat;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Cat> getListCat() {
		return listCat;
	}

	public void setListCat(List<Cat> listCat) {
		this.listCat = listCat;
	}

	public String getInfo() {
		return name+age+listCat;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", listCat=" + listCat + "]";
	}
	

}
