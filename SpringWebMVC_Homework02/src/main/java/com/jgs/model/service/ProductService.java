package com.jgs.model.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.jgs.model.dto.ProductDTO;
import com.jgs.model.exception.MyErrorException;


public interface ProductService {

	
	/**
	 * @see ��ü ��ǰ �����ִ� �޼ҵ�
	 * @return List<ProductDTO> ���·� �����
	 */
	public List<ProductDTO> showList();	
	
	/**
	 * @see ��ǰ ���� �ϴ� �޼ҵ�
	 * @param productDTO ��ü ����
	 * @return ����= 1 ���� =0
	 */

	public int insert(ProductDTO productDTO) throws MyErrorException;

	/**
	 * @see ��ǰ ���� �ϴ� �޼ҵ�
	 * @param ��ǰ ��ȣ =pk
	 * @return ����= 1 ���� =0
	 */
	public int delete(String code)throws MyErrorException;
	
	
}
