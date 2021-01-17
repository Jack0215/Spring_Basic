package com.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//맵핑된주소로 리퀘스트가 감 그래서 리퀘스트와 리스폰르를 먼저 받음. Object는 클래스와 함수이름 등 정보가 들어가있음
public class MyHandlerInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("preHandel: "+handler);
		return false;
		//false로 바꿔볼것
		//로그인 정보 확인하고 없으면 다른 페이지로 돌릴 수 있음
	}

	@Override
	
	//모델 & 배류를 자동으로 받아오게 했음
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("postHandle: "+handler);
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
