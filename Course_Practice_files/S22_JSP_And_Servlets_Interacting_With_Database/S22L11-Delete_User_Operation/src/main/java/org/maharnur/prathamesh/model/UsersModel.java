package org.maharnur.prathamesh.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	
	public void addUser(User newUser) {
		Connection connect = null;
		PreparedStatement statement = null;
		
		try {
			connect = DatabaseConfig.getConnection();
			String user_name = newUser.getUser_name();
			String email_id = newUser.getEmail_id();
			String query = "INSERT INTO users(user_name, email_id) VALUES(?,?)";
			
			statement = connect.prepareStatement(query);
			statement.setString(1, user_name);
			statement.setString(2, email_id);
			
			statement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void updateUser(User updatedUser) {
			Connection connect = null;
			PreparedStatement statement = null;
			
			try {
				connect = DatabaseConfig.getConnection();
				int user_id = updatedUser.getUser_id();
				String user_name = updatedUser.getUser_name();
				String email_id = updatedUser.getEmail_id();
				
				String query = "UPDATE users SET user_name=?, email_id=? WHERE user_id = ?";
				
				statement = connect.prepareStatement(query);
				statement.setString(1, user_name);
				statement.setString(2, email_id);
				statement.setInt(3, user_id);
				
				statement.execute();
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
	
	
	public void deleteUser(int user_id) {
		Connection connect = null;
		PreparedStatement statement = null;
		
		try {
			connect = DatabaseConfig.getConnection();
			
			String query = "DELETE FROM users WHERE user_id = ?";
			
			statement = connect.prepareStatement(query);
			statement.setInt(1, user_id);
			
			statement.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
