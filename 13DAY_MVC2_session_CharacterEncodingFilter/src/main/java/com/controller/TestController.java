package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class TestController {
	//login 2개
	// get일때 로인폼
	// post일때 login.jsp가 뜨게
	//login.jsp session에서 정보를 꺼내서 환영합니다 꺼냄+
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginForm() {
		return "loginForm";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(LoginDTO dto) {
		String userid = dto.getUserid();
		String passwd = dto.getPasswd();
		System.out.println("userid: "+userid +"\r"+"passwd:"+passwd);
		return "login";
	}

	/*
	 * @RequestMapping(value="/login2", method = RequestMethod.POST ) public String
	 * login2(HashMap<String, String> map, String userid,String passwd) {
	 * map.put("userid", userid); map.put("passwd", passwd); return "login2"; }
	 */
	@RequestMapping(value="/login3", method = RequestMethod.POST )
	public String login2(HttpServletRequest request) {
		String userid=request.getParameter("userid");
		return "login3";  
	} 
	
	@RequestMapping(value ="/login", method = RequestMethod.POST)
	public String login(LoginDTO dto, HttpSession session) {
		System.out.println("login Session 설정"+dto);
		session.setAttribute("login", dto);
		return "login2";  
	} 
	
	//세션받아 세션 날림.
	//생각해야할것: login.jsp로 가라는 건지 login이라는 맵핑주소를 찾아가라는건지
	//sendRedirect랑 똑같음. 그래서 맵핑주소를 찾아감(/login)
	@RequestMapping(value ="/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		System.out.println("logout");
		session.invalidate(); 
		return "redirect:login";
	}
}
