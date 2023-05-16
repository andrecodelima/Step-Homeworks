package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	
	public static void main(String[] args) {
		
		//Teste de conexão
		Connect();
	}
	
	public static Connection Connect() {
		
		Connection conn = null;
		
		final String user = "root";
		final String pass = "1234567";
		final String host = "localhost";
		
		final String url = "jdbc:mysql://" + host + ":" + "/dbcursostep?verifyServerCertificate=false&useSSL=true";
		//Parametros passados para estabelecer uma conexão segura
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pass);
			
			System.out.println("Conectado!");
			
		}catch(ClassNotFoundException e) {
		
			System.err.println(e);
			System.err.println("Erro na conexão");

		}catch(SQLException e) {
			
			System.err.println("Erro na conexão");
		}
		
		
		return conn;
		
	}
	
	
	public static void desconecta(Connection conn) throws SQLException {
		
		conn.close();
		
	}
	
}
