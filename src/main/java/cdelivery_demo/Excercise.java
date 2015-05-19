package cdelivery_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Excercise {

	public void RunDemoDBFunctions() 
	{
		// This code will be for RunDemo
		Connection conn = null;

		try {
		    conn =
		       DriverManager.getConnection("jdbc:mysql://localhost/cdelivery_demo_db?" +
		                                   "user=root&password=!dynatrace");

		    // Do something with the Connection
		    
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
	
	public void RunDemoWebServiceCalls()
	{
		// This code will call Services
	}
	
	public String RunDemoProblem1()
	{
		return "true";
	}
}
