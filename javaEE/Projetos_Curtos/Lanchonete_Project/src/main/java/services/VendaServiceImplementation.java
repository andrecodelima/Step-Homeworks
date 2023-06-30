package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Venda;

public class VendaServiceImplementation {
	
	public static boolean insert(Venda v) {
		
		Connection conn = Db.conect();
		
		try {
			
			String sql = "INSERT INTO venda (entrega) VALUES (?)";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setBoolean(1, v.isEntrega());
			
			st.execute();
			st.close();
			
			return true;
			
			
		}catch (Exception e) {
			System.out.println("Falha na venda" + e);
		}
		
		return false;
	}
	
	
	public static Venda getId(int id) {
		
		Connection conn = Db.conect();
		
		try {
			
			String sql = "SELECT * FROM venda WHERE id = " + id;
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sql);
			
			Venda v = new Venda();
			while(result.next()) {
				
				v = new Venda(
								result.getInt("id"),
								result.getDate("dataHora"),
								result.getBoolean("entrega")
							);
			}
			
			Db.Disconnect(conn);
			return v;
			
		}catch (Exception e) {
			System.out.println("Erro ao cadastrar nova venda: " + e);

		}
		
		
		return null;
	}
	
	
public static int getUltimaVenda() {
		Connection conn = Db.conect();

		try {
			String sql = "SELECT MAX(id) AS ultimoId FROM venda";
			
			Statement comando = conn.createStatement();
			
			ResultSet resultados = comando.executeQuery(sql);
			
			int id = 0;
			while(resultados.next()) {
				id = resultados.getInt("ultimoId");
			}
			
			Db.Disconnect(conn);
			return id;
		}catch(SQLException e) {
			System.out.println("Erro ao achar nova venda: " + e);
		}
		
		return 0;
	}
}




























