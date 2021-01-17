package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/kkk") //사용자가 요청할 수 있는 주소1
	//함수 하나가 따로따로 작동한다.
	public String xxx() {
		System.out.println("kkk 요청");
		return "WEB-INF/views/main.jsp";
		//Resolves views가 없어 함수마다 반환 위치를 지정했다. 
		//처리결과를 메인에다가 띄워준다.
	}

//http://localhostL8090/app/yyy
	@RequestMapping("/yyy") //사용자가 요청할 수 있는 주소2
	public String xxx2() {
		System.out.println("yyy 요청");
		return "WEB-INF/views/main.jsp";
	}
}
