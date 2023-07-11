package view;

import java.util.Scanner;

import model.Employee;
import persistence.DBOperations;

public class UpdateCommunication {
	private String fName;
	private String lName;
	private String function;
	private float salary;
	private int id;
	
	Scanner read = new Scanner(System.in);
	
	public void communication() {
		System.out.println("What is the employee's id?");
		id = read.nextInt();
		System.out.println("\n\nPlease register the new employee's informations:\n");
		System.out.println("\nFirst Name:");
		fName= read.nextLine();
		System.out.println("\nLast Name:");
		lName= read.nextLine();
		System.out.println("\nFunction:");
		function = read.nextLine();
		System.out.println("\nSalary:");
		salary = read.nextFloat();
		
	}
	
	public void update() {
		Employee employee = new Employee(fName,lName, function, salary);
		
		System.out.println(employee.getfName() +""+ employee.getLName());
		
		DBOperations db = new DBOperations();
		
		System.out.println(db.update(employee, id));	
	}
}
