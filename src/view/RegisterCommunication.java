package view;

import java.util.Scanner;

import model.Employee;
import persistence.DBOperations;

public class RegisterCommunication {
	private String fName;
	private String lName;
	private String function;
	private float salary;
	
	Scanner read = new Scanner(System.in);
	
	public void communication() {
		System.out.println("Please register the employee bellow:\n");
		System.out.println("\nFirst Name:");
		fName= read.nextLine();
		System.out.println("\nLast Name:");
		lName= read.nextLine();
		System.out.println("\nFunction:");
		function = read.nextLine();
		System.out.println("\nSalary:");
		salary = read.nextFloat();
		
		register();
	}
	
	public void register() {
		Employee employee = new Employee(fName,lName, function, salary);
		
		System.out.println(employee.getfName() +""+ employee.getLName());
		
		DBOperations db = new DBOperations();
		
		System.out.println(db.insert(employee));
		
	}
}
