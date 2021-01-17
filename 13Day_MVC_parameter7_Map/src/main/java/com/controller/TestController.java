package com.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	//안에서 모델생성 (request라고 생각하면된다.)
	//jsp를 넣어주는 부분이 없어서 데이터가 main으로 가게 설정
	//뽑은쪽에서는 key값을 username으로 해서 request.getAttribute로 뽑으면 된다.
	//@ModelAttribute 사용 안됨, 자동으로 모델처리
	@RequestMapping(value ="/aaa", method = RequestMethod.GET)
	public String xxx(Model m) {
		m.addAttribute("username","홍길동");
		return "main";
	}
	
	@RequestMapping(value ="/bbb", method = RequestMethod.GET)
	public String bbb(Map<String, Object> map) { //request대신 map사용 map이 바로 넘김
		map.put("address","서울"); 
		map.put("username","홍길동");
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		map.put("listttt", list); 
		return "main2";  
	}
	//main2에서 $address로 뽑아볼것
}
