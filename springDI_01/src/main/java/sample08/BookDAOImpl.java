package sample08;

public class BookDAOImpl implements BookDAO{

	private DbUtil dbUtil;
	
	//생성자
	public BookDAOImpl() {}

	public BookDAOImpl(DbUtil dbUtil) {
		this.dbUtil = dbUtil;
	}

	@Override
	public void save(EmailSender emailSender, MessageSender messageSender, BookDTO book1, BookDTO book2) {
		System.out.println("MessageSender= "+messageSender.toString());
		System.out.println("EmailSender= "+emailSender.toString());
		System.out.println("book1="+book1.toString());
		System.out.println("book2="+book2.toString());
		System.out.println("dbUtil="+dbUtil.toString());
	}


	

}
