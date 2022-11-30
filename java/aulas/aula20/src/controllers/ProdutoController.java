package controllers;

import models.ProdutoModel;
import services.BD;

import java.sql.*;
import java.util.ArrayList;

public class ProdutoController {
    // REGRAS DE NEGOCIOS
    // OPERACOES QUE PODE FAZER COM OS MODELOS
    public static void addProduto(ProdutoModel p){
        //Cadastro de produtos no Banco de Dados
        //É void pq quando adiciona produto não há retorno. Só está adicionando

        Connection conect = BD.getConnection();

        if(conect == null){
            System.err.println("Erro na conexão\n Impossível Cadastrar");
        }else{
            String sql = "INSERT INTO produto(nome, fabricante, preco) VALUES(?,?,?)";
            try{
                PreparedStatement statement = conect.prepareStatement(sql);
                statement.setString(1, p.getNome());
                statement.setString(2, p.getFabricante());
                statement.setDouble(3, p.getPreco());

                int rows = statement.executeUpdate();//qtd de linhas

                if(rows > 0){ // Se alterou uma linha  produto cadastrado
                    System.out.println("\n=============");
                    System.out.println("Produto cadastrado");
                    System.out.println("=============\n");

                }

                statement.close();
                conect.close();

            }catch (SQLException e){
                System.err.println(e);
            }

        }
    }
    public static ArrayList<ProdutoModel> getAllProduto(){

        // Retonar lista com todos os produtos

        ArrayList<ProdutoModel> produtoList = new ArrayList<ProdutoModel>();
        // Criar a lista

        Connection conect = BD.getConnection();
        //Chamar a conexão

        if(conect == null) {
            System.err.println("Erro ao conectar ao Banco de Dados");
            return produtoList;
        }

        String sql = "SELECT * FROM produto";

        try {
            Statement st = conect.createStatement();
            ResultSet result = st.executeQuery(sql);

            while (result.next()) {
                // equanto houver (next) outro resultado ...
                produtoList.add(new ProdutoModel(result.getInt("id"),
                                result.getString("nome"),
                                result.getString("fabricante"),
                                result.getDouble("preco")
                        )
                );
            }

            conect.close();
            st.close();

        }catch(SQLException e){
            System.out.println(e);
        }

        return produtoList;
    }

}
