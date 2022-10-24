package bookStore;

public class BookName {
	private int id;
	private String name;
	private int bookTypeId;
	private int authorId;

	public BookName(int id, String name, int bookTypeId, int authorId) {
		super();
		this.id = id;
		this.name = name;
		this.bookTypeId = bookTypeId;
		this.authorId = authorId;
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

	public int getBookTypeId() {
		return bookTypeId;
	}

	public void setBookTypeId(int bookTypeId) {
		this.bookTypeId = bookTypeId;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

}
