package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/login")
	public String login() {
		return "loginForm";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(LoginDTO dto) {
		System.out.println(dto.getUserid()+dto.getPasswd());
		System.out.println(dto);
	return "login";
	}
}
