package services;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

    public static Connection Connect(){

        Connection conn = null;

        try{
//            String host = "jdbc:mysql://127.0.0.1:3306/loja_paper";
//            String user = "root";
//            String pass = "";

//            String url = "jdbc:mysql://185.27.134.10/epiz_33211948_loja_paper";
//            String user = "epiz_33211948";
//            String pass = "12345678";
//

            String url = "jdbc:mysql://10.129.62.37:3306/step?useSSL=false";
            String user = "user22";
            String pass = "eQkr373@";

            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Conected!");

        }catch(SQLException e){
            System.out.println(e);
        }

        return conn;


    }
}
