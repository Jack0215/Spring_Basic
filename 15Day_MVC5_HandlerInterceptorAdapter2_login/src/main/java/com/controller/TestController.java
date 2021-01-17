package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {
	
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("TestController.main 호출");
		return "main"; //main.jsp
	}
	@RequestMapping(value="/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("TestController.loginForm 호출");
		return "loginForm"; //loginForm.jsp 
	}	
}	
 