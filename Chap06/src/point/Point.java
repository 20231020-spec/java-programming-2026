package point;


// x, y 좌료를 위한 속성
// set 메서드
// showPoint 메서드
public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		System.out.println("Point 생성자 호출");
		this.x = x;
		this.y = y;
	}
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	
}
