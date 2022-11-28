import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        }
    public static void addProduto(Produto p){

        }

    public static Connection getConnection(){
        String host = "jdbc:mysql://localhost:3306/bd_papelaria";
        String user = "root";
        String pass = "";

        Connection conect;

        try{
            conect = DriverManager.getConnection(host,user,pass);
            System.out.println("Conect!");
            
        } catch (SQLException error){
            System.err.println("Erro de Conexão: " + error);

        }
    }

    }





