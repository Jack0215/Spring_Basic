package com.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.controller.TestController;

public class MyHandlerInterceptor extends HandlerInterceptorAdapter{
	//main과 home에 대한 주소만 인터셉터 처리(xml에 설정되어있음)
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("preHandeler: "+handler);
		HttpSession session = request.getSession();
		if(session.getAttribute("login")==null) {
			//response.sendRedirect("loginForm"); //loginForm 호출시도 Handler 호출의 문제가 발생함
			System.out.println("로그인 정보 없음");
			response.sendRedirect("loginForm");
		}
		return true;	
	}

	@Override
	
	//모델 & 배류를 자동으로 받아오게 했음
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView mav) throws Exception {
		System.out.println("postHandle: "+handler);
		//원하는 controller 찾기
		//object 클래스에서 클래스를 꺼낸다음 비교해서 일치하는것은 view 페이지를 따로 설정함
		HandlerMethod method = (HandlerMethod) handler;
		if(method.getBean() instanceof TestController) { //TestController 요청주소만 따로 처리
			System.out.println("TestController의 경우 postHandle 에서 view 페이지 설정 ");
			mav.setViewName("login"); //login.jsp로 페이지 변경
			mav.addObject("data","홍길동");
		} //end if
		
	}

	@Override
	//
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
		System.out.println("afterCompletion");
	}
}
