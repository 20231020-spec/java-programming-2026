package employee;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
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
		
		
		for(Employee employee: employees) {
			if(employee.getDepartment().equals("미정")) {
				employee.print();
			}
		}
	}

}
