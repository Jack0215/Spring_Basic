package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	
	DeptDAO dao;
	
	private String driver;
	private String url;
	private String userid;
	private String passwd;
	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//dao 소환
 	public DeptService(DeptDAO dao) {
		this.dao = dao;
		// TODO Auto-generated constructor stub
	}
	public DeptService(DeptDAO dao, String driver, String url, String userid, String passwd) {
		super();
		this.dao = dao;
		this.driver = driver;
		this.url = url;
		this.userid = userid;
		this.passwd = passwd;
	}
	public DeptDAO getDao() {
		return dao;
	}
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "DeptService [dao=" + dao + ", driver=" + driver + ", url=" + url + ", userid=" + userid + ", passwd="
				+ passwd + "]";
	}
	
	public List<String> list (){
		return dao.list(); 
	}
	
}
