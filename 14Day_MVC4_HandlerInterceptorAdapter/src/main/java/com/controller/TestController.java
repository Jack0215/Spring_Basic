package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {
	//인터셉터는 주소를 요청했을 때 메인이란 함수가 호출되기 전에 인터셉터가 메인 호출 전에 한번 실행후에 한번 실행됨
	//예를 들어 로그인 전에 아이디검사 하고 일치하면 메인화면으로 이동(라운드 개념)
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main 호출");
		return "main";
	}
	@RequestMapping(value="/kkk", method = RequestMethod.GET)
	public String kkk() {
		System.out.println("kkk 호출");
		return "home";
	}
	
	
}	
 