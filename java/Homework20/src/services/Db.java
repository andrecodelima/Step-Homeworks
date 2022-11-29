package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

    public static Connection getConn(){
        String host = "jdbc:mysql://localhost:3306/bd_concessionaria_hm20";
        String user = "root";
        String pass = "";

        Connection conect = null;

        try{
            conect = DriverManager.getConnection(host,user,pass);
            System.out.println("Conect!");

        }catch (SQLException e){
            System.err.println("Falha na conexão. Erro: " + e);

        }
        return conect;
    }

}
