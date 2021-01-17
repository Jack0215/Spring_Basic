package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.dao.DeptDAO;

public class Service {
	@Autowired
	DeptDAO dao;
	@Value("${driver}")
	String driver;
	@Value("${url}")
	String url;
	@Value("${userid}")
	String userid;
	@Value("${passwd}")
	String tiger;
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service(String driver, String url, String userid, String tiger) {
		super();
		this.driver = driver;
		this.url = url;
		this.userid = userid;
		this.tiger = tiger;
	}
	@Override
	public String toString() {
		return "Service [driver=" + driver + ", url=" + url + ", userid=" + userid + ", tiger=" + tiger + "]";
	}
	
	public List<String> list(){
		return dao.list();
	}
}
