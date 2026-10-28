package colorpoint;

import point.Point;

public class ColorPoint extends Point {


	private String color;
	
//	public ColorPoint() {
//		super(0, 0); // 22 전 버전에서는 무조건 첫번째 문장이어야 함
//		System.out.println("ColorPoint 생성자 호출");
//		this.color = "무색";
//	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color + " ");
		super.showPoint();
		
	}
	
	// 재귀호출 super.showpoint 아랫 부분에 super가 없을 시 그리됨.
	@Override
	public void showPoint() {
		System.out.print(color + " ");
		super.showPoint();
		}
}
