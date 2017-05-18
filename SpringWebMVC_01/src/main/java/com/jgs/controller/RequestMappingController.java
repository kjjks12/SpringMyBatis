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
	 * @see View �� ������ ������ ������ 
	 * String  ���� ���� View�� �̸�
	 * �޼ҵ� �̸��� �������
	 */
	@RequestMapping("/a.com")
	public String a(){
		System.out.println("rem/a.kosta ��û��");
		return "result";//���� �̸� //WEB-INF/views/result.jsp�� �̵�
	}
	
	
	
	/**
	 * �������� ��û�� �ϳ��� �޼ҵ带 ȣ��
	 */
	@RequestMapping(value={"b.com","c.com"})
	public String b(){
		System.out.println("�������� ��û�� �ϳ��� �޼ҵ�� ����");
		return "result";
	}

	/**
	 * ��û��Ŀ� ���� �޼ҵ� ȣ�⿩�� �Ǵ�.
	 * return�� void�� ��û�� �������� view�� ��
	 * test�� ��û�����ϱ� -> test.jsp�� ����
	 * 
	 * ���� Ÿ�� void: ��û�� ������ �����̸��� �ȴ�.
	 * ex) rem/test.com �� /WEB-INF/views/rem/test.jsp
	 */
	
	@RequestMapping(value="/test.com" ,method=RequestMethod.GET)
	public void test(){
		System.out.println("test.kosta�� get����� ��û�Ǿ���");
	}
	
	/**
	 * params������ ���� ��ó�� ���͸� �Ѵ�.
	 */
	
	//@RequestMapping(value="a.com",params={"id"})
	@RequestMapping(value="a.com",params={"id!=jang"}) //jang���� �����°� ���� a�� ��
	public void bb(Model model,String id,String age){
		System.out.println("params Test �Դϴ�. id="+id);
		model.addAttribute("message","model �ű��ϱ��� id="+id);
		model.addAttribute("age",age);
	}



}
