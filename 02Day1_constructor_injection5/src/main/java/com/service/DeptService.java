package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	DeptDAO dao; //new가 사라지고 .xml에서 주입
	
	public DeptService(DeptDAO dao) { //생성된 DeptDAO 빈을 생성자를 통해 주입받음
		this.dao = dao;
	}
	public List<String> list(){
		return dao.list();
	}
}
