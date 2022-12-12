package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

    public static Connection getConnect(){
        Connection conect = null;

        try{
            String host = "jdbc:mysql://localhost:3306/concessionaria";
            String user = "root";
            String pass = "";

            conect = DriverManager.getConnection(host,user,pass);
            System.out.println("CONECTADO!");

        }catch (SQLException e){
            System.out.println(e);
        }

        return conect;
    }

    public static Connection closeConn(Connection c){

        try{

            c.close();

        }catch (SQLException e){
            System.out.println(e);
        }

        return c;

    }
}
