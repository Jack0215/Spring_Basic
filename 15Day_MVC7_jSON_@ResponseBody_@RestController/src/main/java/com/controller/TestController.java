package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.Login;

//@Controller
@RestController //비동기 전용으로써 컨트롤러와 리스폰스바디 역할을 대체한다.
public class TestController {
	
	@RequestMapping(value="/home")
	public String ddd() {
		return "home";
	}
	@RequestMapping("/eee")
	public String eee(@RequestParam("mesg") String mesg) {
		System.out.println("eee:"+mesg);
		return "eee + Hello!!";
	}
	@RequestMapping("/fff")
	//RequestBody을 써서 값을 받아와야한다.
	public String fff(@RequestBody String mesg) { //Post방식
		System.out.println("fffff:"+mesg);
		//string type으로 데이터를 return시켜주고있다.
		return "fff + Hello!!";
	}
	
}	
 