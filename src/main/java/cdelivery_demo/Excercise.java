package cdelivery_demo;

import java.sql.*;


public class Excercise {

	public void RunDemoDBFunctions() 
	{
		// This code will be for RunDemo
		Connection conn = null;

		try {
		    conn =
		       DriverManager.getConnection("jdbc:mysql://localhost:3306/cdelivery_demo_db?" +
		                                   "user=root&password=!Dynatrace");

		    // Do something with the Connection
		    Statement stmt = conn.createStatement();
		    ResultSet rs;
		    
		    rs = stmt.executeQuery("SELECT * FROM demo_table");
		    while( rs.next() )
		    {
		    String fullname = rs.getString("Name");
		  	System.out.println(fullname); 
		    }
		    conn.close();
		    
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
