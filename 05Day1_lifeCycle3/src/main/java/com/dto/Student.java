package com.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.Properties;

public class Student {
					
	private String name;
	private int age;

	public Student() {
		System.out.println("기본생성자호출");
		// TODO Auto-generated constructor stub
	}
	//어노테이션
	@PostConstruct
	public void xxx() {
		System.out.println("초기화 메서드");
	}
	@PreDestroy
	public void yyy() {
		System.out.println("자원반납 메서드");
	}
}
