package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookFile {

	public static void main(String[] args) {
		
		File file = new File("book.txt");
		Book[] books = new Book[10];
		int bookCount = 0;
		
		try (Scanner scanner = new Scanner(file);
				FileWriter writer = new FileWriter("book_result.txt")) {
			// 파일에 있느 책 정보를 읽음
			while (scanner.hasNextLine()) {
						
				String line = scanner.nextLine();
				String[] split = line.split(",");
				
				int bookNo = Integer.parseInt(split[0]);
				String title = split[1];
				String author = split[2];
				String publisher = split[3];
				int publishYear = Integer.parseInt(split[4]);
				String isbn = split[5];
				
				Book book = new Book (bookNo, title, author, publisher, publishYear, isbn);
				books[bookCount++] = book;
				
				for (String s: split) {
					System.out.println(s);
			}
			
			}
			
			for (int i = 0; i < bookCount; i++) {
				books[i].printInfo();
			}
			// 새로운 책 정보 추가
			books[bookCount++] = new Book(5, "새로운 책", "저자이름", "출판사이름", 2026, "1111-1111-1111");
			
			// 수정된 책 정보 포함해서 쓰기
			for (int i = 0; i < bookCount; i++) {
				writer.write(
						books[i].getBookNo() + "," + 
						books[i].getTitle() + "," +
						books[i].getAuthor() + "," +
						books[i].getPublisher() + "," +
						books[i].getPublishYear() + "," +
						books[i].getIsbn() + "\n");
				}

			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	

}
