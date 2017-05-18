package com.jgs.model.dto;

import org.springframework.stereotype.Repository;
/**
 * 
 * @author jgs
 * @see ��ǰ DTO
 * @version 1.0
 */
/*@Repository*/
public class ProductDTO {

/*	*//**@see ��ǰ ��ȣ*//*
	private String no;
	*/
	/**@see ��ǰ �ڵ�*/
	private String code;
	
	/**@see ��ǰ �̸�*/
	private String name;
	
	/**@see ��ǰ ����*/
	private int price;
	
	/**@see ��ǰ ����*/
	private String info;
	
	
	//������
	/**@see �⺻ ������ */
	public ProductDTO() {}
	
	

	/**
	 * @see insert  no�� �ڵ� ���� �Ұž�
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
	 * @see ��ü ������
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
