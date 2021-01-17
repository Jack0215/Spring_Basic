package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

public class PersonAroundAspect {
	
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		Object obj = null;
		try {
			obj=pjp.proceed();
			System.out.println("around함수 실행 before");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return obj;
	}
}
