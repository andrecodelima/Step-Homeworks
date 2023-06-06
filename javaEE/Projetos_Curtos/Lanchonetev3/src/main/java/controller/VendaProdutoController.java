package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.VendaProduto;
import services.Db;

public class VendaProdutoController {
	
	public static boolean Insert(VendaProduto v) {
		
		try {
			
			Connection conn = Db.Connecta();
			String sql = "INSERT INTO vendaProduto(idProduto, quantidade, preco, idVenda) VALUES (?,?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setInt(1, v.getId());
			st.setDouble(2, v.getQuantidade());
			st.setDouble(3, v.getPreco());
			st.setInt(1, v.getIdVenda());
			
			st.execute();
			
			st.close();
			return true;
			
		}catch (Exception e) {
			System.err.println("Falha ao iniciar venda");
		}
		return false;
		
	}
	
	
	public static ArrayList<VendaProduto> getVenda(int idVenda){
		
		try {
			
			Connection conn = Db.Connecta();
			
			String sql = "SELECT vendaProduto.id			AS id, "			+
								"vendaProduto.idProduto		AS idProduto, "		+
								"produto.nome				AS nomeProduto, "	+
								"vendaProduto.preco			AS preco, "			+
								"vendaProduto.quantidade    AS Quantidade, "	+
								"vendaProduto.idVenda       AS idVenda "		+
								
								"FROM vendaProduto INNER JOIN produto "			+
								"ON vendaProduto.idProduto	= produto.id"		+
								"WHERE vendaProduto.venda   = " + idVenda		;
			
			Statement st = conn.createStatement();
			
			ResultSet result = st.executeQuery(sql);
			
			ArrayList<VendaProduto> lista = new ArrayList<VendaProduto>();
			
			while(result.next()) {
				lista.add(new VendaProduto(
									result.getInt("id"),
									result.getInt("idVenda"),
									result.getInt("idProduto"),
									result.getString("nomeProduto"),
									result.getDouble("preco"),
									result.getDouble("quantidade")
						
						)
					);
				
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}
	

}
