package com.dto;

public class Student {
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	//property
	private String name;
	private	int a;
	
	public Student(String name) {
		this.name = name;
	} //main에서 args로 해서 사용할 수 있음

	// setter injection
	public void setName(String name) {
		this.name = name;
	}
			 //property에서는 ↓ 파라미터 이름을 찾아간다.
	public void setAge(int a) { 
		this.a = a;
	}

	public String getInfo() {
		return name+"\t"+a; 
	}
	
}
