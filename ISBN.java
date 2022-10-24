package bookStore;

public class ISBN {
	private int id;
	private String isbn;
	
	public ISBN(int id, String isbn) {
		super();
		this.id = id;
		this.isbn = isbn;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
}
