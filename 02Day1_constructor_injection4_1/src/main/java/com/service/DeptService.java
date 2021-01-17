package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	DeptDAO dao; //new가 사라지고 .xml에서 주입
	//setDriver, setUrl, SetUserid, Setpasswd 구현
	//jdbc.properties 파일에서 4가지 정보를 일거와서 perperty로 설정
	//main에서 service에 저장된 4가지 정보를 출력
	
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
