package com.v4s.insurance.services;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class EmailMatch {

	public boolean emailMatch(String match){

		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		final String DB_URL = "jdbc:mysql://localhost/insuranceregisteration";
		final String USER = "root";
		final String PASS = "root";
		Connection conn = null;
		Statement stmt = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
			//STEP 4: Execute a query
			stmt = (Statement) conn.createStatement();
			String sql = "SELECT * from insuranceregisteration.user";
			ResultSet rs = stmt.executeQuery(sql);
			//STEP 5: Extract data from result set
			while(rs.next()){
				String email = rs.getString("email");
				System.out.println(email);
				if(match==email) {
					System.out.println("Not found");
					return true;
				}
				else {
					return false;
				}
			}
		}catch(Exception e){

		}
		return true;

	}

}
