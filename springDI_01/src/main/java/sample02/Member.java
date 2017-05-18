package sample02;

public class Member {
	
	private String id;
	private String pwd;
	private int age;
	private String addr;
	
	//생성자
	public Member() {
		System.out.println("Member의 기본 생성자");
	}
	public Member(String id) {
		this.id=id;
		System.out.println("Member(String id)의 기본 생성자");
	}
	public Member(String id, String pwd) {
		this.id=id;
		this.pwd=pwd;
		System.out.println("Member(String id, String pwd)의 기본 생성자");
	}
	public Member(String id,int age,String addr) {
		this.id=id;
		this.age=age;
		this.addr=addr;
		System.out.println("Member(String id, int age , String addr)의 기본 생성자");
	}
	
	public Member(int id,int age,String addr) {
		
		System.out.println("Member(int id, int age , String addr)의 기본 생성자");
	}
	public Member(String id,String pwd,String addr) {
		this.id=id;
		this.pwd=pwd;
		this.addr=addr;
		System.out.println("Member(String id, String pwd , String addr)의 기본 생성자");
	}
	public Member(String id, String pwd, int age, String addr) {
		this.id = id;
		this.pwd = pwd;
		this.age = age;
		this.addr = addr;
		System.out.println("Member(String id, String pwd, int age, String addr)의 기본 생성자");
	}
	
	
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public int getAge() {
		return age;
	}
	public String getAddr() {
		return addr;
	}
	
	

}
