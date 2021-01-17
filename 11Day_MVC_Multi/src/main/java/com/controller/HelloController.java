package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	//함수 하나가 서블릿이라고 볼 수 있다.
 @RequestMapping("/kkk1")
 public String xxx() {
	 System.out.println("kkk1 요청");
	 return "WEB-INF/views/main.jsp";
 }
 
 @RequestMapping("/yyy1") 
	public String xxx2() {
		System.out.println("yyy1 요청");
		return "WEB-INF/views/main.jsp";
	}
}
