package bookStore;

public class OrderTypeService {
	public static void printOrderListByType(String type) {
		OrderType orderType = null;
		for(OrderType oT : BookStoreDataSource.orderTypes) {
			if(oT.getName().equals(type)){
				orderType = oT;
			}
		}
		OrderServices.listOrderByOrderType(orderType.getId());
		
	}
}
