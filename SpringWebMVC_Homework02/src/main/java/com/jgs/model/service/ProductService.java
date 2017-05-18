package com.jgs.model.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.jgs.model.dto.ProductDTO;
import com.jgs.model.exception.MyErrorException;


public interface ProductService {

	
	/**
	 * @see 전체 상품 보여주는 메소드
	 * @return List<ProductDTO> 형태로 들고나감
	 */
	public List<ProductDTO> showList();	
	
	/**
	 * @see 상품 삽입 하는 메소드
	 * @param productDTO 전체 삽입
	 * @return 성공= 1 실패 =0
	 */

	public int insert(ProductDTO productDTO) throws MyErrorException;

	/**
	 * @see 상품 삭제 하는 메소드
	 * @param 상품 번호 =pk
	 * @return 성공= 1 실패 =0
	 */
	public int delete(String code)throws MyErrorException;
	
	
}
