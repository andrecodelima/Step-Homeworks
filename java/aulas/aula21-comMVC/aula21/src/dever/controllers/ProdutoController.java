package dever.controllers;

import dever.models.ProdutoModel;
import dever.services.BD;

import java.sql.*;
import java.util.ArrayList;

public class ProdutoController {

    public static void addProduto(ProdutoModel p){
        Connection conn = BD.getConn();

        if(conn == null){
            System.out.println("Erro na conexão");
        }else{
            String sql = "INSERT INTO produto(nome,fabricante,preco) VALUES(?,?,?)";

            try{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, p.getNome());
                statement.setString(2, p.getFabricante());
                statement.setDouble(3, p.getPreco());

                int quantidade = statement.executeUpdate();

                if(quantidade > 0){
                    System.out.println("\n==============");
                    System.out.println("PRODUTO CADASTRADO");
                    System.out.println("================\n");
                }else{
                    System.out.println("FALHA AO CADASTRAR O PRODUTO");
                }

                statement.close();
                conn.close();

            }catch (SQLException e){
                System.out.println(e);
            }

        }


    }

    public static ArrayList<ProdutoModel> getAll(){
        ArrayList<ProdutoModel> produtoList = new ArrayList<ProdutoModel>();
        Connection conn = BD.getConn();

        if(conn == null){
            System.out.println("Erro ao conectar ao banco");
            return produtoList;
        }

        String sql = "SELECT * FROM produto";
        try{
            Statement statement = conn.createStatement();
            ResultSet resultados = statement.executeQuery(sql);

            while (resultados.next()){
                produtoList.add(new ProdutoModel(resultados.getInt("id"),
                                resultados.getString("nome"),
                                resultados.getString("fabricante"),
                                resultados.getDouble("preco")
                        )
                );}

            conn.close();
            statement.close();

        }catch(SQLException e){
            System.out.println(e);
        }

        return produtoList;
    }


}
