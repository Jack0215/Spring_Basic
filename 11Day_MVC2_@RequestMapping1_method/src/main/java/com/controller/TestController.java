package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	//동일 주소를 get, post 구분하여 view페이지를 다르게 처리하는 예제
	//Get
	@RequestMapping(value="/login" , method = RequestMethod.GET)//get 방식
	public String xxx() {
		System.out.println("xxx방식으로 접속하였습니다.");
		return "loginForm"; //연결되는것은 loginForm.jsp
	}
	
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main에 접속하였습니다.");
		return "main"; //main.jsp
	} 
	
	//POST
	@RequestMapping(value="/login" , method=RequestMethod.POST)//POST 방식
	public String xxx2() {
		System.out.println("xxx2방식으로 접속하였습니다."); 
		return "login";
	}
}
