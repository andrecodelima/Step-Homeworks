package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Cliente;

public class ClienteserviceImplementation {
	
	public static boolean insert(Cliente cliente) {
		
		Connection conn = Db.conect();
		
		try {
			
			String sql = "INSERT INTO  cliente(nome, telefone, email, endereco) VALUES (?,?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, cliente.getNome());
			st.setString(2, cliente.getTelefone());
			st.setString(3, cliente.getEmail());
			st.setString(4, cliente.getEndereco());

		 
			
			st.execute();
     		System.out.println("Cadastro realizado");

			st.close();
			
			return true;
			
			
		}catch (Exception e) {
			System.out.println("Falha no cadastro" + e);
		}
		
		return false;
		 
	}
	
	public static ArrayList<Cliente>getCliente(){
		
		Connection conn = Db.conect();
		
		try {
			
			String 		sql 	= "SELECT * FROM cliente";
			Statement 	st 		= conn.createStatement();
			ResultSet   result  = st.executeQuery(sql); 
			
			ArrayList<Cliente>lista = new ArrayList<Cliente>();
			
			while(result.next()) {
				lista.add(new Cliente(result.getInt("id"),
									  result.getString("nome"),
									  result.getString("telefone"),
									  result.getString("email"),
									  result.getString("endereco")
							)
						);
			}
			
			st.close();
			Db.Disconnect(conn);
			return lista;
			
			
		}catch (Exception e) {
			System.err.println("Erro na conexão");
			
		}
		
		return null;
	}
	 
}
















