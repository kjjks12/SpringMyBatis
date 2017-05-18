package com.jgs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {

	
	@RequestMapping("/{type}/{id}.do")
	public String aa(@PathVariable String type,@PathVariable String id){
		System.out.println("type :"+type);
		System.out.println("id :"+id);
		
		return "result";
	}
	/**
	 * ¿äÃ»µÉ¶§ blog ¹Ø¿¡~~~
	 * web.xml¿¡ ÀÌ¹Ì µî·ÏÀ» ÇØ³ù¾î!!
	 */
	@RequestMapping("{idType}")
	public String bb(@PathVariable("idType") String id){
		System.out.println("blog/"+id+"È£ÃâµÊ....");
		
		return "result";
	}
	
	@RequestMapping("{type}/{boardType}/{no}")
	public String bb(@PathVariable("type") String id,@PathVariable String boardType,@PathVariable String no){
		System.out.println("±¤¼ö:"+id+"/"+boardType+"/"+no+"½ÇÇàµÊ");
		
		return "result";
	}
	
	
}
