package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
