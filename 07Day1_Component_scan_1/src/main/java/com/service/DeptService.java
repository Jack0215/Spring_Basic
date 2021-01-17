package com.service;

import org.springframework.stereotype.Component;

@Component //<context:component-scan> 속성을 통해 xml에 자동으로 값이 입력된다.
		   //xml에서 생성해서 불러오던 방식과 반대다.
public class DeptService {
	public String getService() {
		return "DeptService.getService() 호출됨";
	}
} 
