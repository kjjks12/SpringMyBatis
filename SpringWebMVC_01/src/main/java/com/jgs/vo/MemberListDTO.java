package com.jgs.vo;

import java.util.List;

public class MemberListDTO {

	private List<MememberDTO> list ; //<input name="list[0].속성 이름이 같아야해"

	public List<MememberDTO> getList() {
		return list;
	}

	public void setList(List<MememberDTO> list) {
		this.list = list;
	}



}
