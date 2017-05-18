package kosta.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SelectController implements Controller {


	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 1.�Ѿ���� �� �ޱ�

		// 2.service ->dao ȣ��

		// 3.service���ϰ� ������ scope �� �����Ѵ�.
		//request.setAttribute("result", "select ����!!!");

		// 4.������ ���⿡�� �̵��ߴµ� ->modelandview ������ dispatcherSerlvet���� �̵��Ұž�
		ModelAndView mv = new ModelAndView();
		mv.setViewName("selectOk"); //view/insertOk.jsp�� �̵�
		mv.addObject("result", "select ����!!!");
		return mv;

	}
}
