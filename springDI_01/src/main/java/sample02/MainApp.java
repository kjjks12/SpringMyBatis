package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("sample02/springDIConstructor.xml");
		System.out.println("-----------------------------------");
		MemberService service=context.getBean("service",MemberService.class);
		service.insert();
		
				
		
	}
	
}
