package controller;

import model.Produto;
import services.Db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProdutoController {
	
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
	 
	 
	 public static ArrayList<Produto> getProduto() throws SQLException{
		 
		 Connection conn = Db.Connecta();
		 
		 try {
			 
			 String sql = "SELECT * FROM produto";
			 Statement st = conn.createStatement();
			 
			 ArrayList<Produto> lista = new ArrayList<Produto>();
			 
			 ResultSet result = st.executeQuery(sql);
			 
			 while(result.next()){
				 
				 lista.add(new Produto(result.getInt("id"),
						 			  result.getString("nome"),
						 			  result.getString("descricaco"),
						 			  result.getDouble("preco")
						 			  )
						 );
			 }
			 
			 
			 System.out.println("Consulta realizada com sucesso");
			 st.close();
			 Db.Desconecta(conn);
			 return lista;
			 
		 }catch (Exception e) {
			
			 System.err.println(e);
			 
		}return null;	 			 
		 
	 }
	 
}













