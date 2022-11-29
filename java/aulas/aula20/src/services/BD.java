package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {

    //"ALGO QUE É COMUM A TODOS"
    public static Connection getConnection(){

        //Criando a conexão
        String host = "jdbc:mysql://localhost:3306/bd_papelaria";
        String user = "root";
        String pass = "";

        Connection conect = null;

        try{
            conect = DriverManager.getConnection(host,user,pass);
            System.out.println("Conect!");

        } catch (SQLException error){
            System.err.println(error);

        }
        return conect;
    }

}

