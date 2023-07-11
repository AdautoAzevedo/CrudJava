package persistence;

import java.sql.*;

public class Connector {
	private String host;
	private String user;
	private String password;
	private String database;
	
	//Constructor
	public Connector() {
		this.host = "localhost";
		this.database = "mydb";
		this.user = "root";
		this.password = "password";
	}
	
	public Connection getConnection() {
		String url = "jdbc:mysql://" + this.host + "/" + this.database+"?verifyServerCertificate=false&useSSL=true";
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException ex) {
			System.out.println("Connection failure");
			ex.printStackTrace();
		}
		return null;
	}
	
}
