package sample07;

public class MemberVo {

	private String id;
	private int age;
	private String name;
	
	
	
	
	public MemberVo() {
		System.out.println(" MemberVo() 기본생성자 호출");
	}
	
	
	
	public MemberVo(String id, int age, String name) {
		System.out.println(" MemberVo(String id, int age, String name)");
		this.id = id;
		this.age = age;
		this.name = name;
	}



	//Getter Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
