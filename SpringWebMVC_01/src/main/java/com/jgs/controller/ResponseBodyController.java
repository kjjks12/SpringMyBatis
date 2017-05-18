package com.jgs.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseBodyController {
	
	
	@RequestMapping("responseBody.do")
	@ResponseBody
	public String aa(){
		System.out.println("responseBody.do ��û�Ǿ����ϴ�");
		
		return "Happy ����";
	}
	
	@RequestMapping("responseBody2.do")
	@ResponseBody
	public ResponseEntity<String> bb(){
		System.out.println("responseBody2.do ��û�Ǿ����ϴ�");
		
		HttpHeaders headers= new HttpHeaders();
		headers.add("Content-Type", "text/html;charset=UTF-8");
		
		ResponseEntity<String> re= new ResponseEntity<String>("Happy ����",headers,HttpStatus.OK);
		
		return re;
	}
	

}
