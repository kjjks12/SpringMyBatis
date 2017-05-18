package kosta.test;

import org.springframework.aop.framework.AopContext;

public class MessageServiceImpl implements MessageService {

	@Override
	public void korHello() {
		System.out.println("korHello()의 핵심코드 입니다");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void engHello() {
		System.out.println("engHello()의 핵심코드 입니다");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String hello() {
		System.out.println("hello()의 핵심코드 입니다");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	
		System.out.println("#############################");
		//사전 사후 처리 될꺼 같지만 안돼!!
		//현재 proxy서버를 가져와서 호출하고 싶은 메소드를 위임.
		//	이렇게만 해두 에러
		//현재 프록시 얻어와야해
		((MessageService)AopContext.currentProxy()).hello("이나영");
		//xml에 expose-proxy true로 해줘야해
		
		//this.hello("이나영");
		System.out.println("#############################");

		return "정광수";
	}

	@Override
	public int hello(String name) {
		System.out.println("hello(String name) 핵심코드 입니다");

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
