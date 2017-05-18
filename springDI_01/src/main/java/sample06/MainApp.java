package sample06;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample06/springDIlist02.xml");
		ListBean listBean = context.getBean("listBean", ListBean.class);

		List<Integer> intList = listBean.getIntList();
		List<String> strList = listBean.getStrList();
		List<Customer> customerList = listBean.getCustomerList();

		for (int i = 0; i < intList.size(); i++) {
			System.out.println("=========================");
			System.out.println(intList.get(i));
		}

		for (int i = 0; i < strList.size(); i++) {
			System.out.println("=========================");
			System.out.println(strList.get(i));
		}

		for (int i = 0; i < customerList.size(); i++) {
			System.out.println("=========================");
			Customer customer = customerList.get(i);
			System.out.println("직원번호 :" + customer.getEmpno());
			System.out.println("고객이름 :" + customer.getName());
			System.out.println("직업 :" + customer.getJob());
		}

	}

}
