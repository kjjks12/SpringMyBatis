package com.jgs.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jgs.model.dto.ProductDTO;
import com.jgs.model.exception.MyErrorException;

//id="productDAOImpl"
@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private List<ProductDTO> list;

	/*
	 * public ProductDAOImpl() { list = new ArrayList<ProductDTO>(); }
	 */

	@Override
	public List<ProductDTO> showList() {
		return list;
	}

	@Override
	public int insert(ProductDTO productDTO) throws MyErrorException {
		System.out.println("ProductDAOImpl insert()들어옴");
		/* productDTO.setNo(list.size() + 1 + ""); */
		if (validateCheck(productDTO)) {
			list.add(productDTO);
			//System.out.println("다오 리스트 크기 " + list.size());
		} else {
			return 0;
		}
		return 1;
	}

	@Override
	public int delete(String code) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCode().equals(code)) {
				list.remove(i);
				return 1;
			}
		}
		throw new MyErrorException(code+"는 잘못되었습니다.");
	}

	public boolean validateCheck(ProductDTO productDTO) throws MyErrorException {

		if (productDTO.getPrice() < 0 || productDTO.getPrice() > 10000) {
			throw new MyErrorException("price가격은 음수 이거나 10000원을 넘을수 없습니다");
		}

		for (ProductDTO oringinProductDTO : list) {
			if (productDTO.getCode().equals(oringinProductDTO.getCode())) {
				throw new MyErrorException("상품코드" + productDTO.getCode() + "는중복입니다!!");
			}
		}

		return true;
	}

	public void setList(List<ProductDTO> list) {
		System.out.println("list값:"+list);
		this.list = list;
	}

	
	
}
