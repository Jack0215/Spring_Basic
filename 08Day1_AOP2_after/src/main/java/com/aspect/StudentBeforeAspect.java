package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect //공통로직부분, 핵심로직 어느 함수에서 실행할지에 대한 등록과 실행할 코드 구현
public class StudentBeforeAspect {
//advice + pointcut을 분리
	@Pointcut("execution(* call*(..))") //매개변수 모든것/변수이름 call/뒤에 뭐 와도 됨//* call앞에 띄어쓰기 꼭 해야함
	public void xxx() {} //실제 공통로직이 구현된 함수(ADVICE) -XXX()함수실행 등록
	
	@After("xxx()")
	public void callEchoBefore(JoinPoint point) {
		System.out.println("공통로직==="+point);
		System.out.println("공통로직==="+point.getSignature().getName());
		System.out.println("공통로직===callEchoBefore");
	}
	
	/*
	 * //advice + pointcut을 같이 표현
	 * 
	 * @Before("execution(* sayEcho(..))") public void sayEchoBefore() {
	 * System.out.println("sayEchoBefore"); }
	 */
}
