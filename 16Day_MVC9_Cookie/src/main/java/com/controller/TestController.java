package com.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TestController {
	//쿠키 생성 사용자 컴퓨터에 저장 key/value 쌍으로 저장 (로그인 정보 검사, 임시 데이터 저장 등에 활용)
	@RequestMapping(value = "/setCookie") //브라우저에  setCookie입력하면 아래 함수가 실행됨
	public String setCookie(HttpServletRequest request, HttpServletResponse response) {
		Cookie c1 = new Cookie("myName","홍길동"); //저장할 쿠키 생성 key/value
		Cookie c2 = new Cookie("age", "10");
		Cookie c3 = new Cookie("favorite", "악기");
		
		//쿠키는 시간 설정 안해줄 경우 60초 후 사라진다.
		c1.setMaxAge(60*60); //쿠키의 생존시간 설정, 60초*60초
		c2.setMaxAge(60*60); //0을 입력할 경우 저장이 되지 않는다. 
		c3.setMaxAge(60*60);
		
		response.addCookie(c1); //사용자 컴퓨터에 쿠키 거장
		response.addCookie(c2); //저장했으니 getCookie로 찍어볼 수 있음
		response.addCookie(c3);
		return "hello"; //hello.jsp
	}
	@RequestMapping(value = "/getCookie") //쿠키 정보를 가져와 출력해 보기
	public String getCookie(HttpServletRequest request, HttpServletResponse response) {
		Cookie[] cookies = request.getCookies(); //저장된 쿠키 모두 가져오기
		for(Cookie c : cookies) { //쿠키 하나의 정보 출력 "myName", "홍길동"
			System.out.println(c.getName()+"\t"+c.getValue());
		}
		return "hello";
	}
}
