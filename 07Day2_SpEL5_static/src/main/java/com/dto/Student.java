package com.dto;

public class Student {
	
	private String name;
	private int age;
	private boolean isMarried;
	private double weight;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, boolean isMarried, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.isMarried = isMarried;
		this.weight = weight;
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
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", isMarried=" + isMarried + ", weight=" + weight + "]";
	}
	
	public String xxx() {
		return "HongGilDong";
	}
	
	
}
