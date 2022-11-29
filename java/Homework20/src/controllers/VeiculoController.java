package controllers;

import modules.VeiculoModel;
import services.Db;

import java.sql.*;
import java.util.ArrayList;

public class VeiculoController {

    public static void addProduto(VeiculoModel v){

        Connection conn = Db.getConn();
        if(conn == null){
            System.out.println("Erro na conexão\n");
        }else{
            String sql = "INSERT INTO veiculo (modelo,fabricante,cor,ano,preco) VALUES(?,?,?,?,?)";
            try{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, v.getModelo());
                statement.setString(2, v.getFabricante());
                statement.setString(3, v.getCor());
                statement.setInt(4, v.getAno());
                statement.setDouble(5, v.getPreco());

                int rows = statement.executeUpdate();
                if(rows > 0){
                    System.out.println("\n===========");
                    System.out.println("Produto cadastrado");
                    System.out.println("=================\n");
                }

                statement.close();
                conn.close();

            }catch (SQLException e){
                System.err.println(e);
            }

        }
    }

    public static ArrayList<VeiculoModel> getVeiculo(){

        ArrayList<VeiculoModel> VecList = new ArrayList<VeiculoModel>();

        Connection conn = Db.getConn();
        if(conn == null){
            System.out.println("Erro ao conectar ao Banco de Dados");
            return VecList;

        }

        String sql = "SELECT * FROM veiculo";

        try{
            Statement stConsult = conn.createStatement();
            ResultSet result = stConsult.executeQuery(sql);

            while (result.next()){
                VecList.add(new VeiculoModel(result.getInt("id"),
                                            result.getString("modelo"),
                                            result.getString("fabricante"),
                                            result.getInt("ano"),
                                            result.getString("cor"),
                                            result.getDouble("preco")
                                            )
                );
            }

            conn.close();
            stConsult.close();


        }catch (SQLException e){
            System.out.println("ERRO: " + e);
        }

        return VecList;
    }
    
}
