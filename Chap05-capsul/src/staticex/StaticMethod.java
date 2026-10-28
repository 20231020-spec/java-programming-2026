package staticex;

public class StaticMethod {
	
	int n;
	static int m;
	void f1(int n) {
		this.n = n;
	}
	
	static void f2(int x) {
		// n =x;
		m =x;
		System.out.println("f2 called");
	}



}
