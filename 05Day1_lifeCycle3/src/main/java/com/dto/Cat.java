package com.dto;

public class Cat {
	private String CatName;
	private int CatAge;
	
	public void setName(String CatName) {
		this.CatName = CatName;
	}
	public void setAge(int Catage) {
		this.CatAge = Catage;
	}
	
	public String getInfo() {
		return CatName+"\t"+CatAge; 
	}
	
	@Override
	public String toString() {
		return "Cat [CatName=" + CatName + ", CatAge=" + CatAge + "]";
	}
	
	 
}
