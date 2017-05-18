package com.jgs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StartController {

	/**
	 * start.com 으로 들어오는게 있으면 
	 */
	@RequestMapping("/start.com")
	public ModelAndView aa(){
		System.out.println("start.com 요청되어 호출됨");
		
		ModelAndView mv= new ModelAndView();
		//appServlet-servlet.xml의  InternalResourceViewResolver에 의해 WEB-INF/views/result.jsp 로 이동
		mv.setViewName("result");
		mv.addObject("message", "Spring WEB MVC Start!!!");
		mv.addObject("id", "kjjks12"); //viewPage에서 ${id}
		return mv;
	}
	
	
}
