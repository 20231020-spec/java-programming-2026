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
	
	Student() {
		studentId = 20231020;
		name = "이성호";
		city = "세종";
		phonenumder = 010-4968-4889;
		score = 3.5;
	}
	Student(int Id, String n) { 	
		studentId = Id;
		name = n;
		city = "대전";
		phonenumder = 010-9999-9898;
		score = 4.2;
		
	}
	void print() {
		System.out.println("학번: " + studentId + ",  
	}
}
