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
		id = Integer.parseInt(read.nextLine());
		getNewInfo();
	}
	
	public void getNewInfo() {
		
		System.out.println("Please digit the name of the employee bellow:\n");
		System.out.println("\nFirst name");
		fName = read.nextLine();
		System.out.println("\nLast Name:");
		lName= read.nextLine();
		System.out.println("\nFunction:");
		function = read.nextLine();
		System.out.println("\nSalary:");
		salary = read.nextFloat();
		
		update();
	}
	
	public void update() {
		Employee employee = new Employee(fName,lName, function, salary);
		
		System.out.println(employee.getfName() +""+ employee.getLName());
		
		DBOperations db = new DBOperations();
		
		System.out.println(db.update(employee, id));	
	}
}
