package com.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping("/test.admin")
	public String test(){
		System.out.println("test.admin ��û �Ϸ��");
		
		return "adminResult";
	}
	
	
}
