package com.jgs.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jgs.dto.BoardDTO;

@Controller
@RequestMapping("board")
public class BoardListController {

	@RequestMapping("init.do")
	public String initBoardList(HttpSession session) {
		
		System.out.println("initBoardList µé¾î¿È");
	/*	HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession session = httpRequest.getSession();
		*/
		List<BoardDTO> list= new ArrayList<BoardDTO>();
		
		for(int i=1;i<=3;i++){
		list.add(new BoardDTO(i,"³î±â","Á¤±¤¼ö"+i,new Date().toString(),"¾È³ç ÇÏ¼¼¿ä ³Ê¹« ½É½ÉÇØ¿ä"+i));
			
		}
		
		session.setAttribute("board_list", list);
	
		return "show_board";
	}

	@RequestMapping("insert.do")
	public String insertBoardList(BoardDTO boardDTO,HttpSession session) {
		System.out.println("insertBoardList() µé¾î¿È" );
		
		List<BoardDTO> list=(List<BoardDTO>) session.getAttribute("board_list");
		list.add(boardDTO);
		
		return "show_board";
	}
	
	
	@RequestMapping("read.do")
	public ModelAndView detailBoard(Integer no,HttpSession session){
		List<BoardDTO> list=(List<BoardDTO>)session.getAttribute("board_list");
		BoardDTO boardDTO=null;
		for(int i=0;i<list.size();i++){
			if(list.get(i).getNo()==no){
				boardDTO= list.get(i);
			}
		}
		
		return new ModelAndView("detail", "board_dto", boardDTO);
	}
}
