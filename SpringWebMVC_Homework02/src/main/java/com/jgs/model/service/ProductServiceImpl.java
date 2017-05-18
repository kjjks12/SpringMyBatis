package com.jgs.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jgs.model.dao.ProductDAO;
import com.jgs.model.dto.ProductDTO;
import com.jgs.model.exception.MyErrorException;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;

	@Override
	public List<ProductDTO> showList() {

		return productDAO.showList();
	}

	@Override
	public int insert(ProductDTO productDTO) throws MyErrorException {
		System.out.println("ProductServiceImpl insert() µé¾î¿È");
		int result = productDAO.insert(productDTO);

		return result;
	}

	@Override
	public int delete(String code) throws MyErrorException {
		int result = productDAO.delete(code);

		return result;
	}

}
