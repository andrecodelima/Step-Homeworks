package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Pessoa;
import service.Db;

public class DAO {

	public static Boolean insert(Pessoa aluno) {
		
		Connection conn = Db.Connect();
		String sql = "INSERT INTO pessoa(nome, genero, idade, email, telefone) VALUES(?,?,?,?,?)";
		
		try {
			
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, aluno.getNome());
			st.setString(2, aluno.getGenero());
			st.setInt(3, aluno.getIdade());
			st.setString(4, aluno.getEmail());
			st.setString(5, aluno.getTelefone());
			
			st.execute();
			System.out.println("Usuário Cadastrado");
			
			st.close();
			Db.desconecta(conn);
			
			return true;
			
		}catch(SQLException e) {
			System.err.println(e);
			System.out.println("Falha no cadastro");
		}
		
		return false;
		
	}
	
	public static ArrayList<Pessoa>getAluno(){
		
		Connection conn = Db.Connect();
		
		try {
			
			String sql = "SELECT * FROM pessoa";	
			
			Statement st = conn.createStatement();			
			ResultSet result = st.executeQuery(sql);
			
			ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
			
			while(result.next()) {
				
				lista.add(new Pessoa(result.getInt("id"),
									result.getString("nome"),
									result.getString("genero"),
									result.getInt("idade"),
									result.getString("email"),
									result.getString("telefone")
									)
						);
			}
			
			st.close();
			Db.desconecta(conn);
			return lista;
			
		}catch(SQLException e) {
			
			System.err.println("Erro na consulta");
		}
		
		return null;
	}
	
}
