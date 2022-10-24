package bookStore;

public class BookStoreDataSource {
	public static ISBN[] isbnDatas = { 
			new ISBN(0, "ISBN 123456459-0"), 
			new ISBN(1, "ISBN 123456459-1"),
			new ISBN(2, "ISBN 123456459-2"), 
			new ISBN(3, "ISBN 123456459-3"), 
			};
	public static BookType[] bookTypeData = { 
			new BookType(1, "Action"), 
			new BookType(2, "Thriller"),
			new BookType(3, "Love"), 
			new BookType(4, "Horror"), };
	public static Author[] authors = { 
			new Author(1, "Vincent Do"), 
			new Author(2, "Victor Hugo"),
			new Author(3, "Barrack Obama"), 
			new Author(4, "Haruki Murakami") 
			};

	public static BookName[] bookNames = { 
			new BookName(1, "Norwegian Wood", 1, 4),
			new BookName(2, "Co giao Thao", 1, 1), 
			new BookName(3, "Detective John", 2, 3),
			new BookName(4, "Where when why", 4, 2),
			};
	
	public static LocationShelf[] locations = {
			new LocationShelf(1, "shelf A"),
			new LocationShelf(2, "shelf B"),
			new LocationShelf(3, "shelf C"),
			new LocationShelf(4, "shelf D"),
			};
	
	public static Stock[] stocks = {
			new Stock(1, "stock of Norwegian Wood ", 50, 1, 1),
			new Stock(2, "stock of Co giao Thao ", 150, 2, 2),
			new Stock(3, "stock of Detective John ", 50, 3, 3),
			new Stock(4, "stock of Where when why ", 50, 4, 4),	
			};
	
	public static Customer[] customers = {
			new Customer(1, "Miya Kiguchi", 18, "Japan"),
			new Customer(2, "Ngoc Trinh", 19, "Viet Nam"),
			new Customer(3, "Jessical Alba", 20, "USA"),
			new Customer(4, "Kim Tae Hee", 21, "Korea")
	};
	
	public static OrderType[] orderTypes = {
			new OrderType(1, "borrow"),
			new OrderType(2, "return")
	};
	
	public static Order[] orders ={
			new Order(1,"Miya Kiguchi borrow", 1 , 1, "18:00 1st July 2022",3),
			new Order(2,"Ngoc Trinh return", 2 , 2, "16:00 2nd April 2022",5),
			new Order(3,"Jessical Alba borrow", 1 , 3, "13:00 3rd June 2022",10),
			new Order(4,"Kim Tae Hee return", 2 , 4, "12:00 20th May 2022",2),
			new Order(5,"Miya Kiguchi return", 2 , 1, "18:00 1st Sep 2022",3),
	};
	
	public static OrderDetail[] orderDetail = {
			new OrderDetail(1, 1, 1),
			new OrderDetail(2, 1, 5),
			new OrderDetail(3, 2, 2),
			new OrderDetail(4, 3, 2),
	};
	
	
	public static Abook[] abooks = {
			new Abook(1, 1, 1, 1,"123-456-78912-3"),
			new Abook(2, 2, 2, 2,"123-456-78932-1"),
			new Abook(3, 3, 3, 3,"123-456-78923-1"),
			new Abook(4, 4, 4, 4,"123-456-78933-2"),
	}; 

}