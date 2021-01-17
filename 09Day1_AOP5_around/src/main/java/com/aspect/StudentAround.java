package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
//xml에서 aop bean을 생성해야한다.

public class StudentAround {
	//핵심로직이 실행되기전, 후 모두 실행
	//핵심로직을 실행시키는 코드   
	@Around("execution(* sayEcho(..))")
	public Object sayEchoAfterReturing(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("Before");
		Object retVal = pjp.proceed();
		System.out.println("After");
		System.out.println("retVal:"+retVal);
		return retVal; //return값이 메인으로 넘어가서 사용된다.
	}
}
