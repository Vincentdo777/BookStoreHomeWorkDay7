package bookStore;

public class Stock {
	private int id;
	private String name;
	private int quantity;
	private int bookNameId;
	private int locationId;
	
	public Stock(int id, String name, int quantity, int bookNameId, int locationId) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.bookNameId = bookNameId;
		this.locationId = locationId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getBookNameId() {
		return bookNameId;
	}

	public void setBookNameId(int bookNameId) {
		this.bookNameId = bookNameId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	
}
