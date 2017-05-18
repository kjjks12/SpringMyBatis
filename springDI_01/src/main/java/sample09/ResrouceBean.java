package sample09;

import javax.annotation.Resource;

public class ResrouceBean {

	/**
	 * xml문서의 bean의 id ="empDTO" 를 찾아 주입하라!!
	 */
	@Resource(name="empDTO")
	private EmpDTO emp1;
	
	@Resource(name="dto")
	private EmpDTO emp2;

	
	@Resource(name="empController")
	private EmpController empController;
	
	@Resource(name="empService")
	private EmpService service;
	
	public void print(){
		System.out.println("emp1 :"+emp1.getEmpno());
		System.out.println("emp2 :"+emp2.getEmpno());
	
	 System.out.println("empController : "+ empController);
	 System.out.println("service : "+ service);
	 empController.print();
	}
	
}
