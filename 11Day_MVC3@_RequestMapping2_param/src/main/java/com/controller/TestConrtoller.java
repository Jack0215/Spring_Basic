package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestConrtoller {

	//8090/app/test/kkk
	@RequestMapping("/kkk")
	public String kkk() {
		System.out.println("test/kkk출력");
		return "loginForm"; 
	} 
}
