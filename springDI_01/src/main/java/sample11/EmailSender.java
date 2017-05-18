package sample11;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {

	public EmailSender() {
		System.out.println("EmailSender()");
	}

}
