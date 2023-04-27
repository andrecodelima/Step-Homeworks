package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	
	public static Connection conecta(){
		Connection conn = null;
		String user = "root";
		String pass = "1234567";
		String port = "3306";
		String host = "localhost";
		String url = "jdbc:mysql://" + host + ":" + port + "/cursodb";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, user, pass);
						
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	public static void closeCon(Connection conn) {
		
		try {
			
			conn.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
