package sample01;

public class MessageBeanKoImpl implements MessageBean {

	
	
	public MessageBeanKoImpl() {
		System.out.println("MessageBeanKoImpl 기본생성자");

	}

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+" 안녕하세요");
	}

}
