package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
//동일주소의 경우 파라미터를 이용하여 주소매핑을 다르게 하는 예제
	 @RequestMapping(value="/") //바로 시작
	 public String xxx() {
		 System.out.println("main호출됨");
		 return "main";
	 }
	 
	 @RequestMapping(value="/kkk", params="aaa=ccc")
	 						//params를 가지고 뒤에 주소를 구분한다.
	 public String kkk() {
		 System.out.println("A호출");
		 return "loginForm";
	 }
	 
	 @RequestMapping("/login")
	 public String login() {
		 return "login";
	 }
	 
}
