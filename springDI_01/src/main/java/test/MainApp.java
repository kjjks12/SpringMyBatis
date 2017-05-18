package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample01.MessageBean;
import sample01.MessageBeanEnImpl;
import sample01.MessageBeanKoImpl;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("메인 시작하였습니다");
		
		//1.기존 방식
		MessageBean bean=new MessageBeanEnImpl();
		bean.sayHello("광수");
		
		bean=new MessageBeanKoImpl();
		bean.sayHello("광수");
		
		//2.Spring Container를 통해 객체를 생성하고 주입한다. -xml 설정 문서 필요!!
		ApplicationContext context=	new ClassPathXmlApplicationContext("classpath:sample01/applicationContext.xml");
		bean = context.getBean("en",MessageBean.class);
		bean.sayHello("Jeong Gwang su ");
		bean = context.getBean("ko",MessageBean.class);
		bean.sayHello("정광수 님  ");
		
	}

}
