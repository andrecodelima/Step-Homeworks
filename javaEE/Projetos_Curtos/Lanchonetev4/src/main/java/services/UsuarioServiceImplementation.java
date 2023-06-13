package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sound.midi.SysexMessage;

import model.Usuario;

public class UsuarioServiceImplementation {
	
	public static boolean insert(Usuario usuario) {
		
		Connection conn = Db.conect();
		
		try {
			
			String sql = "INSERT INTO (usuario, password) VALUES (?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, usuario.getUsuario());
			st.setString(2, usuario.getPassword());
			
			st.execute();
			st.close();
			
			return true;
			
			
		}catch (Exception e) {
			System.out.println("Falha no cadastro");
		}
		
		return false;
		 
	}
	
	
	public static Usuario getUsuario(String user) {
		
		Connection conn = Db.conect();
		Usuario usuario = new Usuario();
		
		try {
			
			String sql = "SELECT * FROM usuario WHERE usuario = \"" + user + "\"";
			
			Statement st 		= conn.createStatement();
			ResultSet result	= st.executeQuery(sql);
			
			
			while(result.next()) {
				
				usuario = new Usuario(result.getInt("id"),
									  result.getString("usuario"),
									  result.getString("password")
						);
			}
			
		}catch (Exception e) {
			System.err.println(e);
		}
		
		return usuario;
	}
	
}
















