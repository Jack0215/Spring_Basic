package com.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
@RequestMapping("/header") 
//header의 이름만 가져와서 keys로 저장
public String xxx(HttpServletRequest request) {
	Enumeration<String> keys = request.getHeaderNames(); //헤더정보의 전체 키값만 얻기
	while(keys.hasMoreElements()) { //다음 키값이 있는지 검사
		String key = keys.nextElement(); //하나의 키값 얻기
		String value = request.getHeader(key); //하나의 키에 해당하는 정보 얻기
		System.out.println(key+"\t"+value); //키와 정보 출력
	}
	return "hello";
}
}
