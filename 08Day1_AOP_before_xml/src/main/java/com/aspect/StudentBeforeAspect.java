package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentBeforeAspect {
	
	@Before("execution (* get*(..))")
	public void mesg() {
		System.out.println("getInfoBefore");
	}
}
