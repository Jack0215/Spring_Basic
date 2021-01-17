package com.dto;

//target 클래스 // 핵심로직 구현 클래스
public class Student {
	
	public String sayEcho() {
		System.out.println("sayEcho출력");
		return "Hello";
	}
	
	public String callEcho() {
		System.out.println("callEcho출력");
		return "World";
	}
}
