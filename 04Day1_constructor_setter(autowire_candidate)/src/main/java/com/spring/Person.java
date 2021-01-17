package com.spring;

public class Person {

	private String username;
	Cat cat1; 
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String username, Cat cat1) {
		super();
		this.username = username;
		this.cat1 = cat1;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Cat getCat() {
		return cat1;
	}				    //  ↓ set함수의 매개변수의 이름과 같은 id를 가진
						//객체를 주입받음
	public void setCat(Cat cat1) {
		this.cat1 = cat1;
	}
	@Override
	public String toString() {
		return "Person [username=" + username + ", cat=" + cat1 + "]";
	}
	
}
