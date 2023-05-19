package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db{
	
	public static Connection Connecta() {
		
		Connection conn = null;
		
		final String usr 	= "root";
		final String pass	= "1234567";
		final String host   = "localhost";
		
		final String url    = "jbdc:mysql//" + host + "dblanchonete?verifyServerCertificate=false&useSSL=true";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(usr, pass, host);
			
			System.out.println("Conectado!");
			
			return conn;
			
		}catch (Exception e) {
			System.err.println(e);
			System.err.println("Falha na conexão");
			
			return null;
		}
		
	}
	
	
	public static void Desconecta(Connection conn) throws SQLException{
		
		conn.close();
	}
	
}