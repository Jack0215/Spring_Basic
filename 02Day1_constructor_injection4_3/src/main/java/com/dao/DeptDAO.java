package com.dao;

import java.util.Arrays;
import java.util.List;

public class DeptDAO {
	//기본생성자 있음(매개변수없는)
	public List<String> list(){
		return Arrays.asList("홍길동","이순신","유관순"); //배열을 리스트로 바꾸는 함수
	}
	
}
