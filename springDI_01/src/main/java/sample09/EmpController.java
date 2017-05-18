package sample09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmpController {
	
	//자동으로 주입 받게 해주려구
	//단순 주입만 할 거면 GEtter Setter만들 필요 없다
	@Autowired //동일한 객체가 한개인 경우 byType기준, 여러개이면 byName 기준
	//name도 일치 하지 않으면 에러 -> Qulifier사용
	private EmpDTO empDTO;
	
	@Autowired
	@Qualifier("test")//byName인 경우
	private EmpDTO empDTO2;
	
	@Autowired
	private EmpService empService;

	public void print() {
		System.out.println("empDTO: " + empDTO);
		System.out.println("empDTO.getEmpno: " + empDTO.getEmpno());
	
		System.out.println("===========================");
		
		System.out.println("empDTO2: " + empDTO2);
		System.out.println("empDTO2.getEmpno: " + empDTO2.getEmpno());
		
		
		System.out.println("empService: " + empService);
	}

}
