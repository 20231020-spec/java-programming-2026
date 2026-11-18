package week11.printedbook;

import week11.book.Book;
import week11.borrow.Borrow;

public class PrintedBook extends Book implements Borrow{
	private boolean borrowed;
	private String location;
	
	public PrintedBook(int bookNo, String title, String author, String publisher, int publishYear, String isbn, boolean borrowed, String 
			location) {
		super (bookNo, title, author, publisher, publishYear, isbn);
		
		this.borrowed = borrowed;
		this.location = location;
	}


	@Override
	public void printInfo() {
		System.out.println("도서번호: " + bookNo);
		System.out.println("제목: " + title);
		System.out.println("저자: " + author);
		System.out.println("출판사: " + publisher);
		System.out.println("출판연도: " + publishYear);
		System.out.println("ISBN: " + isbn);
		System.out.println("빌림여부: " + borrowed);
		System.out.println("저장위치: " + location);
	}


	@Override
	public void checkOut() {
		this.borrowed = true;
	
	}


	@Override
	public void checkIn() {
		this.borrowed = false;
			
	}
}
