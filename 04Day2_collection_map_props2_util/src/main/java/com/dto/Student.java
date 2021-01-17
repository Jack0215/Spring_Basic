package com.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.Properties;

public class Student {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// property
	private String name;
	private int age;
	private Map<String, Cat> map;  // has a 표현
	//전화번호(key,value가 모두 문자열로)
	Properties phones;
	
	
	public Student(String name, int age, Map<String, Cat> map) {
		super();
		this.name = name;
		this.age = age;
		this.map = map;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Map<String, Cat> getMapCat() {
		return map;
	}

	public Map<String, Cat> setMapCat(Map<String, Cat> map) {
		return this.map = map;
	}
	
	public Properties getPhones() {
		return phones;
	}
						//매개변수가 Properties라서 stu xml의 id="jdbc"를 받아옴.
	public void setPhones(Properties phones) {
		this.phones = phones;
	}

	public String getInfo() {
		return name+age+map;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", map=" + map + ", phones=" + phones + "]";
	}

	
	

}
