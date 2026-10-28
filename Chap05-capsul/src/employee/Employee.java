package employee;

import java.time.LocalDate;

public class Employee {

	private int employeeNo;
	private String name;
	private String department;
	private LocalDate hireDate;
	private String job;
	private int salary;
	
	
	public Employee(int employeeNo,String name, String department, LocalDate hireDate, String job, int salary) {
		this.employeeNo = employeeNo;
		this.name = name;
		this.department = department;
		this.hireDate = hireDate;
		this.job = job;
		this.salary = salary;
	}
	
	public Employee(int employeeNo,String name) {
		this.employeeNo = employeeNo;
		this.name = name;
		this.department = "미정";
		this.hireDate = LocalDate.now();
		this.job = "미정";
		this.salary = 0;
	}
	
	
	Employee() {	
	}
	
	//Getter Setter
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department){
		this.department = department;
	}
		
	public String getJob(){
		return this.job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	public void print()
	{
		System.out.println(this.employeeNo);
		System.out.println(this.name);
		System.out.println(this.department);
		System.out.println(this.hireDate);
		System.out.println(this.job);
		System.out.println(this.salary);
	}
}
