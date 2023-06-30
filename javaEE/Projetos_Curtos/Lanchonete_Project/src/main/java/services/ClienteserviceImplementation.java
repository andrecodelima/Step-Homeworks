package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Cliente;
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
	 
	
public static ArrayList<Cliente>getClienteByName(String nome){
		
		Connection conn = Db.conect();
		
		try {
			
			String sql = "SELECT * FROM cliente WHERE nome LIKE '%" + nome + "%'";
			Statement 	st 		= conn.createStatement();
			ResultSet   result  = st.executeQuery(sql); 
			
			ArrayList<Cliente>lista = new ArrayList<Cliente>();
			
			while(result.next()) {
				lista.add(new Cliente(result.getInt("id"),
									  result.getString("nome"),
									  result.getString("telefone"),
									  result.getString("endereco"),
									  result.getString("email")
							)
						);
			}
			
			st.close();
			Db.Disconnect(conn);
			return lista;
			
			
		}catch (Exception e) {
			System.err.println("Erro ao consultar Cliente" + e);
			
		}
		
		return null;
	}
	

public static boolean delClient(int id) {
		
		Connection conn = Db.conect();
		
		try {
			
			String sql = "DELETE from cliente WHERE id=?";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setInt(1, id);
			st.execute();
			
			System.out.println("Cliente deletado");
			st.close();
			
			return true;
			
		}catch (Exception e) {
			
			System.out.println(e);
			System.out.println("Falha ao deletar cliente");
		}
		
		return false;
		
	}


public static Cliente getClientById(int id){
	
	Connection conn = Db.conect();
	
	try {
		
		String sql = "SELECT * FROM cliente WHERE id=" + id;
		
		Statement st = conn.createStatement();
		ResultSet result = st.executeQuery(sql);
		
		Cliente cliente = new Cliente();
		
		while(result.next()) {
			
			cliente = new Cliente(result.getInt("id"),
								 result.getString("nome"),
								 result.getString("telefone"),
								 result.getString("endereco"),
								 result.getString("email")
								 );
		}
		
		Db.Disconnect(conn);
		st.close();
		return cliente;
		
		
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}

public static ArrayList<Cliente> getClientByname(String nome){
	
	Connection conn = Db.conect();
	
	try {
		
		String sql = "SELECT * FROM cliente WHERE nome LIKE '%" + nome + "%'";
		
		Statement st = conn.createStatement();
		ResultSet result = st.executeQuery(sql);
		
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
		
		Db.Disconnect(conn);
		st.close();
		return lista;
		
		}catch (Exception e) {
			System.out.println("Erro ao consultar nome " + e);
		}
		
		return null;
	}



public static boolean updateClient(Cliente c) throws SQLException{
	Connection conn = Db.conect();
	
	if(conn == null) {
		System.err.println("Falha na conexão");
	
	}
	
	String sql = "UPDATE cliente	"	+
				  
				 "SET nome =	?,"		+
				 "telefone = 	?,"		+
				 "endereco =	?,"		+
				 "email 	=	? "		+

				 
				 "WHERE id	=	?"		;
	
	try {
		
		PreparedStatement st	= conn.prepareStatement(sql);
		st.setString(1, c.getNome());
		st.setString(2, c.getTelefone());
		st.setString(3, c.getEndereco());
		st.setString(4, c.getEmail());
		st.setInt(5, c.getId());
		
		st.execute();
		System.out.println("Cliente atualizado");
		Db.Disconnect(conn);
		
		return true;
		
		
	}catch (Exception e) {
		System.err.println(e);
		System.err.println("Erro durante atualização");
				
		
	}
	
	Db.Disconnect(conn);
	return false;
	
	}



}
















