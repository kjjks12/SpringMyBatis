package com.jgs.controller;

import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jgs.vo.MememberDTO;

@Controller
@RequestMapping("/param")
public class ParameterController {

	/**
	 * @see : parameter.html
	 *
	 */
	/*
	 * @RequestMapping("/a.do") public ModelAndView paramTest(HttpServletRequest
	 * request) { String name = request.getParameter("name"); String age=
	 * request.getParameter("age"); System.out.println("name :"+name);
	 * System.out.println("age :"+age);
	 * 
	 * return new ModelAndView("result", "message", "ParameterTest�엯�땲�떎"); }
	 */

	@RequestMapping("a.do")
	public String paramTest(String name, Integer age, Model model) {
		System.out.println("name :" + name);
		System.out.println("age :" + age);
		model.addAttribute("message", "parameter 테스트 입니다");

		return "result";
	}

	/**
	 * 리턴 타입 void : WEB-INF/views/param/c.jsp이동
	 * 
	 * @param dto
	 * 
	 *            인수 : MememberDTO 객체(Command 객체)를 받게되면 viewpage쪽으로 DTO전달된다.
	 *            viewpage에서 접근 방법 : ${memberDTO.속성
	 *
	 *            !!!! 커맨드 객체만 전달 되는겨 (Stirng ,int) 이런거 아니야
	 * 
	 * 			@ModelAttribute("dto")는 Command객체의 이름 별칭설정 viewpage
	 */
	@RequestMapping("c.do")
	public void cc(@ModelAttribute("dto") MememberDTO dto, HttpSession session) {
		System.out.println(dto.getId());
		System.out.println(dto.getName());
		System.out.println(dto.getAge());
		System.out.println(dto.getAddr());

		session.setAttribute("message", "session에 저장 되었습니다");
	}

	/**
	 * @author jgs
	 * 
	 * @see
	 * @RequestParam의 이름과 인수의 이름이 불일치할때 사용 하면 좋다. 단, @Requestparam을 설정하면
	 *                required=true 이다. 값이 전달되지 않으면 오류 발생 만약, 값이 전달되지 않을 수 있으면
	 *                required=false설정 또는 defaultValue를 설정한다
	 */
	@RequestMapping("d.do")
	public String param(@RequestParam(defaultValue = "admin") String id,
			@RequestParam(value = "username", required = false) String name,
			@RequestParam(defaultValue = "0") int age) {
		System.out.println("id=" + id);
		System.out.println("name=" + name);

		return "result";
	}

	@ModelAttribute("message")
	public String modelAttriTest1() {
		return "미래에셋 으로 ㄱㄱ!!";
	}

	@ModelAttribute("jobs")
	public List<String> modelAttrTest2() {
		List<String> list = new LinkedList<>();
		list.add("백수");
		list.add("백조");
		list.add("king");
		return list;
	}

}
