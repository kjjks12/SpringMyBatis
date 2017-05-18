package com.jgs.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.jgs.vo.UpLoadDTO;

@Controller
public class UpLoadController {

	/**
	 * <bean id="multipartResolver" class=
	 * "org.springframework.web.multipart.commons.CommonsMultipartResolver"/>
	 * 도 같이 주입이 되여 MultipartFile에
	 */
	@RequestMapping("/upload.do")
	public ModelAndView upload(String name, @RequestParam MultipartFile file,HttpSession session) {
	String path=session.getServletContext().getRealPath("/WEB-INF/uploadFile");
	
	//파일 저장
	try {
		file.transferTo(new File(path+"/"+file.getOriginalFilename()));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ModelAndView mv= new ModelAndView();
	mv.addObject("name",name);
	mv.addObject("fileName",file.getOriginalFilename());
	mv.addObject("fileName2",file.getName());
	mv.addObject("path",path);
	mv.addObject("fileSize",file.getSize());
	mv.setViewName("upLoadResult");
	
	return mv;
	}
	
	
	/**
	 * command 객체는 modelAndView에 따로 저장 안해두 쓸수 있어
	 * @param upLoadDTO
	 * @param session
	 * @return
	 */
	@RequestMapping("/upload2.do")
	public String upload2(UpLoadDTO upLoadDTO,HttpSession session){
		
		String path=session.getServletContext().getRealPath("/WEB-INF/uploadFile");
		String fileName=upLoadDTO.getFile().getOriginalFilename();
		long fileSize=upLoadDTO.getFile().getSize();
		
		upLoadDTO.setFileSize(fileSize);
		try {
			upLoadDTO.getFile().transferTo(new File(path+"/"+fileName));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return "upLoadResult";
	}
	
	@RequestMapping("/downList.do")
	public ModelAndView downList(HttpSession session){
		String path = session.getServletContext().getRealPath("WEB-INF/uploadFile");
		
		String files[]=new File(path).list();
		
		return new ModelAndView("downList","files",files);
	}

	
	@RequestMapping("downLoad.do")
	public ModelAndView downLoad(String filename,HttpSession session){
		System.out.println("fileName="+filename);
		String path=session.getServletContext().getRealPath("/WEB-INF/uploadFile/");
		return new ModelAndView("downLoadView", "fname", new File(path+"/"+filename));
	}

}
