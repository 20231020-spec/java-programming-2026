package staticex;

public class Main {

	public static void main(String[] args) {

		StaticMethod.f2(0);
		StaticMethod.m = 10;
		
		StaticMethod staticMethod = new StaticMethod();
		staticMethod.n = 1;
		staticMethod.m = 1;
		StaticMethod.f2(0);
		
		
		StaticMethod staticMethod2 = new StaticMethod();
		staticMethod.n = 2;
		staticMethod.m = 2;
		StaticMethod.f2(0);
		
		System.out.println("1: " + staticMethod.n + ", " + staticMethod.m);
		System.out.println("2: " + staticMethod.n + ", " + staticMethod.m);
		
		System.out.println(Calculator.add(1, 2));
		System.out.println(Calculator.max(1, 2));
	}

}
