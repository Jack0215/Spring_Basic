package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello") //클래스 주소를 추가시킨다.
public class HelloConrtoller {

	//8090/app/hello/kkk
	@RequestMapping("/kkk") 
	public String kkk() {
		System.out.println("HelloContller/hello/kkk요청");
		return "loginForm";
	}
}
