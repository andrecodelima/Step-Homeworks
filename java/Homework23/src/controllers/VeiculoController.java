package controllers;

import modules.Veiculo;
import services.Db;

import java.sql.*;
import java.util.ArrayList;

public class VeiculoController {

    public static void exibir(Veiculo v){

        System.out.println("ID: " + v.getId());
        System.out.println("Modelo: " + v.getModelo());
        System.out.println("Fabricante: " + v.getFabricante());
        System.out.println("Ano: " + v.getAno());
        System.out.println("Cor: " + v.getCor());
        System.out.println("Preço: " + v.getPreco());

    }

    public static void addVeiculo(Veiculo v){

        Connection conn = Db.getConn();
        if(conn == null){
            System.out.println("Erro na conexão");
        }else{

            String sql = "INSERT INTO veiculo (modelo, fabricante, ano, cor, preco) VALUES(?,?,?,?,?)";
            try{

                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, v.getModelo());
                st.setString(2, v.getFabricante());
                st.setInt(3, v.getAno());
                st.setString(4, v.getCor());
                st.setDouble(5, v.getPreco());

                int rows = st.executeUpdate();

                if(rows > 0){

                    System.out.println("\nVeículo cadastrado com sucesso!");
                }else{
                    System.out.println("\nFalha no cadastro");
                }

                conn.close();
                st.close();

            }catch (SQLException e){
                System.out.println(e);
            }
        }

    }


    public static ArrayList<Veiculo>getAll(){

        ArrayList<Veiculo> list = new ArrayList<Veiculo>();
        Connection conn = Db.getConn();

        if(conn == null){
            System.out.println("Erro ao conectar ao banco");
            return list;
        }else{

            String sql = "SELECT * FROM veiculo";
            try{
                Statement st = conn.createStatement();
                ResultSet result = st.executeQuery(sql);

                while (result.next()){
                    list.add(new Veiculo(result.getInt("id"),
                                        result.getString("modelo"),
                                        result.getString("fabricante"),
                                        result.getInt("ano"),
                                        result.getString("cor"),
                                        result.getDouble("preco")
                                        )
                            );
                }

            }catch (SQLException e){
                System.out.println(e);
            }

        }
        return list;
    }


}
