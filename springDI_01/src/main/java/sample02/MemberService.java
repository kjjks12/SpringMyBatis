package sample02;

public class MemberService {

	MemberDAO memberDao;
	Member member;

	public MemberService() {
		System.out.println("MemberService()기본생성자");
	}

	public MemberService(MemberDAO memberDao, Member member) {
		this.memberDao = memberDao;
		this.member = member;
		System.out.println("MemberService(MemberDAO memberDao, Member member)기본생성자");
	}
	
	public void  insert(){
		memberDao.insert(member);
	}

}
