package loop;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 5개의 정수를 입력받아 더한 결과를 출력하는 반복문
		// 0과 음수는 빼고 더하시오.
		// 0 또는 음수이면 종료 2번
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int number = scanner.nextInt(); 
			if (number <= 0) {
				continue;  // break; 2번
			}
			sum += number;
		}
		System.out.println("합은" + sum + "입니다.");
		
	}

}
