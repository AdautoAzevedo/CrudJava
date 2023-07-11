package model;

public class Employee {
	private String fName;
	private String lName;
	private String function;
	private float salary;
	
	public Employee(String fName,String lName, String function, float salary) {
		this.fName = fName;
		this.lName = lName;
		this.function = function;
		this.salary = salary;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getLName() {
		return lName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
		
}
