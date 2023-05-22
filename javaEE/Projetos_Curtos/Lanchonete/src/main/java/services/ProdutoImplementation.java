package services;

import model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProdutoImplementation {
	
	 public static boolean Insert(Produto produto) {
		 
		 Connection conn = Db.Connecta();
		 
		 try {
			 String sql = "INSERT INTO produto (nome, descricao, preco) VALUES (?,?,?)";
			 PreparedStatement st = conn.prepareStatement(sql);
			 
			 st.setString(1, produto.getNome());
			 st.setString(2, produto.getDescricao());
			 st.setDouble(3, produto.getPreco());
			 
			 st.execute();
			 System.out.println("Cadastro realizado");
			 
			 st.close();
			 
			 Db.Desconecta(conn);
			 return true;
			 
		 }catch (Exception e) {
			System.err.println(e);
			System.err.println("Falha no cadastro");
			 return false;
		 }
		 
		
	 }
	 
	 
		public static ArrayList<Produto>getProduto(){
			
			Connection conn = Db.Connecta();
			
			try {
				
				String sql = "SELECT * FROM produto";	
				
				Statement st = conn.createStatement();			
				ResultSet result = st.executeQuery(sql);
				
				ArrayList<Produto> lista = new ArrayList<Produto>();
				
				while(result.next()) {
					
					lista.add(new Produto(	result.getInt("id"),
											result.getString("nome"),
											result.getString("descricao"),
											result.getDouble("preco")
									 )
										
							);
				}
				
				st.close();
				Db.Desconecta(conn);
				return lista;
				
			}catch(SQLException e) {
				
				System.err.println("Erro na consulta");
			}
			
			return null;
		}
	 
	 
	 
		public static boolean delProduto(int id) {
			
			Connection conn = Db.Connecta();
			
			try {
				
				String sql = "DELETE from produto WHERE id=?";
				PreparedStatement st = conn.prepareStatement(sql);
				
				st.setInt(1, id);
				st.execute();
				System.out.println("Usuário deletado");
				
				Db.Desconecta(conn);
				st.close();
				
				return true;
				
				
			}catch (Exception e) {
				
				System.out.println(e);
				System.err.println("Falha ao deletar");

			}
			
			return false;
		}
	 
	
		public static Produto getId(int id){
			
			Connection conn = Db.Connecta();
			
			try {
				
				String sql = "SELECT * FROM produto WHERE id=?";
//				String sql = "SELECT * FROM produto WHERE id=" + id;
				
				Statement st = conn.createStatement();
				ResultSet result = st.executeQuery(sql);
				
				Produto produto = new Produto();
				
				while(result.next()) {
					
					produto = new Produto(result.getInt("id"),
										 result.getString("nome"),
										 result.getString("descricao"),
										 result.getDouble("preco")
										 );
				}
				
				Db.Desconecta(conn);
				st.close();
				return produto;
				
				
			}catch (Exception e) {
				System.out.println(e);
			}
			
			return null;
		}
	 
	 
	 
	 
}













