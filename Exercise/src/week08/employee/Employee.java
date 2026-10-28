package week08.employee;

import java.time.LocalDate;

public class Employee {

	int employeeNo;
	String name;
	String department;
	LocalDate hireDate;
	String job;
	int salary;
	
	
	// new Employee(1001, "김민수", "개발부", LocalDate.parse("2024-03-04"), "소프트웨어 개발",3500000);
	Employee(int employeeNo,String name, String department, LocalDate hireDate, String job, int salary) {
		this.employeeNo = employeeNo;
		this.name = name;
		this.department = department;
		this.hireDate = hireDate;
		this.job = job;
		this.salary = salary;
	}
	
	// new Employee(1005, "박지훈");
	Employee(int employeeNo,String name) {
		this.employeeNo = employeeNo;
		this.name = name;
		this.department = "미정";
		this.hireDate = LocalDate.now();
		this.job = "미정";
		this.salary = 0;
	}
	
	
	Employee() {	
	}
	
	void print()
	{
		System.out.println(this.employeeNo);
		System.out.println(this.name);
		System.out.println(this.department);
		System.out.println(this.hireDate);
		System.out.println(this.job);
		System.out.println(this.salary);
	}
}
