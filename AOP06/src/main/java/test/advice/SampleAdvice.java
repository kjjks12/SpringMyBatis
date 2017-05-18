package test.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jgs
 * @see : 사전 사후처리는 proceed 가 필요가 없어 target에 대한 정보 사전 사후 필요하지 않음
 */
@Service
@Aspect
//@Order(1)
public class SampleAdvice {

	/**
	 * 사전 처리 :before
	 */
	@Before("PointCutClass.pointCut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("=================================");
		System.out.println("before....");
		String methodName = joinPoint.getSignature().getName();

		for (Object arg : joinPoint.getArgs()) {
			System.out.println(methodName + "인수 :" + arg);

		}
		System.out.println(methodName + "호출 되기 전 before.....");

	}

	/**
	 * 사후 처리 : after(예외발생 여부와 상관 없이 무조건 적용)
	 */
	
	@After("PointCutClass.pointCut()")
	public void afterFinally() {
		System.out.println("=================================");
		System.out.println("afterFinally(예외발생 여부와 상관 없이 무조건 호출됨)");

	}

	/**
	 * 사후 처리 : after-returning(예외 발생하지 않고 정상적으로 동작 할 경우)
	 * 
	 * @param :Object
	 *            : retunrObj 는 타겟 대상 메소드가 리턴 한 값 리턴타입 하나 설정하게 되면 반드시 aop설정에서
	 *            returning="returnObj"필수 returnObj는 인수의 이름과 일치
	 * 
	 */
	@AfterReturning(pointcut="PointCutClass.pointCut()" , returning="returnObj")
	public void afterReturning(JoinPoint joinPoint, Object returnObj) {
		System.out.println("=================================");
		String methodName = joinPoint.getSignature().getName();
		System.out.println(methodName + "의 리턴 값 :" + returnObj);

		System.out.println("afterReturning(-예외 발생없이 정상 동작일때 실행됨)");

	}

	/**
	 * 사후 처리 : after-throwing(예외발생 했을때)
	 * 
	 * @param :
	 *            Throwable ex 는 예외 정보가 전달 된다.
	 * @see aop 설정에서 throwing="ex" 필요. ex는 인수의 이름과 일치
	 */
	@AfterThrowing(pointcut="PointCutClass.pointCut()",throwing="ex" )
	public void afterThrowing(Throwable ex) {
		System.out.println("=================================");
		System.out.println("afterThrowing(-예외가 발생했을대 실행됨)");

	}

}
