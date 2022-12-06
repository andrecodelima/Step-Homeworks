package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

    //Criando a conexão
    public static Connection getConn(){

        Connection conect = null;

        try {
            String host = "jdbc:mysql://localhost:3306/bd_newcar";
            String user = "root";
            String pass = "";

            conect = DriverManager.getConnection(host, user, pass);

        }catch (SQLException e){
            System.out.println("Erro de conexão: " + e);
        }

        return conect;
    }


}
