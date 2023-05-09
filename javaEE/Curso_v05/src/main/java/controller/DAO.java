package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.JavaBeans;
import services.Db;

public class DAO {
	
	public static boolean insert(JavaBeans aluno) {
		
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
	
	
	public static ArrayList<JavaBeans> getAll(){
		
		
		Connection conn = Db.conecta();
		try {
			
			String sql = "SELECT * FROM aluno";
			
			Statement st = conn.createStatement();
			
			ResultSet result = st.executeQuery(sql);
			ArrayList<JavaBeans> lista = new ArrayList<JavaBeans>();
			
			while(result.next()) {
				
				lista.add(new JavaBeans(result.getInt("id"),
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
	
	
	public static ArrayList<JavaBeans> GetToId(int id) {
		
		Connection conn = Db.conecta();
		
		if(conn == null) {
			System.err.println("Erro na conexão");
		
		}else {
			
			String sql = "SELECT * FROM aluno WHERE id = " + id;
			
			try {
				
				Statement st = conn.createStatement();
				
				ResultSet result = st.executeQuery(sql);
				ArrayList<JavaBeans> list = new ArrayList<JavaBeans>();
				
				JavaBeans aluno = new JavaBeans(result.getInt("id"),
												result.getString("nome"),
												result.getString("genero"),
												result.getString("email")
												);
				
				st.close();
				Db.desconecta(conn);
				return list;			
								
			}catch(Exception e) {
				System.out.println("ERRO AO BUSCAR POR ID");
				System.err.println(e);

			}
		}
		
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
	
	public static boolean editId(int id) {
		
		Connection conn = Db.conecta();
		
		String sql = "UPDATE alunos SET nome, genero, email WHERE id = ?";
		
		try {
			
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, id);
			
			st.execute();
			System.out.println("USUÁRIO EDITADO");
			Db.desconecta(conn);
			return true;
			
		}catch(Exception e) {
			System.err.println(e);
			Db.desconecta(conn);
			
		}
		
		return false;
		
		
	}

}
