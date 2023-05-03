package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import services.Db;

public class DAO {
	
	public static boolean insert(JavaBeans aluno) {
		
		Connection conn = Db.conecta();
		String sql = "INSERT INTO aluno  (nome, genero, email) VALUES (?,?,?)";
		
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, aluno.getNome());
			st.setString(2, aluno.getGenero());
			st.setString(3, aluno.getEmail());
			
			st.execute();
			System.out.println("Usuário cadastrado");
			
			return true;
			
		}catch(SQLException e) {
			
			System.err.println("Erro ao cadastrar aluno: " + e);
		}
			
		return false;
	}
	
	public static ArrayList<JavaBeans> getAll(){
		
		Connection conn = Db.conecta();
		
		try {
			String sql = "SELECT * FROM aluno";
			
			Statement st = conn.createStatement();
			
			ResultSet resultado = st.executeQuery(sql);
			ArrayList<JavaBeans> lista = new ArrayList<JavaBeans>();
			
			while(resultado.next()) {
				
				lista.add(new JavaBeans(
										resultado.getInt("id"),
										resultado.getString("nome"),
										resultado.getString("genero"),
										resultado.getString("email")
										)
						);
			}
			
			conn.close();
			return lista;
			
		}catch (SQLException e) {
			System.err.println("ERRO AO BUSCAR ALUNOS");
			System.err.println(e);
		}
				
		return null;
	}

}
