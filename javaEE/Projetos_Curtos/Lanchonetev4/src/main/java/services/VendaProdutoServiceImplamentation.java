package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.VendaProduto;

public class VendaProdutoServiceImplamentation {
	
	public static boolean insert(VendaProduto v) {
		
		Connection conn = Db.conect();
		
		try {
			
			String sql = "INSERT INTO vendaproduto (idProduto, quantidade, preco, idVenda) VALUES(?,?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setInt(1, v.getId());
			st.setDouble(2, v.getQuantidade());
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
	
	
	public static ArrayList<VendaProduto> getPorVenda(int idVenda){
	
		Connection conn = Db.conect();
		
		try {
			
			String sql = "SELECT vendaproduto.id			AS id, " 				+
						  "vendaproduto.idProduto   		AS idProduto,"			+
						  "produto.nome 					AS nomeProduto, "		+
						  "vendaproduto.preco				AS preco, " 			+
						  "vendaproduto.quantidade 			AS quantidade"			+
						  
						  "FROM vendaproduto INNER JOIN produto"					+
						  "ON vendaproduto.idproduto = produto.id " 				+
						  
						  "WHERE vendaproduto.idVenda = " + idVenda;
					
					Statement st = conn.createStatement();
					ResultSet result = st.executeQuery(sql);
					
					ArrayList<VendaProduto> list = new ArrayList<VendaProduto>();
					
					while(result.next()) {
						
						list.add(new VendaProduto(
													result.getInt("id"),
													idVenda,
													result.getInt("idProduto"),
													result.getString("nomeProduto"),
													result.getDouble("preco"),
													result.getDouble("quantidade")
													
												  ));
					}
					
			
		}catch (Exception e) {
			 
		}
		
		
		return null;
	}
}


















