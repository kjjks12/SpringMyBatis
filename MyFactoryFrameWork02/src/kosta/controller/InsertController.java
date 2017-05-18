package kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 
 * @author jgs
 * @see : POJO 방식을 지원하지 않아 Spring 2.5버전 이하까지는 @Annotation 기반 지원하지 않음!!
 * 
 */
public class InsertController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 1.넘어오는 값 받기

		// 2.service ->dao 호출

		// 3.service리턴값 있으면 scope 에 저장한다.
		// request.setAttribute("result", "insert 성공!!!");
		// addObject가 이역할 함

		// 4.기존엔 여기에서 이동했는데 ->modelandview 가지고 dispatcherSerlvet가서 이동할거야
		ModelAndView mv = new ModelAndView();
		mv.setViewName("insertOk"); // view/insertOk.jsp로 이동
		mv.addObject("result", "insert 성공!!!");
		return mv;

	}

}
