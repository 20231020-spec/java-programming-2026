package fileio;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private String publisher;
	private int publishYear;
	private String isbn;
	
	public Book (int bookNo, String title, String author, String publisher, int publishYear, String isbn) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishYear = publishYear;
		this.isbn = isbn;
	}
	
	
	public int getBookNo() {
		return bookNo;
	}


	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	public String getPublisher() {
		return publisher;
	}


	public int getPublishYear() {
		return publishYear;
	}


	public String getIsbn() {
		return isbn;
	}


	public void printInfo() {
		System.out.println("도서번호: " + bookNo);
		System.out.println("제목: " + title);
		System.out.println("저자: " + author);
		System.out.println("출판사: " + publisher);
		System.out.println("출판연도: " + publishYear);
		System.out.println("ISBN: " + isbn);
	}
}
