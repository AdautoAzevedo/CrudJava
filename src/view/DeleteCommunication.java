package view;

import java.util.Scanner;

import persistence.DBOperations;

public class DeleteCommunication {
	private String fName;
	private String lName;
	
	Scanner read = new Scanner(System.in);
	
	public void communication() {
		System.out.println("Please digit the name of the employee bellow:\n");
		System.out.println("\nFirst Name:");
		fName= read.nextLine();
		System.out.println("\nLast Name:");
		lName= read.nextLine();
		delete();
	}
	
	public void delete() {
		DBOperations db = new DBOperations();
		
		System.out.println(db.delete(fName, lName));	
	}
}