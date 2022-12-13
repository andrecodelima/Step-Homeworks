package services;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

    public static Connection Connect(){

        Connection conn = null;

        try{
            String host = "jdbc:mysql://localhost:3306/loja_paper";
            String user = "root";
            String pass = "";

            conn = DriverManager.getConnection(host,user,pass);
//            System.out.println("Conected!");

        }catch(SQLException e){
            System.out.println(e);
        }

        return conn;


    }
}
