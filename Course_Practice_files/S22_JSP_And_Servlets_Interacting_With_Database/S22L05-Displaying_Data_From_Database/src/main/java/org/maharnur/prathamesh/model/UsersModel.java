package org.maharnur.prathamesh.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.maharnur.prathamesh.config.DatabaseConfig;
import org.maharnur.prathamesh.entity.User;


public class UsersModel {
	
	public List<User> listuser(){
		List<User> listusers = new ArrayList<>();
		
		// Step1: Connection object init
		Connection connect = DatabaseConfig.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		// Step2: Create a query
		String query = "SELECT * FROM users";
		
		try {
			stmt = connect.createStatement();
			
			// Step3: Execution of statement
			
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				listusers.add(new User(rs.getInt("user_id"), rs.getString("user_name"), rs.getString("email_id")));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listusers;
	}
}
