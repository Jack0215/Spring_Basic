package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	// http://ip번호:포트번호/컨테스트명/서블릿맵핑/request맵핑
	// http://localhost:8090/app/kkk
	@RequestMapping("/kkk")
	public String xxx() {
		System.out.println("kkk출력");
						//InternalResourceViewResolver로 인해
						//return에 main만 적으면 아래와 같이 적용된다.
		return "main"; //"/WEB-INF/views/main.jsp"; 
	}
	
	@RequestMapping("/yyy")
	public String xxx2() {
		System.out.println("yyy출력");
		return "main";
	}
}
