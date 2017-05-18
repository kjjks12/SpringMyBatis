package test.advice;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutClass {

	@Pointcut("execution(* test.exam.*Impl.*(..))")
	public void pointCut(){
		
	}
	
	
}
