package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
		//1.리턴타입 String => 뷰 만 알려줌
	@RequestMapping(value="/aaa", method = RequestMethod.GET)
	public String xxx3() {
		return "main";
	}
	
	//2.ModelAndView ==> Model과 뷰를 모두 알려줌
	@RequestMapping (value ="/bbb", method = RequestMethod.GET)
	public ModelAndView bbb() {
		ModelAndView mav  = new ModelAndView();
		mav.addObject("username", "홍길동");
		mav.setViewName("main2"); //뷰 페이지 설정 main2.jsp
		return mav;
	}
	
	//3. 리턴타입DTO => 모델만 알려줌, view는 유추(ccc.jsp)
	@RequestMapping(value ="/ccc", method = RequestMethod.GET)
	//jsp 지정이 없으면 주소의 jsp를 찾아감 만약 없으면 404
	//키가 없는 상태에서 뽑아 쓸 때 클래스의 이름 이번 경우는 login이 됨
	public LoginDTO cccc() {
		LoginDTO d = new LoginDTO();
		d.setUserid("aaa");
		d.setPasswd("1234");
		return d; //key: 소문자 class 이름으로 사용(login)
	}
	
	//3-2 리턴타입 DTO =>모델만 알려줌, VIEW는 유추(ddd.jsp)
	@RequestMapping(value ="/ddd", method = RequestMethod.GET)
	@ModelAttribute("xxx")
	public LoginDTO ddd() {
		LoginDTO d = new LoginDTO();
		d.setUserid("aaa");
		d.setPasswd("1234");
		return d;
	}
	
	//4. 리턴타입 ArrayList => 모델만 알려줌, view는 유추 (eee.jsp)
	@RequestMapping(value ="/eee", method = RequestMethod.GET)
	public ArrayList<String> eee(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동1");
		list.add("홍길동2");
		return list; //키는  stringlist
	}
	
	//5. void: ===> 모델과 뷰 모두 안알려줌, View: fff.jsp, Model 없음
	@RequestMapping(value ="/fff", method = RequestMethod.GET)
	public void fff() {
		System.out.println("fff");
	}
}
