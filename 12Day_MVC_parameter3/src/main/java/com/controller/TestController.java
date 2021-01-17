package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class TestController {
	@RequestMapping("/aaa")
	public String xxx() { 
		return "main";
	}
	
	@RequestMapping("/bbb")
	//model and view 데이터를 담아주고 어느 페이지까지 이동하겠다 라는 정보를 갖고있는 객체
	public ModelAndView xxx2() {
		
		ModelAndView mav = new ModelAndView();
		//데이터 key/value 저장, view페이지 정보저장
		mav.addObject("username", "홍길동");
		mav.addObject("age",20);
		mav.setViewName("main2"); //main2.jsp 페이지를 찾아감
		return mav; //보내줄 데이터와 보여줄 페이지가 있는 객체를 리턴
		//main2에서 받는 방법 <% %> 혹은 EL 태그 ($사용) 
	}
	
	@RequestMapping("/getCookie2")
	public String xxx3() {
		return "main";
	}
}
