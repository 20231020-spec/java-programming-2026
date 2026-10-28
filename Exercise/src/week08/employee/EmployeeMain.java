package week08.employee;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
//		Employee employee = new Employee(1001, "김민수", "개발부", LocalDate.parse("2024-03-04"), "소프트웨어 개발",3500000);
//		
//		Employee employee2 = new Employee(1005, "박지훈");
//		employee2.print();
//		
//		Employee employee3 = new Employee();
//		employee3.print();
		
		Employee[] employees = new Employee[4];
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i = 0;i<3;i++)
		{
			System.out.println("employeeNo : ");
			int employeeNo  = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("name : ");
			String name = scanner.nextLine();
			
			System.out.println("department : ");
			String department = scanner.nextLine();
			
			System.out.println("hireDate(yyyy-mm-dd): ");
			String date = scanner.nextLine();
			LocalDate hireDAte = LocalDate.parse(date);
			
			System.out.println("job : ");
			String job = scanner.nextLine();
			
			System.out.println("salary : ");
			int salary = scanner.nextInt();
			scanner.nextLine();
			
			employees[i] = new Employee(employeeNo,name,department,hireDAte,job,salary);
		}
		
		employees[3] =  new Employee(1005, "박지훈");
		
		for(Employee employee: employees) {
			employee.print();
		}
		
		for(int i = 0;i<employees.length;i++) {
			if (employees[i].department.equals("미정")) {
				employees[i].print();
			}
		}
		
		for(Employee employee: employees) {
			if(employee.department.equals("미정")) {
				employee.print();
			}
		}
	}

}
