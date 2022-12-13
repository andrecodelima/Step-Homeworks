package controllers;

import models.Veiculo;
import services.Db;
import services.Entrada;

import java.sql.*;
import java.util.ArrayList;

public class VeiculoController {

    public static void addVeiculo(Veiculo v) {

        Connection conn = Db.getConnect();

        if(conn == null){
            System.out.println("Falha na conexão");
        }else{

            String sql = "INSERT INTO veiculo (modelo, fabricante, ano, cor, preco) VALUES (?,?,?,?,?)";
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

                st.close();
                conn.close();

            }catch (SQLException e){
                System.out.println(e);
            }
        }

    }

    public static void exibir(Veiculo v){

        System.out.println("Id: " + v.getId());
        System.out.println("Modelo: " + v.getModelo());
        System.out.println("Fabricante: " + v.getFabricante());
        System.out.println("Ano: " + v.getAno());
        System.out.println("Cor: " + v.getCor());
        System.out.println("Preço: " + v.getPreco());

    }

    public static void cadastrar(){

        Veiculo v = new Veiculo();

        System.out.println("==== CADASTRO DE VEÍCULOS ====");
        System.out.println(" ");

        System.out.print("Modelo: ");
        v.setModelo(Entrada.entText());

        System.out.print("Fabricante: ");
        v.setFabricante(Entrada.entText());

        System.out.print("Ano: ");
        v.setAno(Entrada.entInt());

        System.out.print("Cor: ");
        v.setCor(Entrada.entText());

        System.out.print("Preço: ");
        v.setPreco(Entrada.entDouble());

        VeiculoController.addVeiculo(v);

//        System.out.println("\nVeículo cadastrado com sucesso!");
    }


    public static ArrayList<Veiculo>getAll(){
        System.out.println("TODOS OS VEÍCULOS\n");

        ArrayList<Veiculo> list = new ArrayList<Veiculo>();
        Connection conn = Db.getConnect();

        if(conn == null){
            System.out.println("Erro ao conectar ao banco");
            return list;

        }else{

            try{
                String sql = "SELECT * FROM veiculo";

                Statement st = conn.createStatement();
                ResultSet resultado = st.executeQuery(sql);

                while (resultado.next()){
                    list.add(new Veiculo(resultado.getInt("id"),
                                        resultado.getString("modelo"),
                                        resultado.getString("fabricante"),
                                        resultado.getInt("ano"),
                                        resultado.getString("cor"),
                                        resultado.getDouble("preco")
                                        )
                    );

                }
                st.close();
                conn.close();

            }catch (SQLException e){
                System.out.println(e);
            }
        }

        return list;

    }


}