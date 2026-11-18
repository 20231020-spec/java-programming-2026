package chap08;

public class ExceptionEx {

	public static void main(String[] args) {
//		 ArithmeticException 
		try {
			int dividend = 10;
			int divisor = 0;
		System.out.println(dividend / divisor);
		System.out.println("정상적으로 수행됨");
		}
		catch (ArithmeticException e) {
			System.err.println("0으로 나눈 예외가 발생함");
		} finally {
			System.out.println("첫번째 예제 수행이 완료됨.");

		}
		
		
		
		try {
		int[] numbers = new int[2];
		numbers[0] = 1;
//		numbers[1] = 2;
//		numbers[1] = Integer.parseInt("2");
		numbers[1] = Integer.parseInt("two");
		numbers[2] = 2;


		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 예외 " + e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
//		e.printStackTrace();
		} finally {
			System.out.println("두번째 예제 수행이 완료됨");
		}
		
	}

}
