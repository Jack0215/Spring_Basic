package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@ModelAttribute("xxx") //객체만든다음 키값 xxx에 저장
	//Mapping이 없어, 주소로 접근하지않고 그냥 사용.
	//Mapping이 없으면 Mapping이 없는 함수가 먼저 실행됨
	//list가 리턴돼서 @ModelAttribute("xxx")에 xxx란 키값으로 리스트가 저장된다.
	public ArrayList<String> getList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		return list;
	}
	
	// '/aaa'로 주소를 입력
	// @ModelAttribute("xxx")를 다시 작성하면 위에서 만들어진 list가 끌려온다.
	// 리턴 "main"하면 list가 같이 넘어가서 다른 jsp에서 list를 끌어 쓸 수 있다. 
	@RequestMapping(value="/aaa", method = RequestMethod.GET)
	public String xxx3(@ModelAttribute("xxx") ArrayList<String> list) {
		System.out.println("aaa추가요청작업");
		return "main";
	}
	
	@RequestMapping(value="/bbb", method = RequestMethod.GET)
	public String xxx4(@ModelAttribute("xxx") ArrayList<String> list) {
		System.out.println("bbb추가요청작업");
		return "main";
	}
	
	
}
