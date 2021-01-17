package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentAfterReturningAspect {
										//seyEcho는 Hello리턴, 메인에서 출력되었음
										//우리는 returning을 통해 Hello란 글씨를 retVal로 받겠다고 선언
										//받을 때 Object타입으로 받음
		@AfterReturning(pointcut="execution(* sayEcho(..))",returning="retVal")
										//returning과 Object의 변수명이 일치해야 에러가 안난다.
		public void sayEchoAfterReturning(JoinPoint point, Object retVal) {
			System.out.println("2. "+point.getSignature());
			System.out.println("3. sayEchoAfterReturning=="+retVal);
		}
}
