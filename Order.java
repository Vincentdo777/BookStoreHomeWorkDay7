package bookStore;

public class Order {
	private int id;
	private String name;
	private int orderTypeId;
	private int customerId;
	private String time;
	private int quantity;
	
	public Order(int id, String name, int orderTypeId, int customerId, String time, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.orderTypeId = orderTypeId;
		this.customerId = customerId;
		this.time = time;
		this.quantity = quantity;
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
	public int getOrderTypeId() {
		return orderTypeId;
	}
	public void setOrderTypeId(int orderTypeId) {
		this.orderTypeId = orderTypeId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
