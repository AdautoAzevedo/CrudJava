package view;

import java.util.Scanner;

import persistence.DBOperations;

public class GetByIdCommunication {
	
    private int id;
	Scanner read = new Scanner(System.in);
	DBOperations db = new DBOperations();
    

	public void communication() {
		System.out.println("\nPlease, digit the id of the employee:");
        id = read.nextInt();
        db.getById(id);
    }
}