package com.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.Properties;

public class Student implements InitializingBean,DisposableBean{
					//interface의 추상함수를 가져온다.
					//interface는 구현이 되지 않은 추상함수만 선언
					//interface를 사용하는 class에서는  선언된 함수를 override 해줘야함
	private String name;
	private int age;

	public Student() {
		System.out.println("기본생성자호출");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean.destroy");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean.afterPropertiesSet");
	}

}
