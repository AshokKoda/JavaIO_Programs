package employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	public enum IOService{CONSOLE_IO, FILE_IO, DB_IO, REST_IO}
	public List<EmployeePayrollData> employeePayrollList;
	
	public EmployeePayrollService() {} //Constructor
	
	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {}
	
	public void writeEmployeePayrollData() {
		System.out.println("\nWriting Employee Payroll to Console\n" + employeePayrollList);
	}
	
	public void readEmployeePayrollData() {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter Employee ID: ");
		int id = scanner.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = scanner.next();
		System.out.println("Enter Employee Salary: ");
		double salary = scanner.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}
	
	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner sc = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData();
		employeePayrollService.writeEmployeePayrollData();
	}
	
	
}
