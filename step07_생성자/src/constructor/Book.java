package constructor;
/*
 * -title:String
 * -author:String
 * -page:int
 * +Book();
 * +Book(title:String, author:String, page:int)
 * +setter&getter
 * +toString():String
 */
public class Book {
	private String title;
	private String author;
	private int page;
	public Book() {
		
	}
	public Book(String title,String author,int page) {
		this.title=title;
		this.author=author;
		this.page=page;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPage() {
		return page;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String toString() {
		return getTitle()+"의 저자는 "+getAuthor()+"이고 "+getPage()+"페이지로 구성됨";
	}
	
}
