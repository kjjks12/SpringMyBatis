package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringContainerMainApp {
	
	/**
	 * SpringContainer종류
	 * 1)beanFactory
	 *   -다 지연 초기화
	 *   
	 * 2)ApplicationContext
	 *	 beanFacotry 를 이미 만들어 놓았데
	 *  - 사전 초기화( 사용 여부와 상관 없이) 객체를 미리 메모리에 생성해 놓는다.
	 *  - 만약 bean 속성에 scope="prototype" 설정되어 있으면 지연 초기화(객체를 미리 생성하지 않고 필요할떄)
	 *    getBean 마다 새롭게 생성한다.
	 * 
	 * 3)webApplication
	 */

	public static void main(String[] args) {
		//클래스 패스 기준으로 가져와 이클립스상에서 JVM 에 올려지는 기준
	// ApplicationContext context=	new ClassPathXmlApplicationContext("sample01/applicationContext.xml");
		//프로젝트 기준으로 가져와
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/sample01/applicationContext.xml");
		MessageBean ko = context.getBean("ko",MessageBean.class);
		MessageBean ko2 = context.getBean("ko2",MessageBean.class);

		//100번가져와도 동일한 객체 - 싱글톤 처럼 쓰는거야
		MessageBean ko3 = context.getBean("ko",MessageBean.class);
		
		System.out.println("ko= "+ko);
		System.out.println("ko2= "+ko2);
		System.out.println("ko3= "+ko3);
	}
	
}
