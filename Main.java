package bookStore;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("nhap ID sach");
		int stockA = scanner.nextInt();
		StockService.checkStock(stockA);
		
		scanner.nextLine();
		
		System.out.println("nhap order type");
		String type = scanner.nextLine();
		OrderTypeService.printOrderListByType(type);
		
		System.out.println("nhap ISBN");
		String isbn = scanner.nextLine();
		AbookServices.showBorrowAndReturnOfAbookByISBN(isbn);
	}
}

