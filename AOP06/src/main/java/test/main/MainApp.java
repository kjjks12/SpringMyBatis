package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.exam.MemberService;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test/advice/applicationContext.xml");

		MemberService service = context.getBean("target", MemberService.class);
		try {
			service.register(10, "정광수");
			service.update("kjjks12");
		} catch (Exception e) {
			System.out.println(e + "=>발생");
		}


	}
}
