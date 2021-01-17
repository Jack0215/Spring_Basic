package com.dto;

public class Man {
	private String Name;
	private int Age;
	private String address;
	public Man() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Man(String name, int age, String address) {
		super();
		Name = name;
		Age = age;
		this.address = address;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setAge(int age) {
		Age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Man [Name=" + Name + ", Age=" + Age + ", address=" + address + "]";
	}
	 
	
	 
}
