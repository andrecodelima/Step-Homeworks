package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

    //Conexão com o banco
    public static Connection getConnect(){

        Connection conect = null;

        String url = "jdbc:mysql://localhost:3306/bd_automotors";
        String user = "root";
        String pass = "";

        try{
            conect = DriverManager.getConnection(url, user, pass);
            System.out.println("conected!");

        }catch (SQLException e){
            System.out.println(e);
        }

        return conect;

    }

}
