package bookStore;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailService {
	public static void printOrderDetailStatus(int num) {
		List<OrderDetail> orDetailOfSamebook = new ArrayList<OrderDetail>();
		for(OrderDetail oddetail : BookStoreDataSource.orderDetail) {
			if(oddetail.getaBookId() == num){
				orDetailOfSamebook.add(oddetail);
			}
		}
		for(OrderDetail or : orDetailOfSamebook) {
			OrderServices.listOrderByOrderId(or.getOrderId());
		}
	}
}
