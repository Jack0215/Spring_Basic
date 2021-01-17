package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	DeptDAO dao; //new가 사라지고 .xml에서 주입
	//setDriver, setUrl, SetUserid, Setpasswd 구현
	//jdbc.properties 파일에서 4가지 정보를 일거와서 perperty로 설정
	//main에서 service에 저장된 4가지 정보를 출력
	//main에서 dao의 list()호출 데이터 출력
	
	//com/config/properties의 정보를 가져와 service에서 사용한다.
	String driver;
	String url;
	String userid;
	String passwd;
	//얘를 어떻게 넣어줬는가???
	//DeptDAO를 받고있는 생성자를 만들고, 이 전에서는 constructor를 통해 만들었음
	
	public DeptService() {
		super();
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
		return "DeptService [driver=" + driver + ", url=" + url + ", userid=" + userid + ", passwd=" + passwd + "]";
	}

	//dao를 받을 수 있는 생성자
	public DeptService(DeptDAO dao) { //생성된 DeptDAO 빈을 생성자를 통해 주입받음
		this.dao = dao;       //↑ xml args의 name이 됨
		System.out.println("DeptService 생성자 호출됨===");
	}
	
	public List<String> list(){
		System.out.println("DeptSerivce list() 호출됨===");
		return dao.list(); //dao에 있는 매서드 반환
	}
	
}
