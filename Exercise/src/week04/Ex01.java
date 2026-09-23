package week04;

import java.util.Scanner;

// 2~9 사이의정수를 입력 받아 해당 단을 출력하는 프로그램
public class Ex01 {

	public static void main(String[] args) {
		
		// 출력할 단을 입력한다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요 (2~9): ");
		int dan = scanner.nextInt();
		
		// 잘못된 입력인지 판단한다.
		if (dan < 2 || dan > 9) {
			System.out.println("잘몯된 입력입니다.");
			return; // 이 과정에서 멈추고 싶다면 사용한다 따라서 else를 안써도 된다. 를 사용할 시 아래 for 문이 else문에 포함이 된다.
		} 
		// 입력된 단에 대해 출력한다.
		for (int i = 1; i <= 9; i++) {
					System.out.println(dan + " x " + i + " = " + (dan * i));
		}
		}
	}
