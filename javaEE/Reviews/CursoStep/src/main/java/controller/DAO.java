package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Pessoa;
import service.Db;

public class DAO {

	public static Pessoa insert(Pessoa aluno) {
		
		Connection conn = Db.Connect();
		String sql = "INSERT INTO aluno(nome, genero, idade, email, telefone)";
		
		try {
			
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, aluno.getNome());
			st.setString(2, aluno.getGenero());
			st.setString(3, aluno.getIdade());
			st.setString(4, aluno.getEmail());
			st.setString(4, aluno.getTelefone());
			
			st.execute();
			System.out.println("Usuário Cadastrado");
			
			st.close();
			Db.desconecta(conn);
			
		}catch(SQLException e) {
			System.err.println(e);
			System.out.println("Falha no cadastro");
		}
		
		return aluno;
		
	}
}
