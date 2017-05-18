package com.jgs.dto;

public class BoardDTO {

	private int no;
	private String subject;
	private String writer;
	private String date;
	private String content;
	
	
	
	/**Spirng에서는 기본 생성자가 있어야 객체가 생성되요!!!*/
	public BoardDTO() {}
	
	
	public BoardDTO(int no, String subject, String writer, String date) {
		super();
		this.no = no;
		this.subject = subject;
		this.writer = writer;
		this.date = date;
	}

	
	

	public BoardDTO(int no, String subject, String writer, String date, String content) {
		super();
		this.no = no;
		this.subject = subject;
		this.writer = writer;
		this.date = date;
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
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
}
