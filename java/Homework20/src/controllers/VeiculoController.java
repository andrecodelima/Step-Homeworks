package controllers;

import modules.VeiculoModel;
import services.Db;

import java.sql.*;
import java.util.ArrayList;

public class VeiculoController {



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
