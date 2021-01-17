package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;

public class DeptService extends Object{
	
	@Autowired
	DeptDAO dao;
	
	
	public DeptService () {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptService(DeptDAO dao) {
		super();
		this.dao = dao;
	}
	
	
	public List<String> list (){
		return dao.list();
	}
}
