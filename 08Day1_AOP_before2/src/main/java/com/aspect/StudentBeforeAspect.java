package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentBeforeAspect {
	//advice + pointcut을 분리
	@Pointcut("execution(* call*(..))") // call로 시작하는 함수는 모두 실행하겠다. 이 함수 실행할 때 관여하겠다. 공통로직이 구현되어있지 않음
	// 공통로직 따로 구현 (같이 구현하는 방법도 있음)
	// 공통로직이 들어가있으면 advisor라고함
	public void xxx() {
	} // call함수 호출할 때 xxx가 관여한다.

	@Before("xxx()") // call함수 호출 할 때 먼저 실행하도록 어노테이션 등록
	public void callEchoBefore(JoinPoint point) {
		System.out.println("공통로직=" + point);
		System.out.println("공통로직=" + point.getSignature().getName());
		System.out.println("공통로직=callEchoBefore===");
	}

	//advice + pointCut을 같이 표현(한 함수에
	@Before("execution(* sayEcho(..))") //sayEcho가 실행되기 전(@Before)에
										// sayEchoBefore()함수 먼저 실행
	public void sayEchoBefore() {
		System.out.println("sayEchoBefore");
	}
	
	
}
