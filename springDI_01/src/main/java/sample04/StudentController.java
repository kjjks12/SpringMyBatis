package sample04;

public class StudentController {

	private StudentService studentService;
	private Student student;
	
	public void insert(){
		//서비스의 insert를 호출
		studentService.serviceInsert(student);
	}


	public void setStudentService(StudentService studentService) {
		System.out.println("setStudentService(StudentService studentService) 호출");
		this.studentService = studentService;
	}
	
	public void setStudent(Student student) {
		System.out.println("setStudent(Student student) 호출");
		this.student = student;
	}

	
	
	
}
