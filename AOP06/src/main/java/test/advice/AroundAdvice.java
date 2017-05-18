package test.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jgs
 * @param: ProceedingJoinPoint
 * @return:Object
 * @see 사전 , 사후 처리 방식 : around 방식
 */
@Service
@Aspect
//@Order(2)
public class AroundAdvice {

	@Around("PointCutClass.pointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("around의 사전 처리 입니다. ");

		Object obj = joinPoint.proceed();// 핵심 코드 호출
		
		System.out.println("around의 사후 처리 입니다. ");
		return obj;
	}

}
