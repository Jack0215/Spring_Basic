package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public String main() {
		System.out.println("HomeController.main 호출");
		return "main";
		//리턴을 메인으로 정해놨지만 프리핸드, 포스트핸드로 강제 리턴을 진행 해볼 예정
	}
}	
 