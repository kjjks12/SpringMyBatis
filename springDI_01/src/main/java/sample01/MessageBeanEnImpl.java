package sample01;

public class MessageBeanEnImpl implements MessageBean {

	//private static MessageBeanEnImpl instance= new MessageBeanEnImpl();
	
	
	
	public MessageBeanEnImpl() {
System.out.println("MessageBeanEnImpl 기본생성자");
	}

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"is hello");
		
	}

}
