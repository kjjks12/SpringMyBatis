package sample04;

public class StudentServiceImpl implements StudentService {

	private StudentDAO studentDAO;
	
	
	
	public StudentDAO getStudentDAO() {
		return studentDAO;
	}



	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
		System.out.println("setStudentDAO(StudentDAO sutdentDAO)호출됨");
	}



	@Override
	public void serviceInsert(Student student) {
		//dao의 insert를 호출
		studentDAO.insert(student);
	}

}
