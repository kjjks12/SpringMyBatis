package com.jgs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.xpath.internal.operations.Mod;

@Controller
public class ExceptionController {

	@RequestMapping("exception.do")
	public ModelAndView aa(String no) {
		int convertNo = Integer.parseInt(no);
		System.out.println("convertNo:" + convertNo);
		int result = 100 / convertNo;
		System.out.println("나눈 결과 :" + result);

		
		return new ModelAndView("result");
		// WEB-INF/views/result.jsp
	}

	
	/**
	 * @ExceptionHandler 는 예외가 발생했을때 호출되는 메소드
	 * =>현재 컨트롤러에서만 사용 할수 있는 예외
	 * =>다른 컨트롤러에서 발생하는 예외처리는 안된다.
	 * @param ex
	 * @return
	 */
	// 이거 해놓으면 exception 이 나면 무조건 여기로 메서드가 실행이돼!!
	//@ExceptionHandler(value={  ArithmeticException.class, NumberFormatException.class})
	@ExceptionHandler(value={ ArithmeticException.class})
	public ModelAndView error(Exception ex) {
		System.out.println("오류 정보 :" + ex);
		ModelAndView mv = new ModelAndView();
		mv.addObject("errorMessage",ex.getMessage()+"입니다");
		mv.addObject("errorInfo",ex.getClass()+"오류가 발생하였습니다");
		
		mv.setViewName("error/errorView");// WEB-INF/views/error/errorView.jsp
		return mv;
	}

}
