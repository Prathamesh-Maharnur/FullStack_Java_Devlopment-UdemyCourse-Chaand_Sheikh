package org.maharnur.prathamesh.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
		public static Connection getConnection() {
			
			String url =
				    "jdbc:mysql://localhost:3306/udemy_studyeasy"
				  + "?useSSL=false"
				  + "&allowPublicKeyRetrieval=true"
				  + "&serverTimezone=UTC";
			String userName = "root";
			String userPassword = "cdac";
			Connection con = null;
			
			try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, userName, userPassword);
			}catch(SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}
}
