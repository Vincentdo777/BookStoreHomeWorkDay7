package bookStore;

public class OrderDetail {
	private int id;
	private int aBookId;
	private int orderId;
	
	public OrderDetail(int id, int aBookId, int orderId) {
		super();
		this.id = id;
		this.aBookId = aBookId;
		this.orderId = orderId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getaBookId() {
		return aBookId;
	}
	public void setaBookId(int aBookId) {
		this.aBookId = aBookId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
}
