package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Venda;
import services.Db;

public class VendaController {
	
	public static boolean Insert(Venda v) {
		
		Connection conn = Db.conect();
		
		try {
			
			String sql = "INSERT INTO venda(entrega) VALUES (?)";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setBoolean(1, v.isEntrega());
			st.execute();
			
			st.close();
			return true;
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return false;
	}
}
