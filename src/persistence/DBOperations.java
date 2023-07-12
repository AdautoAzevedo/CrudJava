package persistence;

import java.sql.*;

import model.Employee;

public class DBOperations {
	
	public boolean insert(Employee emp) {
		int value = 0;	//This value will store the value that is received in the executeUpdate() sql function.
		try {
			Connection conection = new Connector().getConnection();
			PreparedStatement result = conection.prepareStatement("INSERT INTO employees (lastName, firstName, job, salary) VALUES (?,?,?,?)");
			
			result.setString(1, emp.getLName());
			result.setString(2, emp.getfName());
			result.setString(3, emp.getFunction());
			result.setFloat(4, emp.getSalary());
			
			value = result.executeUpdate(); //This returns 1 (successful) or 0(failed)
			conection.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(value == 1)
			return true;
		else
			return false;
	}
	
	public void get() {
		int value = 0;	//This value will store the value that is received in the executeUpdate() sql function.
		try {
			Connection conection = new Connector().getConnection();
			
			String query = "SELECT * FROM employees";
            
            Statement statement = conection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
			
            while (resultSet.next()) {
    			int id = resultSet.getInt("id");
    			String lName = resultSet.getString("lastName");
                String fName = resultSet.getString("firstName");
                String function = resultSet.getString("job");
                float salary = resultSet.getFloat("salary");
                
                System.out.println("Id: "+id+",\nFull name: "+fName +" "+ lName+ ",\nFunction: "+function+",\nSalary: $"+salary+"\n\n");
            }
	
            resultSet.close();
            statement.close();				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean delete(String fName, String lName) {
		int value = 0;	//This value will store the value that is received in the executeUpdate() sql function.
		try {
			Connection conection = new Connector().getConnection();
			PreparedStatement result = conection.prepareStatement("DELETE FROM employees WHERE firstName = ? and lastName = ?");
			
			result.setString(1, fName);
			result.setString(2, lName);
			
			value = result.executeUpdate(); //This returns 1 (successful) or 0(failed)
			conection.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(value == 1)
			return true;
		else
			return false;
	}
	public boolean update(Employee emp, int id) {
		int value = 0;	//This value will store the value that is received in the executeUpdate() sql function.
		try {
			Connection conection = new Connector().getConnection();
			PreparedStatement result = conection.prepareStatement("UPDATE employees SET lastName = ?, firstName = ?, job = ?, salary = ? WHERE id = ?");
			
			result.setString(1, emp.getLName());
			result.setString(2, emp.getfName());
			result.setString(3, emp.getFunction());
			result.setFloat(4, emp.getSalary());
			result.setInt(5, id);
			
			value = result.executeUpdate(); //This returns 1 (successful) or 0(failed)
			conection.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(value == 1)
			return true;
		else
			return false;
	}
}
	
