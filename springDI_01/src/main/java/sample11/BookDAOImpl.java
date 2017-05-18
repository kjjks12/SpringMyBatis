package sample11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements BookDAO {

	@Autowired
	private DbUtil dbUtil;
	
	
	
	
	public BookDAOImpl() {
		System.out.println("BookDAOImpl() 생성자 입니다"); 
		
	}




	@Override
	public void save(EmailSender emailSender, MessageSender messageSender, BookDTO bookDTO, BookDTO bookDTO2) {
		System.out.println("emailSender :"+emailSender);
		System.out.println("messageSender :"+messageSender);
		System.out.println("bookDTO :"+bookDTO);
		System.out.println("bookDTO2 :"+bookDTO2);
		System.out.println("dbUtil :"+dbUtil);
		
		
	}

}
