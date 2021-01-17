package com.dto;

//target 클래스 // 핵심로직 구현 클래스
public class Student {
	
	public String sayEcho() {
		System.out.println("1. sayEcho출력");
		return "4. Hello";
	}
	
	public String callEcho() {
		System.out.println("5. callEcho출력");
		return "6. World";
	}
}
