package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertController implements Controller {

	@Override
	public ModelAndView excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//1.넘어오는 값 받기
		
		//2.service ->dao 호출
		
		//3.service리턴값 있으면 scope 에 저장한다.
		request.setAttribute("result", "insert 성공!!!");
		
		//4.기존엔 여기에서 이동했는데 ->modelandview 가지고 dispatcherSerlvet가서 이동할거야
		ModelAndView mv = new ModelAndView();
		mv.setPath("insertOk.jsp");
		
		char b[] =new char[10];
		return mv;
		
	
	}

}
