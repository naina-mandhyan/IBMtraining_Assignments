package com.ibm.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DaoClass {
	Connection dbCon;
	PreparedStatement state;
	
	DaoClass() {
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			//establishing connection
			this.dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsdtrainingibm", "root", "");
			//check for connection
			if(this.dbCon == null)
				System.out.println("connetcion not established");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Some error occured: "+ e);
	}
}
	
	public boolean fetchDetails(String user, String password) {
		try {
			Statement state = this.dbCon.createStatement();
			String fetchQuery = "Select * From firsttable WHERE Name="+"'"+user+"'";
			ResultSet rs = state.executeQuery(fetchQuery);
			//System.out.println();
//			if(rs.next())
//				return true;
//			else 
//				return false;
//			
			while(rs.next()) {
				if(password.equals(rs.getString("PhoneNo")))
					return true;
			}
				
		}
		catch(SQLException e) {
			System.out.println("some error while fetching" + e);
		}
		return false;
		
		
	}
}
