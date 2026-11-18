package week11.book;

public class Library {
	// 도서들을 관리하기 위한 books 배열 생성
	
	// addBook 메서드
	
	// printAll 메서드
	private static final int MAX_BOOK_COUNT = 10;
	private Book[] books = new Book[MAX_BOOK_COUNT];
	private int bookCount = 0;
	
	public void addBook (Book book) {
		this.books [bookCount++] = book;
	}
	public void printAII () {
		for (int i = 0; i < bookCount; i++) {
			books[i].printInfo();
		}
	}
}
