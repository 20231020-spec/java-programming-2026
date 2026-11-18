package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try (Scanner scanner = new Scanner(file);
				FileWriter writer = new FileWriter("result.txt")) {
			
			while (scanner.hasNextLine()) {
						
				String line = scanner.nextLine();
				String[] split = line.split(",");
				for (String s: split) {
					System.out.println(s);
			}
				writer.write(split[0] + "," + split[1] + "\n");
		}

			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	

}
