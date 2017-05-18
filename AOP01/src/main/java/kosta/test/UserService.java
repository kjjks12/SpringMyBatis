package kosta.test;

public class UserService {

	public int userhello() {
		System.out.println("userhello() 핵심 코드 실행됨");

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 50;
	}

	public void messagehello() {
		System.out.println("messagehello()의 핵심 코드 입니다.");

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
