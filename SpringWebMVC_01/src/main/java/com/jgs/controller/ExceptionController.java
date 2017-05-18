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
		System.out.println("���� ��� :" + result);

		
		return new ModelAndView("result");
		// WEB-INF/views/result.jsp
	}

	
	/**
	 * @ExceptionHandler �� ���ܰ� �߻������� ȣ��Ǵ� �޼ҵ�
	 * =>���� ��Ʈ�ѷ������� ��� �Ҽ� �ִ� ����
	 * =>�ٸ� ��Ʈ�ѷ����� �߻��ϴ� ����ó���� �ȵȴ�.
	 * @param ex
	 * @return
	 */
	// �̰� �س����� exception �� ���� ������ ����� �޼��尡 �����̵�!!
	//@ExceptionHandler(value={  ArithmeticException.class, NumberFormatException.class})
	@ExceptionHandler(value={ ArithmeticException.class})
	public ModelAndView error(Exception ex) {
		System.out.println("���� ���� :" + ex);
		ModelAndView mv = new ModelAndView();
		mv.addObject("errorMessage",ex.getMessage()+"�Դϴ�");
		mv.addObject("errorInfo",ex.getClass()+"������ �߻��Ͽ����ϴ�");
		
		mv.setViewName("error/errorView");// WEB-INF/views/error/errorView.jsp
		return mv;
	}

}
