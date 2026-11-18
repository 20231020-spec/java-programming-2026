package student;

public class Student {
	int studentId;
	String name;
	String city;
	int phonenumder;
	double score;
	
	Student(int Id, String n, String c, int p, int sc) {
		studentId = Id;
		name = n;
		city = c;
		phonenumder = p;
		score = sc;
	}

	
	void print() {
		System.out.println(
				"학번: "  + studentId 
				+ ", 이름: " + name + ", 사는 곳: " + city + ", 전화번호: " + phonenumder + ", 점수: " + score);
	}
}
