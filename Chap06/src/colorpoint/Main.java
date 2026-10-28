package colorpoint;

import point.Point;

public class Main {
	public static void main(String[] args) {
		Point point = new Point(1, 2);
//		point.set(1, 2);
		point.showPoint();
		
		ColorPoint colorPoint = 
				new ColorPoint(3, 4, "red");
//		colorPoint.set(3, 4);
//		colorPoint.setColor("red");
		colorPoint.showColorPoint();
		
		
//		// 업캐스팅(upcasting)
		Point point2 =  new ColorPoint(5, 6, "blue");
//		point2.set(5, 6);
		point2.showPoint();
		// point2.setColor("blue");
	}

	
}