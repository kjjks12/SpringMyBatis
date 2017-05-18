package sample11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		/*
		 * Resource resource = new
		 * FileSystemResource("src/main/springDIComponentAnnotation.xml");
		 * BeanFactory factory = new XmlBeanFactory(resource);
		 * 
		 * BoardController
		 * boardController=(BoardController)factory.getBean("boardController");
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("sample11/springDIComponentAnnotation.xml");
		BookController bookController=context.getBean("bookController",BookController.class);
		bookController.invoker();
		
	}

}
