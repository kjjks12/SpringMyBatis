package sample02;

public class MemberDAO {
	
	public MemberDAO(){
		System.out.println("MemberDAo 기본생성자 호출");
	}

	public void insert(Member member){
		System.out.println("member :"+member);
		System.out.println("아이디 :"+member.getId());
		System.out.println("비밀번호 :"+member.getPwd());
		System.out.println("나 이 :"+member.getAge());
		System.out.println("주 소 :"+member.getAddr());
	}
	
}
