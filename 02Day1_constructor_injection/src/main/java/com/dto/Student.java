package com.dto;

public class Student {
	private String name;
	public Student() {};
	public Student(String name) { //기본생성자를 인위적으로 만들면
							   //jdk가 만든 public Student(){} 파라미터가 없는 기본생성자는 사라짐
		System.out.println("인자있는 생성자");
		this.name=name; 
	}
	public String getInfo() {
		return name;
	}
}
