package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentAfterThrowing {
														// sayEcho에서 exception이 발생하면 얘가 받는다.
	@AfterThrowing(pointcut = "execution(* sayEcho(..))", throwing = "ex")
														// 받은 exception을 가지고 그걸 함수로 받음
	public void sayEchoAfterThrowing(JoinPoint point, Object ex) {
		//System.out.println(point.getSignature());
		System.out.println("sayEchoAfterThrowing==" + ex); 
	}
}
 