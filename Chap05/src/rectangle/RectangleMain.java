package rectangle;

public class RectangleMain {
	// 테블릿 만들고 활용해보기
	public static void main(String[] args) {

		Rectangle tablet = new Rectangle();
		tablet.name = "테블릿";
		tablet.width = 10;
		tablet.height = 6;
		
		System.out.println(tablet.name);
		System.out.println(tablet.getArea());
		
		Rectangle box = new Rectangle();
		System.out.println(box.name);
		System.out.println(box.getArea());
		
		Rectangle unknown = new Rectangle(20, 5, "unknown");
		System.out.println(unknown.name);
		System.out.println(unknown.getArea());
		
	}

}
