package fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("test.txt");
//			char c;
//			c = (char)reader.read();
//			System.out.println("input : " + c); // 반복문 사용시 더 편할 것
//			c = (char)reader.read();
//			System.out.println("input : " + c);
			
			int c;
			while ((c = reader.read()) != -1) {
				System.out.print((char)c);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.err.println("test.txt 파일이 없습니다.");
		} catch (IOException e) {
			System.err.println("파일을 읽을 수 없습니다.");
		}
		
		try {
			FileWriter writer = new FileWriter("result.txt");
			writer.write("result");
			writer.close();
		} catch (IOException e) {
			System.out.println("파일을 쓸 수 없습니다.");
		}
		
	}

}
