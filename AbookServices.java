package bookStore;

import java.util.ArrayList;
import java.util.List;

public class AbookServices {
	public static void showBorrowAndReturnOfAbookByISBN(String input) {
		for (Abook ab : BookStoreDataSource.abooks) {
			if (ab.getiSBN().equals(input)) {
				OrderDetailService.printOrderDetailStatus(ab.getBookNameId());
			}
		}
		
	}
		
}
