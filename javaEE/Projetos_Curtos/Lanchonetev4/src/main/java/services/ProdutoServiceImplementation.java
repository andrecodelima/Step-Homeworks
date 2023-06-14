package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Produto;

public class ProdutoServiceImplementation {
	
	public static boolean insert(Produto produto) {
	
		Connection conn = Db.conect();
		
		try {
			String sql = "INSERT INTO produto(nome, descricao, preco) VALUES (?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, produto.getNome());
			st.setString(2, produto.getDescricao());
			st.setDouble(3, produto.getPreco());
			
			st.execute();
			
			Db.Disconnect(conn);
			return true;
			
			
		}catch (Exception e) {
			System.err.println(e);
			return false;

		}
		
		
	}
	
	public static ArrayList<Produto>getProduto(){
		
		Connection conn = Db.conect();
		
		try {
			
			String 		sql 	= "SELECT * FROM produto";
			Statement 	st 		= conn.createStatement();
			ResultSet   result  = st.executeQuery(sql); 
			
			ArrayList<Produto>lista = new ArrayList<Produto>();
			
			while(result.next()) {
				lista.add(new Produto(result.getInt("id"),
									  result.getString("nome"),
									  result.getString("descricao"),
									  result.getDouble("preco")
							)
						);
			}
			
			st.close();
			Db.Disconnect(conn);
			return lista;
			
			
		}catch (Exception e) {
			System.err.println("Erro na conexão");
			
		}
		
		return null;
	}
	
	
	public static boolean delProduto(int id) {
		
		Connection conn = Db.conect();
		
		try {
			
			String sql = "DELETE from produto WHERE id=?";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setInt(1, id);
			st.execute();
			
			System.out.println("Produto deletado");
			st.close();
			
			return true;
			
		}catch (Exception e) {
			
			System.out.println(e);
			System.out.println("Falha ao deletar produto");
		}
		
		return false;
		
	}
	
	
	public static Produto getId(int id){
		
		Connection conn = Db.conect();
		
		try {
			
//			String sql = "SELECT * FROM produto WHERE id=?";
			String sql = "SELECT * FROM produto WHERE id=" + id;
			
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
			
			Db.Disconnect(conn);
			st.close();
			return produto;
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
	
	
	public static boolean updateProduct(Produto p) throws SQLException{
		Connection conn = Db.conect();
		
		if(conn == null) {
			System.err.println("Falha na conexão");
		
		}
		
		String sql = "UPDATE produto	"	+
					  
					 "SET nome	=	?,"		+
					 "descricao = 	?,"		+
					 "preco		=	? "		+
					 
					 "WHERE id	=	?"		;
		
		try {
			
			PreparedStatement st	= conn.prepareStatement(sql);
			st.setString(1, p.getNome());
			st.setString(2, p.getDescricao());
			st.setDouble(3, p.getPreco());
			st.setInt(4, p.getId());
			
			st.execute();
			System.out.println("Produto atualizado");
			Db.Disconnect(conn);
			
			return true;
			
			
		}catch (Exception e) {
			System.err.println(e);
			System.err.println("Erro durante atualização");
					
			
		}
		
		Db.Disconnect(conn);
		return false;
		
 	}
	
	
	
}






















