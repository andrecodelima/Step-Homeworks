package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Cliente;


public class ClienteServiceImplementation {
	public static boolean insert(Cliente p) throws SQLException {
		Connection conexao = Db.conect();
		
		try {
			String sql = "INSERT INTO cliente (nome, telefone, email, endereco) VALUES (?,?,?,?)";
			
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setString(1, p.getNome());
			comando.setString(2, p.getTelefone());
			comando.setString(3, p.getEmail());
			comando.setString(4, p.getEndereco());
			
			comando.execute();
			
			Db.Disconnect(conexao);
			return true;
			
		} catch(SQLException e) {
			System.out.println("Erro ao cadastrar: " + e);
		}
		
		Db.Disconnect(conexao);
		return false;
	}
	
	public static ArrayList<Cliente> getAll() throws SQLException{
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		Connection conexao = Db.conect();
		
		try {
			String sql = "SELECT * FROM cliente";
			Statement comando = conexao.createStatement();
			
			ResultSet resultados = comando.executeQuery(sql);
			
			while(resultados.next()) {
				lista.add(new Cliente(
							resultados.getInt("id"),
							resultados.getString("nome"),
							resultados.getString("telefone"),
							resultados.getString("email"),
							resultados.getString("endereco")
						));
			}
			
		}catch(SQLException e) {
			System.out.println("Erro ao excluir: " + e);
		}		
		
		Db.Disconnect(conexao);
		return lista;
	}
	
	public static Cliente getById(int id) throws SQLException{
		Cliente p = new Cliente();
		Connection conexao = Db.conect();
		
		try {
			String sql = "SELECT * FROM cliente WHERE id = " + id;
			Statement comando = conexao.createStatement();
			
			ResultSet resultados = comando.executeQuery(sql);
			
			while(resultados.next()) {
			 	p = new Cliente(
						resultados.getInt("id"),
						resultados.getString("nome"),
						resultados.getString("telefone"),
						resultados.getString("email"),
						resultados.getString("endereco")
					);
			}
			
		}catch(SQLException e) {
			System.out.println("Erro ao excluir: " + e);
		}		
		
		Db.Disconnect(conexao);
		return p;
	}

	public static ArrayList<Cliente> getByEmail(String email) throws SQLException{
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		Connection conexao = Db.conect();
		
		try {
			String sql = "SELECT * FROM cliente WHERE email LIKE '%" + email +"%'";
			Statement comando = conexao.createStatement();
			
			ResultSet resultados = comando.executeQuery(sql);
			
			while(resultados.next()) {
				lista.add(new Cliente(
						resultados.getInt("id"),
						resultados.getString("nome"),
						resultados.getString("telefone"),
						resultados.getString("email"),
						resultados.getString("endereco")
					));
			}
			
		}catch(SQLException e) {
			System.out.println("Erro ao excluir: " + e);
		}		
		
		Db.Disconnect(conexao);
		return lista;
	}
}
