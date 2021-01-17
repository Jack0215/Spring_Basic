package com.spring;

public class Person {

	private String username;
	Cat cat; 
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String username, Cat cat) {
		super();
		this.username = username;
		this.cat = cat;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Cat getCat() {
		return cat;
	}				    //  ↓ set함수의 매개변수의 이름과 같은 id를 가진
						//객체를 주입받음
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "Person [username=" + username + ", cat=" + cat + "]";
	}
	
}
