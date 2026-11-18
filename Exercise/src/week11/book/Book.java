package week11.book;

public abstract class Book {

	protected int bookNo;
	protected String title;
	protected String author;
	protected String publisher;
	protected int publishYear;
	protected String isbn;
	
	public Book (int bookNo, String title, String author, String publisher, int publishYear, String isbn) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishYear = publishYear;
		this.isbn = isbn;
	}
	public abstract void printInfo();
	
	
}
