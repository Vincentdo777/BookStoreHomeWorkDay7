package bookStore;

public class Abook {
	private int id;
	private int bookNameId;
	private int orderId;
	private int stockId;
	private String iSBN;
	
	public Abook(int id, int bookNameId, int orderId, int stockId, String iSBN) {
		super();
		this.id = id;
		this.bookNameId = bookNameId;
		this.orderId = orderId;
		this.stockId = stockId;
		this.iSBN = iSBN;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookNameId() {
		return bookNameId;
	}

	public void setBookNameId(int bookNameId) {
		this.bookNameId = bookNameId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getiSBN() {
		return iSBN;
	}

	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}
	
	
	
}
