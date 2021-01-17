package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value ="/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main 호출");
		return "main";
	} 
	
	//모델 하나 만듦. 키와 밸류로 값 넣어 페이지를 넘기면 바로 뽑아 쓸 수 있었음
	//HttpServletRequest 로 할 경우 userid가 넘어가지 않는다.
	//setAttribute와 getAttribute는 아직 사용이 안된다.
	@RequestMapping(value="/redirect", method = RequestMethod.GET)
	public String bbb(Model m) {
		System.out.println("redirect 호출");
		m.addAttribute("userid", "홍길동");
		return "redirect:main"; //도메인 /main을 찾아감
	}  
	
}	
 