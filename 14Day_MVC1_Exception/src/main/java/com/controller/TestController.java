package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value ="/aaa", method = RequestMethod.GET)
	public String xxx() {
		if(true)  throw new ArithmeticException("error 발생1");
		return "main";
				
	}
	@RequestMapping(value="/bbb", method = RequestMethod.GET)
	public String bbb() {
		if(true)throw new NullPointerException("error 발생2");
		return "main";
	} 
	//에러페이지를 등록, 해당  exception발생 시 error.jsp로 이동
	@ExceptionHandler({ArithmeticException.class, 
		NullPointerException.class})
	public String errorPage() {
		return "error"; 
	}  
}	
 