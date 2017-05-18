package sample11;

import java.sql.Savepoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class BookController {

	@Autowired
	private BookDTO book1;
	
	@Autowired
	private BookDTO book2;
	
	@Autowired
	private BookService bookService;

	public BookController() {
		System.out.println("BookController() 입니다");
	}

	public void invoker() {
		
		bookService.save(book1,book2);
		
	}

}
