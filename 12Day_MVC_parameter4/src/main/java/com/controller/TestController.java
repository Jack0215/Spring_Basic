package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;



@Controller
public class TestController {
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String xxx() {
		return "loginForm";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String yyy(LoginDTO dto) { //파싱 데이터로 Login 객체 생성, 파싱만 하고 담아주는 코드가 없음
									  //담아주는 코드가 없어 login3에선 아무것도 찍히지 않게됨
		System.out.println("yyy함수 dto:"+dto);
		return "login3";
	} 
	
	@RequestMapping(value="/login2", method=RequestMethod.POST)
	public ModelAndView kkk(LoginDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("loginDTO",dto); //전송할 객체, 파싱할 때 키값은 loginDTO가 됨
		mav.setViewName("login");
		return mav;
	}
	
	@RequestMapping(value="/login3", method = RequestMethod.POST)
	//로그인DTO 생성
	//@ModelAttribute 객체를 addObject함. 생성하고 꽃아줄 때 (꺼내쓰러면) 
	//키가 필요한데 키값이 xxx가됨 즉, ModelAttribute xxx란 키값으로 입력.
	//login에선 xxx란 이름으로 꺼내 쓰면 됨
	//ModelAndView 코드가 조금 줄어들게 됨
	public String rrr(@ModelAttribute("xxx")LoginDTO dto) { 
		return "login2"; 
	}
}
