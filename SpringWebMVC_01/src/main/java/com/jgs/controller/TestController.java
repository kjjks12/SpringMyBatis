package com.jgs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("test.do")
	public String test(String no){
		int convertNo=Integer.parseInt(no);
		System.out.println("test.do �����..convertNo:"+convertNo);

		return "result";
	}
	
}
