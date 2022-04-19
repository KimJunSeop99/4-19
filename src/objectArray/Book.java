package objectArray;

public class Book {
	private String bookName;
	private String author;

	// 출력메소드
	public void showBookInfo() {
		System.out.println(bookName + " " + author);
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

//	기본생성자
	public Book() {
	}

//	매개변수2개 생성자
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

}
