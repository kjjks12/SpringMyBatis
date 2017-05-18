package sample06;

public class Customer {

	/**
	 * 직원 번호
	 */
	private int empno;
	/**
	 * 고객 이름
	 */
	private String name;
	/**
	 * 직업
	 */
	private String job;

	
	
	
	//생성자 
	public Customer(){}


	public Customer(int empno) {
		super();
		this.empno = empno;
	}


	public Customer(int empno, String name, String job) {
		super();
		this.empno = empno;
		this.name = name;
		this.job = job;
	}

	
	
	

	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}
	
	
	
	
	
	
	
}
