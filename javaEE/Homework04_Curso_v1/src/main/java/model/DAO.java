package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import services.Db;

public class DAO {

	/*
	 * Metodos de insert, getAll,getByNome, getByGenero
	 */

	// INSERT
	public static void insertAluno(JavaBeans aluno) {
		Connection conn = Db.conecta();

		try {
			String sql = "INSERT INTO aluno (nome, genero, email) VALUES (?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);

			st.setString(1, aluno.getNome());
			st.setString(2, aluno.getGenero());
			st.setString(3, aluno.getEmail());

			int rows = st.executeUpdate();
			if (rows > 0) {
				System.out.println("Aluno cadastrado com sucesso");
			} else {
				System.out.println("Falha no cadastro");
			}

			st.close();
			conn.close();

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	// CADASTRO
	public static void Cadastrar() {

		JavaBeans aluno = new JavaBeans();
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		aluno.setNome(sc.nextLine());

		System.out.print("Gênero: ");
		aluno.setGenero(sc.next());

		System.out.print("E-mail: ");
		aluno.setEmail(sc.next());

		DAO.insertAluno(aluno);

	}

	public static ArrayList<JavaBeans> allAlunos() {

		ArrayList<JavaBeans> list = new ArrayList<JavaBeans>();
		Connection conn = Db.conecta();

		if (conn == null) {
			System.out.println("Falha na conexão!");
		} else {
		}
		try {

			String sql = "SELECT * FROM aluno";
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sql);

			while (result.next()) {
				list.add(new JavaBeans(result.getInt("id"), result.getString("nome"), result.getString("genero"),
						result.getString("email")));
			}

			st.close();
			conn.close();

		} catch (SQLException e) {
			System.out.println(e);
		}

		return list;

	}
	
	
	public static ArrayList<JavaBeans>getNome(String nome){
		
		ArrayList<JavaBeans>list = new ArrayList<JavaBeans>();
		Connection conn = Db.conecta();
		if(conn == null) {
			System.out.println("Falha na conexão");
		
		}else {
			
			String sql = "SELECT * FROM aluno WHERE NOME LIKE '%" + nome + "%";

		}try {
			
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(nome);
			
			
			while(result.next()) {
				
				list.add(new JavaBeans(result.getInt("id"),
										result.getString("nome"),
										result.getString("modelo"),
										result.getString("email")
									)
						
				);
				
				conn.close();
				st.close();
				
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		return list;
		
	}
	
	
	public static ArrayList<JavaBeans>getGenero(String genero){
		
		ArrayList<JavaBeans>list = new ArrayList<>();
		Connection conn = Db.conecta();
		
		if(conn == null){
			System.out.println("Falha na conexão!");
		
		}else {
			String sql = "SELECT * FROM aluno WHERE genero LIKE '%" + genero + "%";
						
		}try {
			
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(genero);
			
			while(result.next()){
					list.add(new JavaBeans(result.getInt("id"),
											result.getString("nome"),
											result.getString("genero"),
											result.getString("email")
											)
							);
				
			}
			
			conn.close();
			st.close();
			
		}catch(SQLException e) {
			System.err.println(e);	
		}
		
		return list;
 	}
	
	
	public static void exibir(JavaBeans aluno) {
		
		System.out.println("");

		System.out.println("ID: 		" 	+ aluno.getId		());
		System.out.println("Nome: 		" 	+ aluno.getNome		());
		System.out.println("Gênero: 	" 	+ aluno.getGenero	());
		System.out.println("E-mail: 	" 	+ aluno.getEmail	());
		
		System.out.println("--------------------------------------");
	}

}
