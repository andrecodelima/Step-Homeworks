package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Aluno;
import services.Db;

public class DAO {
	
	public static boolean insert(Aluno aluno) {
		
		Connection conexao = Db.conecta();
		String sql = "INSERT INTO aluno (nome, genero, email) VALUES (?,?,?)";
		
		try {
			PreparedStatement st = conexao.prepareStatement(sql);
			st.setString(1, aluno.getNome());
			st.setString(2, aluno.getGenero());
			st.setString(3, aluno.getEmail());
			
			st.execute();
			System.out.println("Usuário cadastrado!");
			
			return true;
			
			
		}catch(Exception e) {
			System.out.println(e);
			System.err.println("Falha no cadastro");
		}
		
		Db.desconecta(conexao);
		return false;
		
	}
	
	
	public static ArrayList<Aluno> getAll(){
		
		
		Connection conn = Db.conecta();
		try {
			
			String sql = "SELECT * FROM aluno";
			
			Statement st = conn.createStatement();
			
			ResultSet result = st.executeQuery(sql);
			ArrayList<Aluno> lista = new ArrayList<Aluno>();
			
			while(result.next()) {
				
				lista.add(new Aluno(result.getInt("id"),
									   result.getString("nome"),
									   result.getString("genero"),
									   result.getString("email")
										)
						);
			}
			
			st.close();
			Db.desconecta(conn);
			return lista;
			
		}catch(SQLException e) {
			System.err.println("ERRO AO LOCALIZAR ALUNO");
			System.err.println(e);
			
		}
		
		return null;
	}
	
	
	public static Aluno GetToId(int id) {
		
		Connection conn = Db.conecta();
		
		if(conn == null) {
			System.err.println("Erro na conexão");
		
		}else {
			
			String sql = "SELECT * FROM aluno WHERE id = " + id;
			
			try {
				
				Statement st = conn.createStatement();
				
				ResultSet result = st.executeQuery(sql);
				Aluno aluno = new Aluno();
				
				while(result.next()) {
						aluno = new Aluno(  result.getInt("id"),
											result.getString("nome"),
											result.getString("genero"),
											result.getString("email")
								);
			
				}
			
				st.close();
				Db.desconecta(conn);
				return aluno;							
								
			}catch(Exception e) {
				System.out.println("ERRO AO BUSCAR POR ID");
				System.err.println(e);

			}
		}
		
		Db.desconecta(conn);
		return null;
		
	}
	
	
	public static boolean deleteId(int id) {
		
		Connection conn = Db.conecta();
		
		String sql = "DELETE FROM aluno WHERE id = ?";
		
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, id);
			
			st.execute();
			System.out.println("USUÁRIO DELETADO");
			Db.desconecta(conn);
			return true;
			
		}catch(Exception e) {
			System.out.println("ERRO AO DELETAR ALUNO");
		}
		
		Db.desconecta(conn);
		return false;
	}
	
	public static boolean updateAluno(Aluno a) {
		
		Connection conn = Db.conecta();
		if(conn == null) {
			System.err.println("Falha na conexão");
		
		}
		
		String sql = "UPDATE aluno "  + 
					 "SET nome =  ?,"	 +
					 "genero = ?,  "		 +
					 "email = ? "	 +
					 "WHERE id = ?"	 ;
				
		
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, a.getNome());
			st.setString(2, a.getGenero());
			st.setString(3, a.getEmail());
			st.setInt(4, a.getId());
			
			
			st.execute();
			System.out.println("Usuário atualizado");
			Db.desconecta(conn);
			return true;
			
		}catch(Exception e) {
			System.err.println("Erro durante cadastro");
			System.out.println(e);
		}
		
		Db.desconecta(conn);
		return false;
	}

}
