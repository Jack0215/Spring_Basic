package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String loginForm() {
		return "main";
	}

	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String member() {
		return "memberForm";
	}

	@RequestMapping(value = "/member", method = RequestMethod.POST)
	public String member(HttpSession session, LoginDTO dto) {
		session.setAttribute("member", dto);
		return "redirect:main";
	}

	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginget() {
		return "loginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpSession session, LoginDTO dto) {
		// session에서 userid불러와서 비교해야됨
		LoginDTO mDTO = (LoginDTO) session.getAttribute("member");
		String nextPage = "";

		if (mDTO != null) {
			System.out.println(mDTO.getUserid());
			if (mDTO.getUserid().equals(dto.getUserid())) {
				session.setAttribute("login", dto);
				nextPage = "logined";
			} else {
				System.out.println("아이디없음");
				nextPage = "redirect:login";
			}
		} else {
			System.out.println("회원정보없음");
			nextPage = "redirect:main";
		}
		return nextPage;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}
}
