package dever.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {

    public static Connection getConn(){
        String host = "jdbc:mysql://localhost:3306/lojajava";
        String user = "root";
        String pass = "";

        Connection conn = null;
        try{
            conn = DriverManager.getConnection(host,user,pass);
        }catch (SQLException e){
            System.out.println(e);
        }

        return conn;
    }
}
