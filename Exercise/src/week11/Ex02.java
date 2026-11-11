package week02;
import java.util.Scanner;

import java.util.Scanner;

// 학생 이름, 자바 점수, 파이썬 점수를 입력받아 각 과목의 점수, 총점 평균을 출력하는 프로그램
public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		
		String name = scanner.next();
		System.out.println("이름 :" + name);
		
		int java = scanner.nextInt();
		System.out.println("자바 점수 :" + java);
		
		int python = scanner.nextInt();
		System.out.println("파이썬 점수 :" + python);
		
		System.out.println("====" + name + "의 성적 정보 ====");
		System.out.println("자바:   " + java);
		System.out.println("파이썬:   " + python);
		
		
		System.out.println("총점:   " + (java + python));
		System.out.printf("평균:   %.2f\n" , (double)(java + python) / 2);

	}

}
