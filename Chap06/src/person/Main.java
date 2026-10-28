package person;

public class Main {

	public static void main(String[] args) {
		
		
		//업캐스팅
		Person student1 = new Student("이성호", 23, 20231020, "모바일융합공학과");
		Person student2 = new Student("강창수", 24, 20231010, "모바일융합공학과");
		
		student1.print();
		student2.print();
		
		// 다운캐스팅 - 강제형변환
		if (student2 instanceof Student) {
			((Student) student2).printDepartment();
		}
		
		Person person = new Person("홍길순", 23);
		person.print();
		
		if (person instanceof Student) {	
			((Student) person).printDepartment();
		} else {
			System.out.println("학생 객체가 아닙니다.");
		}
		
		System.out.println(person instanceof Person);
		System.out.println(person instanceof Student);
		System.out.println(student2 instanceof Person);
		System.out.println(student2 instanceof Student);
	}

}
