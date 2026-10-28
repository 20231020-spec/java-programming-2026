package person;

// Person을 상속
// 학번(studentNo), 학과(department) 속성을 추가

public class Student extends Person {
	private int studentNo;
	private String department;
	
	public Student(String name, int age, int studentNo, String department) {
		super(name, age);
		this.studentNo = studentNo;
		this.department = department;
	}
	
	public void printDepartment() {
		System.out.println("학과: " + this.department);
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("학번: " + this.studentNo);
		System.out.println("학과: " + this.department);
	}

}
