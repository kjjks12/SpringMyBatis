package kosta.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

/**
 * 
 * @author jgs
 * @param :
 *            ProceedingJoinPoint (target 대상인 메소드 정보, 메소드 호출 여부에 대한 정보) 올수 있는
 *            2가지 Joinpoint ,ProceedingJoinPoint(join point) 상속 받은놈
 * @return : Object 가 많아요
 * @brief :공통 코드 작성 around 방식 : 사전 사후 처리 모두 하겠다. 공통 코드
 * 
 * 
 *pojo방식이므로 메소드 이름도 우리가 맘대루 사용 가능해!!
 *
 *디펜던시 에 AspectJ Weaver 추가해야해
 *
 */
public class TimerAdvice {

	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		// 사전
		
		
		// 타겟 대상의 메소드 이름
		String methodName= joinPoint.getSignature().getName();
		System.out.println("[LOG]" +methodName +"호출되기 전....");
		
		StopWatch sw= new StopWatch();
		sw.start();
		
		//proceed 가 핵심 로직을 실행할때임!!! 제일 중요
		Object obj = joinPoint.proceed();// 실제 target대상 호출
		
		//리턴 하는것은 핵심 코드가 리턴하는 값!!!
		

		// 사후
		sw.stop();
		System.out.println("[LOG]" +methodName +"의 return 값"+obj);
		System.out.println("[LOG]" +methodName +"의 총 실행시간:"+ sw.getTotalTimeMillis()+"ms");
		System.out.println("[LOG]" +methodName +"호출 완료");
		
		return obj;

	}

}
