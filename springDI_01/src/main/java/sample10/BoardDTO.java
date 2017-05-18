package sample10;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //id= boardDTO
@Scope("prototype")
public class BoardDTO {
	private int  no;
	private String subject;
	private String content;
	
	
	
	public BoardDTO() {
		System.out.println("BoardDTO생성");
	}
	
	public BoardDTO(int no, String subject, String content) {
		this.no = no;
		this.subject = subject;
		this.content = content;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	

}
