package sample11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired 
	private EmailSender emailSender;
	
	@Autowired 
	private MessageSender messageSender;
	
	@Autowired 
	private BookDAO bookdao;

	public BookServiceImpl() {
		System.out.println("BookServiceImpl() 생성자 호출");
	}

	@Override
	public void save(BookDTO bookDTO, BookDTO bookDTO2) {

		bookdao.save(emailSender, messageSender, bookDTO, bookDTO2);

	}

}
