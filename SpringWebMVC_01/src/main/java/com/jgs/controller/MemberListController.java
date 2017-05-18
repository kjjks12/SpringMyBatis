package com.jgs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jgs.vo.MemberListDTO;
import com.jgs.vo.MememberDTO;

@Controller
@RequestMapping("/list")
public class MemberListController {

	@RequestMapping("/memberMulti.do")
	public void memberMulti(MemberListDTO memberList){
	List<MememberDTO>	list=memberList.getList();
		
	for(MememberDTO dto : list){
		System.out.print("state:"+dto.isState()+ ",");
		System.out.print("name:"+dto.getName()+ ",");
		System.out.print("age:"+dto.getAge()+ ",");
		System.out.print("addr:"+dto.getAddr()+ ",");
	}
	
	}
	
	
}
