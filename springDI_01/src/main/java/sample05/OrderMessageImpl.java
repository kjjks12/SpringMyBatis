package sample05;

public class OrderMessageImpl implements OrderMessage {

	private int orderId;
	private String message;
	private UserBean userBean;
	private ProductBean productBean;

	@Override
	public void getOrder_Message() {
		System.out.println("주문 번호 :"+orderId);
		System.out.println("주문 메시지 :"+message);
		
		System.out.println("====================================");
		
		System.out.println("상품번호 :"+productBean.getP_no());
		System.out.println("상품이름 :"+productBean.getP_name());
		System.out.println("상품가격 :"+productBean.getP_price());
		
		System.out.println("====================================");
		
		System.out.println("주문자 id :"+userBean.getId());
		System.out.println("주문자 name :"+userBean.getName());
		System.out.println("주문자 addr :"+userBean.getAddr());
		System.out.println("주문자 phone :"+userBean.getPhone());

	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public ProductBean getProductBean() {
		return productBean;
	}

	public void setProductBean(ProductBean productBean) {
		this.productBean = productBean;
	}

}
