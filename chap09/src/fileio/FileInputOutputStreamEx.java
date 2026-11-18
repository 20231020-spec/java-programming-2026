package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamEx {
	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};

		try {
			FileOutputStream fout = new FileOutputStream("test.out");
//			for (int i = 0; i < b.length; i++) {
//				fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
//		    }
			fout.write(b);

			fout.close();
		} catch(IOException e) { }
		
		b = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("test.out");
			int n = 0, c;
//			while((c = fin.read())!= -1) {
//				b[n] = (byte)c; // 읽은 바이트를 배열에 저장
//				n++;
//			}
			n = fin.read(b);

			for (int i = 0; i < n; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();

			fin.close();
		} catch (IOException e) {
		}
	}
}


