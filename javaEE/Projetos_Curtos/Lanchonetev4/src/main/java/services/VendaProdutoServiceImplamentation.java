package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.VendaProduto;

public class VendaProdutoServiceImplamentation {
	
	public static boolean insert(VendaProduto v) {
		
		Connection conn = Db.conect();
		
		try {
			
			String sql = "INSERT INTO vendaProduto (idProduto, quantidade, preco, idVenda) VALUES(?,?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setInt(1, v.getIdProduto());
			st.setDouble(2,v.getQuantidade());
			st.setDouble(3, v.getPreco());
			st.setInt(4, v.getIdVenda());
			
			st.execute();
			st.close();
			
			return true;
			
		}catch (Exception e) {
			
			System.out.println("Falha ao iniciar venda " + e);
		}
		
		return false;
		
	}
	
	
	public static ArrayList<VendaProduto> getByVenda(int idVenda){
	
		Connection conn = Db.conect();
		
		try {
			
			String sql = "SELECT vendaProduto.id 			AS id, " +
								"vendaProduto.idProduto 	AS idProduto, " +
								"produto.nome 				AS nomeProduto, " +
								"vendaProduto.preco 		AS preco, " + 
								"vendaProduto.quantidade 	AS quantidade " + 
						 "FROM vendaProduto INNER JOIN produto " +
						 "ON vendaProduto.idProduto = produto.id " + 
						 "WHERE vendaProduto.idVenda = " + idVenda;
			
			Statement st = conn.createStatement();
			
			ResultSet resultados = st.executeQuery(sql);
			
			ArrayList<VendaProduto> lista = new ArrayList<VendaProduto>();
			
			while(resultados.next()) {
				lista.add(new VendaProduto(
											resultados.getInt("id"),
											idVenda,
											resultados.getInt("idProduto"),
											resultados.getString("nomeProduto"),
											resultados.getDouble("preco"),
											resultados.getDouble("quantidade")
						));
			}
			
			Db.Disconnect(conn);
 			return lista;
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		return new ArrayList<VendaProduto>();
	}
}


















