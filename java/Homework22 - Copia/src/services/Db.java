package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

    public static Connection conect(){

        Connection conect = null;

        try{
            String host = "jdbc:mysql://localhost:3306/bd_concessionaria_hm22";
            String user = "root";
            String pass = "";

            conect = DriverManager.getConnection(host,user,pass);


        }catch (SQLException error){
            System.out.println("Erro: " + error);
        }

        return conect;
    }

}
