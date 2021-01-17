package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value="/")
	public String connection() {
		return "main";
	}
	@RequestMapping(value="/memberForm" , method = RequestMethod.GET)
	public String memberForm() {
		return "memberForm";
	}
	@RequestMapping(value="/main", method = RequestMethod.POST)
	public String main(HttpSession session, LoginDTO dto) {
		session.setAttribute("mdto", dto);
		return "main";
	}
	@RequestMapping(value="/login")
	public String login(){
		return "loginForm";
	}
	@RequestMapping(value="/logined", method = RequestMethod.POST)
	public String loginIdCheck(HttpSession session, LoginDTO dto) {
		LoginDTO mDTO = (LoginDTO) session.getAttribute("mdto");
		String nextPage= "";
		
		if(mDTO != null) {
			if(mDTO.getUserid().equals(dto.getUserid())) {
				session.setAttribute("login", dto);
				nextPage = "logined";
			} else {
				System.out.println("입력된 아이디는 존재하지 않습니다.");
				nextPage = "memberForm";
			}
		} else {
			System.out.println("회원가입을 먼저 해야합니다.");
			nextPage = "redirect:memberForm";
		}
		return nextPage;
	}
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "main";
	}
}
