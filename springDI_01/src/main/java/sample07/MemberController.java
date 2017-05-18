package sample07;

public class MemberController {

	private MemberVo memberVo;
	private MemberVo memberVo2;
	
	
	
	//1.컨트롤러 기본생성자
	public MemberController() {
		System.out.println("memberController() 기본 생성자 호출됨");
	}
	//2.컨트롤러 memberVo받는 생성자
	public MemberController(MemberVo memberVo){
		this.memberVo = memberVo;
		System.out.println("MemberController(MemberVo memberVo) 호출됨 memberVo : "+memberVo);
	}

	
	
	
	
	
	
	
	public void setMemberVo(MemberVo memberVo) {
		this.memberVo = memberVo;
		System.out.println("setMemberVo(MemberVo memberVo) 호출됨. memberVo : "+memberVo.getId());
	}

	public void setMemberVo2(MemberVo memberVo2) {
		this.memberVo2 = memberVo2;
		System.out.println("setMemberVo(MemberVo memberVo2) 호출됨. memberVo2 : "+memberVo2.getId());
	}
	
	
	
	
}
