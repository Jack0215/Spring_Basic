package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	///1.맵핑값 하나
	@RequestMapping(value = "/aaa" , method = RequestMethod.GET)
	public String aaa() {
		System.out.println("aaa호출");
		return "main";	}
	///2. 맵핑값 여러개일경우 여러개중 하나라도 일치하면 return값을 실행한다.
	@RequestMapping(value = {"/aaa2", "/aaa3"}, method = RequestMethod.GET)
	public String aaa2() {
		System.out.println("aaa2호출");
		return "main";	}
	//3. 주소 중 ccc뒤에 아무글자가 와도 인식한다.
	@RequestMapping(value = "/ccc*", method = RequestMethod.GET)
	public String ccc() {
		System.out.println("ccc* 호출");
		return "main";	}
	//4. ddd/ 까진 똑같고, 그 뒤에 문자열이 더 붙어도 된다. 단 ddd/bbb/ccc 처럼 슬래쉬가 2개 붙으면 안됨.
	@RequestMapping(value = "/ddd/*", method = RequestMethod.GET)
	public String ddd() {
		System.out.println("ddd/* 호출");
		return "main";	}
	//5. 별이 2개 붙으면 슬래쉬 제한없이 붙일 수 있다.
	@RequestMapping(value = "/eee/**", method = RequestMethod.GET)
	public String eee() {
		System.out.println("eee/** 호출");
		return "main";	}
	//6. fff/여러경로/ggg
	@RequestMapping(value = "/fff/**/ggg", method = RequestMethod.GET)
	public String fff() {
		System.out.println("fff 호출");
		return "main";	}
	//7. userid를 파싱할 수 있음 ex) aaaa를 userid로 파싱함
	@RequestMapping(value = "/gg/{userid}/hh/{passwd}", method = RequestMethod.GET)
	public String ggg() {
		System.out.println("gg 호출");
		return "main";
	}
}
 