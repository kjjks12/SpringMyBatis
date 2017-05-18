package kosta.test.advice;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutClass {

	@Pointcut("execution(public * kosta.test..*Impl.*(..))")
	public void pointCut(){
		
	}
	
	
}
