package com.dto;

public class Student {
	private String name;
	
	public Student() {
		System.out.println("기본생성자 함수 호출 ==");
	} // Bean에서 사용할 수 있음
	
	public Student(String name) {
		this.name = name;
	} //main에서 args로 해서 사용할 수 있음

	//property
	public void setName(String name) {
		System.out.println("setName 함수 호출 ==");
		this.name = name;
		
	}

	public String getInfo() {
		return name;
	}
	
	
}
