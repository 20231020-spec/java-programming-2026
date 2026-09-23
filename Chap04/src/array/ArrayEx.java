package array;

public class ArrayEx {

	public static void main(String[] args) {
		
		// int intArray[]; // 배열 참조 변수 
//		int[] intArray;
//		intArray = new int[5];
		
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[2] = 4;
		System.out.println(intArray[2]);
		
		// intArray[5] = 10; // 오류
		
		double[] doubleArray = { 0.01, 0.02, 0.03, 0.04, 0.05 }; // 길이 5인 배열이 만들어지고 더블어레이가 그것을 가르킨다.
		System.out.println(doubleArray[4]);
		
		// System.out.println(doubleArray[-2]); // 범위에 벗어나는 것은 사용 불가능 파이썬이랑 다르다 (음수 등)
		
		for (int i = 0; i < 5; i++) {
			System.out.println(doubleArray[i]);
		}
		
		double[] myArray = doubleArray;
		System.out.println(myArray[3]);
		
		myArray[3] = 0.07;
		System.out.println(myArray[3]);
		
	}

}
