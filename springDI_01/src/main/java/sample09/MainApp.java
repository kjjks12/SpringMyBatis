package sample09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("sample09/springDIAnnotation.xml");
		ResrouceBean resrouceBean = context.getBean("resrouceBean", ResrouceBean.class);

		resrouceBean.print();
	}

}
