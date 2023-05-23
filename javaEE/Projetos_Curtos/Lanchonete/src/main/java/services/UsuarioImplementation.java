package services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Usuario;

public class UsuarioImplementation {
	
 public static boolean Insert(Usuario usuario) {
		 
		 Connection conn = Db.Connecta();
		 
		 try {
			 String sql = "INSERT INTO usuario (usuario, password) VALUES (?,?)";
			 PreparedStatement st = conn.prepareStatement(sql);
			 
			 st.setString(1, usuario.getUsuario());
			 st.setString(2, usuario.getPassword());
		 			 
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

}
