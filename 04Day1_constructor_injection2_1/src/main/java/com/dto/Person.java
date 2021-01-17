package com.dto;

public class Person {

	public Person(String x) {
		System.out.println("Person 생성자 srt"+ x);
	}
	
	public Person(String x, String y) {
		System.out.println("Person 생성자str str"+ x+"\t"+y);
	}
	public Person(String xx, int yy) {
		System.out.println("Person 생성자str int"+ xx+"\t"+yy);
	}
	public String getInfo() {
		return "이순신";
	}
	
}
