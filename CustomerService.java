package bookStore;

public class CustomerService {
	public static String getCustomerNameById(int num) {
		for(Customer cs: BookStoreDataSource.customers) {
			if(cs.getId() == num) {
				return cs.getName();
			}
		}
		
		return "not found";
	}
}
