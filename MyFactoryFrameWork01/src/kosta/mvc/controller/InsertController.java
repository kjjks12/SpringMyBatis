package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertController implements Controller {

	@Override
	public ModelAndView excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//1.�Ѿ���� �� �ޱ�
		
		//2.service ->dao ȣ��
		
		//3.service���ϰ� ������ scope �� �����Ѵ�.
		request.setAttribute("result", "insert ����!!!");
		
		//4.������ ���⿡�� �̵��ߴµ� ->modelandview ������ dispatcherSerlvet���� �̵��Ұž�
		ModelAndView mv = new ModelAndView();
		mv.setPath("insertOk.jsp");
		
		char b[] =new char[10];
		return mv;
		
	
	}

}
