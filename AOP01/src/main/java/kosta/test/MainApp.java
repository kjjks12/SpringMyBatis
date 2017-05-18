package kosta.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
			
		/**
		 * AOP 프레임웍 proxy를 생성할떄
		 * CGLIB or J2SE 로 생성한다. (default 는 J2SE)
		 * CGLIB :인터페이스 구현 여부 상관 없이 주입
		 * J2SE:인터페이스를 구현했을 경우 반드시 인터페이스를 이용해서 구현객체를 접근
		 * 
		 * 
		 * 설정을 통해 proxy 생성방식을 변경할 수 있다.
		 */
		
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("kosta/test/springApplicationContext.xml");
		MessageService target=context.getBean("target",MessageService.class);
			/*
			target.korHello();
			System.out.println("===================");
			
			target.engHello();
			System.out.println("===================");
			*/
			target.hello();
			System.out.println("===================");
/*
			target.hello("정광수");
			System.out.println("===================");*/
			
			
		/*	*//**
			 * 인터페이스 구현으로 한 객체가 예초에 아니면
			 * J2SE방식이어도 그냥 해두돼!! 착각하면 안돼!!
			 *//*
			
			UserService user= context.getBean("target2",UserService.class);
			System.out.println("===================");
			user.messagehello();
			
			System.out.println("===================");
			user.userhello();
			
			
			*/
			
	
	}
}
