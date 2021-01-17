package com.dao;

import java.util.Arrays;
import java.util.List;

public class DeptDAO {
	//기본생성자 있음(매개변수없는)
	
	public List<String> list(){
		return Arrays.asList("홍길동","이순신","유관순");
	}
	//dao.xml에서 bean을 통해 id, class 만들어야함.
}
