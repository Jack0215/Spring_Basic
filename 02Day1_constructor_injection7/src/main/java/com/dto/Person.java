package com.dto;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	private Cat CatName;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String gender, com.dto.Cat catName) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		CatName = catName;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Cat getCatName() {
		return CatName;
	}
	public void setCatName(Cat catName) {
		CatName = catName;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", CatName=" + CatName + "]";
	}
	
	public String getInfo() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", CatName=" + CatName + "]";
	}
	
	
	
}
