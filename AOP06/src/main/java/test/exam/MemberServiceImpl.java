package test.exam;

import org.springframework.stereotype.Service;

@Service("target")
public class MemberServiceImpl implements MemberService {

	@Override
	public void register(int no, String name) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("register(int no, String name)의 핵심 코드 입니다.");
		if(no==0)throw new Exception(no+"");
	}

	@Override
	public boolean update(String memberId) {
		// TODO Auto-generated method stub
		System.out.println("update(String memberId)의 핵심 코드 입니다.");

		return false;
	}

}
