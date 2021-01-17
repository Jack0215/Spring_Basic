package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value="/111", method = RequestMethod.GET)
	public ModelAndView xxx3(ArrayList<String>list) { //list를 자동 생성한다.
		list.add("홍길동1"); //data add
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		list.add("홍길동5");
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",list);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value="/222",method = RequestMethod.GET )
	public String ddd(@ModelAttribute("xxx") ArrayList<String>list) {
							//key값이 xxx가 된다.
		list.add("이순신");
		list.add("유관순");
		list.add("을지문덕");
		list.add("김좌진");
		return "main2";
	}
	
	@RequestMapping(value="/333",method = RequestMethod.GET )
	public String eee(ArrayList<String> list) { //key값이 ${stringList}가 된다.
								//제네릭+변수명
		list.add("이순신");  
		list.add("유관순");  
		list.add("을지문덕");
		list.add("김좌진");
		System.out.println("====="+list);
		return "main3"; 
	}
	
	@RequestMapping(value="/444",method = RequestMethod.GET)
	public String ddd(HttpServletRequest request) {
		request.setAttribute("userid", "aaaa");
		return "main4"; 
	}
	@RequestMapping(value="/555",method = RequestMethod.GET)
	//key값 지정해주지 않으면 클래스 이름이 key값이 된다.
	public String ggg(LoginDTO dto) {
		dto.setUserid("aaaa");
		dto.setPasswd("1111");
		return "main5";
	}
}
