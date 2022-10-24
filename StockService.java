package bookStore;

public class StockService {
	public static void checkStock(int num) {
		String name = null;
		int number = 0;
		Stock stock = null;
		String spot = null;
		
		
		for(Stock st : BookStoreDataSource.stocks) {
			if(st.getBookNameId() == num) {
				stock = st;
				name = stock.getName();
				number = stock.getQuantity();
				spot = LocationService.findLocation(stock.getLocationId());
			}
		}
		
		System.out.println(name + ": " + number + ", " + spot);
	}
}
