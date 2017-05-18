package com.jgs.model.dto;

import org.springframework.stereotype.Repository;
/**
 * 
 * @author jgs
 * @see 상품 DTO
 * @version 1.0
 */
/*@Repository*/
public class ProductDTO {

/*	*//**@see 상품 번호*//*
	private String no;
	*/
	/**@see 상품 코드*/
	private String code;
	
	/**@see 상품 이름*/
	private String name;
	
	/**@see 상품 가격*/
	private int price;
	
	/**@see 상품 정보*/
	private String info;
	
	
	//생성자
	/**@see 기본 생성자 */
	public ProductDTO() {}
	
	

	/**
	 * @see insert  no는 자동 생성 할거야
	 * @param code
	 * @param name
	 * @param price
	 * @param info
	 */
	
	public ProductDTO(String code, String name, int price, String info) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.info = info;
	}



	/**
	 * @see 전체 생성자
	 * @param no
	 * @param code
	 * @param name
	 * @param price
	 * @param info
	 */
	

	
	
	//Getter Setter



	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}


	@Override
	public String toString() {
		return "ProductDTO [ code=" + code + ", name=" + name + ", price=" + price + ", info=" + info
				+ "]";
	}
	

	
	
	
}
