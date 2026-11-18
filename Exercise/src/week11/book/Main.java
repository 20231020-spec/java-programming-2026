package week11.book;

import week11.ebook.Ebook;
import week11.printedbook.PrintedBook;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		library.addBook( new Ebook(1, "요즘 개발자들을 위한 마이크로서비스 아키텍처", "이도원", "길벗", 2026,"11111",2.5,"pdf")
				);
		library.addBook(new PrintedBook(1, "요즘 개발자들을 위한 마이크로서비스 아키텍처", "이도원", "길벗", 2026,"11111",false,"대한민국 한밭대학교 도서관")
				);
		library.printAII();

	}

}
