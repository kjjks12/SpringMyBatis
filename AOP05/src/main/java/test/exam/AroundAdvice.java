package test.exam;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 
 * @author jgs
 * @param: ProceedingJoinPoint
 * @return:Object
 * @see 사전 , 사후 처리 방식 : around 방식
 */
public class AroundAdvice {

	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("around의 사전 처리 입니다. ");

		Object obj = joinPoint.proceed();// 핵심 코드 호출
		
		System.out.println("around의 사후 처리 입니다. ");
		return obj;
	}

}
