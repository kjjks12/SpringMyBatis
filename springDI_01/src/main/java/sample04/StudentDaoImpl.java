package sample04;

public class StudentDaoImpl implements StudentDAO {

	@Override
	public void insert(Student student) {
		System.out.println("DAO insert 호출됨");
		System.out.println("이름 : " + student.getName());
		System.out.println("번호 : " + student.getNo());
		System.out.println("연락처 : " + student.getPhone());
		System.out.println("주소: " + student.getAddr());
	}

}
