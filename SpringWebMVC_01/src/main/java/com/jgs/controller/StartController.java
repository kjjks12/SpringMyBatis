package com.jgs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StartController {

	/**
	 * start.com ���� �����°� ������ 
	 */
	@RequestMapping("/start.com")
	public ModelAndView aa(){
		System.out.println("start.com ��û�Ǿ� ȣ���");
		
		ModelAndView mv= new ModelAndView();
		//appServlet-servlet.xml��  InternalResourceViewResolver�� ���� WEB-INF/views/result.jsp �� �̵�
		mv.setViewName("result");
		mv.addObject("message", "Spring WEB MVC Start!!!");
		mv.addObject("id", "kjjks12"); //viewPage���� ${id}
		return mv;
	}
	
	
}
