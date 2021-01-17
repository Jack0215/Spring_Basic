package com.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.Properties;

public class Student {
	
	private String name;
	private int age;

	public Student() {
		System.out.println("기본생성자호출");
		// TODO Auto-generated constructor stub
	}
	//init method: 초기화 작업
	public void aaa() {
		System.out.println("init-method.aaa");
		this.name ="홍길동";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	//destroy-method: 자원 반납
	public void bbb() {
		System.out.println("destroy-method.bbb");
	}

}
