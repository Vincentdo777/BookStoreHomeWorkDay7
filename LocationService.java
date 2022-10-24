package bookStore;

public class LocationService {
	public static String findLocation(int num) {
		LocationShelf location = null;
		String spot = null;
		
		for(LocationShelf lc: BookStoreDataSource.locations) {
			if (lc.getId() == num) {
				location = lc;
				spot = location.getName();
				return spot;
			}
		}
		
		return "not found";
	}
}
