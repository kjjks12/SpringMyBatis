package sample08;

public interface BookDAO {

	public void save(EmailSender emailSender , MessageSender messageSender , BookDTO book1, BookDTO book2);
	
}
