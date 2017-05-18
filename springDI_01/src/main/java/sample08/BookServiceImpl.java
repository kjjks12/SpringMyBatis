package sample08;

public class BookServiceImpl implements BookService {

	private BookDAO bookDAO;
	private MessageSender messageSender;
	private EmailSender emailSender;

	// 생성자 2개
	public BookServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public BookServiceImpl(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	
	//Getter Setter
	public void setMessageSender(MessageSender messageSender) {
		this.messageSender = messageSender;
		//System.out.println("MessageSender= "+messageSender.toString());

	}
	public void setEmailSender(EmailSender emailSender) {
		this.emailSender = emailSender;
		//System.out.println("EmailSender= "+emailSender.toString());
	}

	// 메소드
	@Override
	public void save(BookDTO book1,BookDTO book2) {

		bookDAO.save(emailSender, messageSender, book1,book2);
		
	}

}
