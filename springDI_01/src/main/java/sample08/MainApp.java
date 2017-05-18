	package sample08;
	
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	
	public class MainApp {
	
		public static void main(String[] args) {
	
			ApplicationContext context = new ClassPathXmlApplicationContext("sample08/applicationContext.xml");
			
			BookController bookController = context.getBean("bookController", BookController.class);
			bookController.invoker();
		}
	
	}
