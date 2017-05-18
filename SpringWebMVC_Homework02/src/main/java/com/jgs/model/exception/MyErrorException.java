package com.jgs.model.exception;

public class MyErrorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MyErrorException(){}
	
	public MyErrorException(String message){
		super(message);
	}
	
}
