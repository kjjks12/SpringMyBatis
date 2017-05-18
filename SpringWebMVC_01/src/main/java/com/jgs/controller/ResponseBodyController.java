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
		System.out.println("responseBody.do 요청되었습니다");
		
		return "Happy 광수";
	}
	
	@RequestMapping("responseBody2.do")
	@ResponseBody
	public ResponseEntity<String> bb(){
		System.out.println("responseBody2.do 요청되었습니다");
		
		HttpHeaders headers= new HttpHeaders();
		headers.add("Content-Type", "text/html;charset=UTF-8");
		
		ResponseEntity<String> re= new ResponseEntity<String>("Happy 광수",headers,HttpStatus.OK);
		
		return re;
	}
	

}
