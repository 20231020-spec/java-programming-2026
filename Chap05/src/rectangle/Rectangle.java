package rectangle;

// width, height, getArea()
public class Rectangle {
	int width;
	int height;
	String name;
	
	// 매개변수 없는 생성자
	Rectangle() {
		width = 10;
		height = 10;
		name = "박스";
	}
	// 매개변수를 모두 지정한 생성자 
	Rectangle(int w, int h, String n) {
		width = w;
		height = h;
		name = n;
	}

	double getArea() {
		return width * height;
	}
}
