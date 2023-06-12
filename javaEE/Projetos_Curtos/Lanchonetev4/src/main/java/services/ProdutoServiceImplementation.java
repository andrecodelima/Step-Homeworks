package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
}
