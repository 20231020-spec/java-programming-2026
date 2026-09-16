package method;

public class NestedLoop {

	public static void main(String[] args) {
		gugudan();
	}
		
	
	static void gugudan() {
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + "*" + j + "=" + i * j);
				System.out.print("\t");
			}
			System.out.println();
	
		}
	}
}