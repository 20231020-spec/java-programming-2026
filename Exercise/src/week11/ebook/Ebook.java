package week11.ebook;

import week11.book.Book;

public class Ebook extends Book {
	private double fileSize;
	private String flieType;
	
	public Ebook (int bookNo, String title, String author, String publisher, int publishYear, String isbn, double fileSize, String flieType) {
		super (bookNo, title, author, publisher, publishYear, isbn);
		this.fileSize = fileSize;
		this.flieType = flieType;
	}
	@Override
	public void printInfo() {
		System.out.println("도서번호: " + bookNo);
		System.out.println("제목: " + title);
		System.out.println("저자: " + author);
		System.out.println("출판사: " + publisher);
		System.out.println("출판연도: " + publishYear);
		System.out.println("ISBN: " + isbn);
		System.out.println("파일형식: " + fileSize);
		System.out.println("파일크기: " + flieType);
	}
}
