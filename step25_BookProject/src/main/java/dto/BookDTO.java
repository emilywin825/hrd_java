package dto;

public class BookDTO {
	private String isbn;
	private String title;
	private String author;
	private String company;
	private int price;
	
	public BookDTO() {
		
	}

	public BookDTO(String isbn, String title, String author, String company, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.company = company;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCompany() {
		return company;
	}

	public int getPrice() {
		return price;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
