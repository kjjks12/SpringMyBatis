package kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 
 * @author jgs
 * @see : POJO ����� �������� �ʾ� Spring 2.5���� ���ϱ����� @Annotation ��� �������� ����!!
 * 
 */
public class InsertController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 1.�Ѿ���� �� �ޱ�

		// 2.service ->dao ȣ��

		// 3.service���ϰ� ������ scope �� �����Ѵ�.
		// request.setAttribute("result", "insert ����!!!");
		// addObject�� �̿��� ��

		// 4.������ ���⿡�� �̵��ߴµ� ->modelandview ������ dispatcherSerlvet���� �̵��Ұž�
		ModelAndView mv = new ModelAndView();
		mv.setViewName("insertOk"); // view/insertOk.jsp�� �̵�
		mv.addObject("result", "insert ����!!!");
		return mv;

	}

}
