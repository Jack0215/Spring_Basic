package com.dto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Student {
					
	private String name;
	private int age;
	
	@Autowired  //class type과 같은 걸 받아온다.
	
	private Cat cat; //has a 표현 //CoC변수와 같은 객체 주입
	
			//변수의 이름을 cat을 걸어놔서 변수의 이름과
			//똑같은 id를 가진 bean을 가져오는 개념이 CoC이다.
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Cat cat) {
		this.cat = cat;
	}
	
	public Student(String name, int age, Cat cat) {
		super();
		this.name = name;
		this.age = age;
		this.cat = cat;
	}

	public void setName(String name) {
		this.name = name; 
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		System.out.println("toString 생성자");
		return "Student [name=" + name + ", age=" + age + ", cat=" + cat + "]";
	}  
	
	
}
