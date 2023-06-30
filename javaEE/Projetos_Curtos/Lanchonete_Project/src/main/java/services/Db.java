package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

	public static Connection conect() {
		
		Connection 	conn 	= null;
		
		final String usr 	= "root";
		final String pass	= "1234567";
		final String host	= "localhost";
		
		final String url 	= "jdbc:mysql://" + host + ":" + "/dblanchonete?verifyServerCertificate=false&useSSL=true"; 
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,usr,pass);
			
			System.out.println("Conectado!");
			
		}catch (Exception e) {
			System.err.println(e);
			System.err.println("Falha na Conexão");
		}
		
		return conn;
		
	}
	
	
	public static void Disconnect(Connection conn) throws SQLException {
		
		conn.close();
		
	}
}
