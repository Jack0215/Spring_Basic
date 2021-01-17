package com.dto;

public class Cat {
	private String CatName;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String catName) {
		super();
		CatName = catName;
	}

	public String getCatName() {
		return CatName;
	}

	public void setCatName(String catName) {
		CatName = catName;
	}

	@Override
	public String toString() {
		return "Cat [CatName=" + CatName + "]";
	}

	public String getCatInfo() {
		return CatName;
	}
	
}
