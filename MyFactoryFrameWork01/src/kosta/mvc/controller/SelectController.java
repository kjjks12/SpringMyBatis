package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectController implements Controller {

	@Override
	public ModelAndView excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//1.�Ѿ���� �� �ޱ�
		
		//2.service ->dao ȣ��
		
		//3.service���ϰ� ������ scope �� �����Ѵ�.
		request.setAttribute("result", "select ����!!!");
		
		//4.������ ���⿡�� �̵��ߴµ� ->modelandview ������ dispatcherSerlvet���� �̵��Ұž�
		ModelAndView mv = new ModelAndView();
		mv.setPath("selectOk.jsp");
		return mv;
	}

}
