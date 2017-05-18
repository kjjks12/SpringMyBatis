package com.jgs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/rem")
public class RequestMappingController {

	
	/**
	 * @author jgs
	 * @return String
	 * @see View 의 정보만 가지고 나갈떄 
	 * String  리턴 값은 View의 이름
	 * 메소드 이름은 상관없어
	 */
	@RequestMapping("/a.com")
	public String a(){
		System.out.println("rem/a.kosta 요청됨");
		return "result";//뷰의 이름 //WEB-INF/views/result.jsp로 이동
	}
	
	
	
	/**
	 * 여러개의 요청이 하나의 메소드를 호출
	 */
	@RequestMapping(value={"b.com","c.com"})
	public String b(){
		System.out.println("여러개의 요청이 하나의 메소드로 실행");
		return "result";
	}

	/**
	 * 요청방식에 따라 메소드 호출여부 판단.
	 * return이 void면 요청한 페이지가 view가 되
	 * test로 요청했으니까 -> test.jsp가 나와
	 * 
	 * 리턴 타입 void: 요청된 정보가 뷰의이름이 된다.
	 * ex) rem/test.com 은 /WEB-INF/views/rem/test.jsp
	 */
	
	@RequestMapping(value="/test.com" ,method=RequestMethod.GET)
	public void test(){
		System.out.println("test.kosta의 get방식이 요청되었음");
	}
	
	/**
	 * params정보에 따라 요처을 필터링 한다.
	 */
	
	//@RequestMapping(value="a.com",params={"id"})
	@RequestMapping(value="a.com",params={"id!=jang"}) //jang으로 들어오는건 위에 a로 들어가
	public void bb(Model model,String id,String age){
		System.out.println("params Test 입니다. id="+id);
		model.addAttribute("message","model 신기하구먼 id="+id);
		model.addAttribute("age",age);
	}



}
