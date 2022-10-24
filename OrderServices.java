package bookStore;

import java.util.ArrayList;
import java.util.List;

public class OrderServices {
	public static void listOrderByOrderType(int num) {
		List<Order> orderList = new ArrayList<Order>();
		for(Order or: BookStoreDataSource.orders) {
			if(or.getOrderTypeId() == num) {
				orderList.add(or);
			}
		}
		for(Order oL : orderList) {
			System.out.println(oL.getName() + " " + oL.getTime() +" "+ oL.getQuantity() + " books");
		}
	}
	public static void listOrderByOrderId(int num) {
		for(Order or: BookStoreDataSource.orders) {
			if(or.getId() == num) {
				System.out.println(or.getName() + " " + or.getTime());
			}
		}
	}
}
