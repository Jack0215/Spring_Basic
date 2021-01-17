package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class TestController {

		//{}브레이스로 변수명 가능, {}에 위치한 key 값을 가져온다.
	@RequestMapping(value = "/board/name/{xxx}", method= RequestMethod.GET)
	public String aaa(@PathVariable ("xxx") String name) { // /board/name/abcd
		System.out.println("@PathVariable ('xxx')"+name);
		return "main"; 
	}
	
	@RequestMapping(value = "/board2/name/{xxx}/age/{yyy}", method= RequestMethod.GET)
	public String aaa2(@PathVariable ("xxx") int name, @PathVariable ("yyy") int age) { // /board/name/abcd
		System.out.println(name+age);
		return "main"; 
	}
	
}
