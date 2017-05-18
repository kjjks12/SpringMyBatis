package com.jgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jgs.model.dto.ProductDTO;
import com.jgs.model.exception.MyErrorException;
import com.jgs.model.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/start.ko")
	public ModelAndView showList() {
		return new ModelAndView("start", "productList", productService.showList());
	}

	// 어떤게 들어와도 이동시키게 a.ko->a.jsp b.ko->b.jsp
	@RequestMapping("/{urlInfo}.ko")
	public void url() {
	}

	@RequestMapping("/insert.ko")
	public ModelAndView insert(ProductDTO productDTO) throws MyErrorException  {
		ModelAndView mv = new ModelAndView();
		productService.insert(productDTO);
		mv.setViewName("redirect:start.ko");

		return mv;

	}

	@RequestMapping("/{key}")
	public ModelAndView del(@PathVariable String key) throws MyErrorException {
		System.out.println("key :" + key);

		ModelAndView mv = new ModelAndView();
		productService.delete(key);
		mv.setViewName("redirect:start.ko");

		return mv;
	}

	
	@ExceptionHandler(MyErrorException.class)
	public ModelAndView error(MyErrorException ex){
		return new ModelAndView("error/errorView","errMessage",ex.getMessage());
	}
	
}
