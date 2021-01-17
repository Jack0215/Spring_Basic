package com.dto;
//cat이 Student에 들어감
public class Cat {
	private String catName;
	private int catAge;
	public Cat(String catName, int catAge) {
		super();
		this.catName = catName;
		this.catAge = catAge;
	}
	
	public String getCatInfo() {
		return catName+"\t"+catAge;
	}
}
