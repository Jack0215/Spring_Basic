package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping("/")
	public String main1() {
		System.out.println("main접속 성공");
		return "main";
	}
	@RequestMapping("/member")
	public String member() {
		return "member";
	}
	@RequestMapping ("/loginForm")	
	public String loginForm() {
		return "loginForm";
	}
	@RequestMapping(value = "/login", 
			method = RequestMethod.POST)
	public String login() {
		System.out.println("로그인 성공");
		return "logined"; 
	}
	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	}
	@RequestMapping("/main")
	public String main() {
		System.out.println("main접속 성공");
		return "main";
	}
}
