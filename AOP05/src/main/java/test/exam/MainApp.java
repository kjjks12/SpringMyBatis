package test.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test/exam/applicationContext.xml");

		MemberService service = context.getBean("target", MemberService.class);
		try {
			service.register(10, "정광수");
			service.update("kjjks12");
		} catch (Exception e) {
			System.out.println(e + "=>발생");
		}


	}
}
