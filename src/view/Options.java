package view;

import java.util.Scanner;

import persistence.DBOperations;

public class Options {
	Scanner read = new Scanner(System.in);
	int operation;
	
	public void optionsList() {
		System.out.println("Hello! What operation do you want?");
		System.out.println("1-Read all employees");
		System.out.println("2-Insert a new employee");
		System.out.println("3-Delete a employee's register");
		System.out.println("4-Update a employee's register");
		
		operation = read.nextInt();
		operationCall(operation);
	}
	
	public void operationCall(int op) {
		
		switch (op) {
		case 1:
			DBOperations db = new DBOperations();
			db.get();
			break;
		case 2:
			RegisterCommunication coms = new RegisterCommunication();
			coms.communication();
			break;
		case 3:
			DeleteCommunication delCom = new DeleteCommunication();
			delCom.communication();
			break;
		case 4:
			UpdateCommunication upCom = new UpdateCommunication();
			upCom.communication();
			break;
		default:
			System.out.println("Please digit a valaid value.");
			optionsList();
			break;
		}
	}
}
