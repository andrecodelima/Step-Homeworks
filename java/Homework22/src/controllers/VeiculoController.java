package controllers;

import models.Veiculo;
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
        Connection conect = Db.conect();

        if(conect == null){
            System.out.println("Erro na conexão\n" +
                                "Impossível cadastrar");
        }else{

            String sql = "INSERT INTO veiculo(modelo, fabricante, ano, cor, preco) VALUES (?,?,?,?,?)";
            try{

                PreparedStatement st = conect.prepareStatement(sql);

                st.setString(1, v.getModelo());
                st.setString(2, v.getFabricante());
                st.setInt(   3, v.getAno());
                st.setString(4, v.getCor());
                st.setDouble(5, v.getPreco());


                int rows = st.executeUpdate();

                if(rows > 0){
                    System.out.println("\nVeículo Cadastrado");
                }else{
                    System.out.println("\nFalha no Cadastro");
                }

                st.close();
                conect.close();

            }catch (SQLException error){
                System.out.println(error);
            }
        }
    }


    public static ArrayList<Veiculo>getAll(){
        ArrayList<Veiculo> vecList = new ArrayList<Veiculo>();
        Connection conect  = Db.conect();

        if(conect == null){
            System.out.println("Erro ao conectar ao Banco");
            return vecList;

        }else{

            String sql = "SELECT * FROM veiculo";

            try{
                Statement st = conect.createStatement();
                ResultSet result = st.executeQuery(sql);

                while (result.next()){
                    vecList.add(new Veiculo(result.getInt("id"),
                                            result.getString("modelo"),
                                            result.getString("fabricante"),
                                            result.getInt("ano"),
                                            result.getString("cor"),
                                            result.getDouble("preco")
                                            )
                                );
                }

                conect.close();
                st.close();

            }catch (SQLException error){
                System.out.println(error);
            }

            return vecList;

        }

    }

    public static ArrayList<Veiculo>getFabricante(String fabricante){
        ArrayList<Veiculo> vecList = new ArrayList<Veiculo>();
        Connection conect  = Db.conect();

        if(conect == null){
            System.out.println("Erro ao conectar ao Banco");
            return vecList;

        }else{

            String sql = "SELECT * FROM veiculo WHERE FABRICANTE LIKE '%" + fabricante + "%'";

            try{
                Statement st = conect.createStatement();
                ResultSet result = st.executeQuery(sql);

                while (result.next()){
                    vecList.add(new Veiculo(result.getInt("id"),
                                    result.getString("modelo"),
                                    result.getString("fabricante"),
                                    result.getInt("ano"),
                                    result.getString("cor"),
                                    result.getDouble("preco")
                            )
                    );
                }

                conect.close();
                st.close();

            }catch (SQLException error){
                System.out.println(error);
            }

            return vecList;

        }

    }


    public static ArrayList<Veiculo>getModelo(String modelo){
        ArrayList<Veiculo> vecList = new ArrayList<Veiculo>();
        Connection conect  = Db.conect();

        if(conect == null){
            System.out.println("Erro ao conectar ao Banco");
            return vecList;

        }else{

            String sql = "SELECT * FROM veiculo WHERE MODELO LIKE '%" + modelo + "%'";

            try{
                Statement st = conect.createStatement();
                ResultSet result = st.executeQuery(sql);

                while (result.next()){
                    vecList.add(new Veiculo(result.getInt("id"),
                                    result.getString("modelo"),
                                    result.getString("fabricante"),
                                    result.getInt("ano"),
                                    result.getString("cor"),
                                    result.getDouble("preco")
                            )
                    );
                }

                conect.close();
                st.close();

            }catch (SQLException error){
                System.out.println(error);
            }

            return vecList;

        }

    }

    public static ArrayList<Veiculo>getAno(int ano){
        ArrayList<Veiculo> vecList = new ArrayList<Veiculo>();
        Connection conect  = Db.conect();

        if(conect == null){
            System.out.println("Erro ao conectar ao Banco");
            return vecList;

        }else{

            String sql = "SELECT * FROM veiculo WHERE ANO is " + ano;

            try{
                Statement st = conect.createStatement();
                ResultSet result = st.executeQuery(sql);

                while (result.next()){
                    vecList.add(new Veiculo(result.getInt("id"),
                                    result.getString("modelo"),
                                    result.getString("fabricante"),
                                    result.getInt("ano"),
                                    result.getString("cor"),
                                    result.getDouble("preco")
                            )
                    );
                }

                conect.close();
                st.close();

            }catch (SQLException error){
                System.out.println(error);
            }

            return vecList;

        }

    } // Ano

    public static ArrayList<Veiculo>getCor(String cor){// Cor
        ArrayList<Veiculo> vecList = new ArrayList<Veiculo>();
        Connection conect  = Db.conect();

        if(conect == null){
            System.out.println("Erro ao conectar ao Banco");
            return vecList;

        }else{

            String sql = "SELECT * FROM veiculo WHERE COR LIKE '%" + cor + "%'";

            try{
                Statement st = conect.createStatement();
                ResultSet result = st.executeQuery(sql);


                while (result.next()){
                    vecList.add(new Veiculo(result.getInt("id"),
                                    result.getString("modelo"),
                                    result.getString("fabricante"),
                                    result.getInt("ano"),
                                    result.getString("cor"),
                                    result.getDouble("preco")
                            )
                    );
                }

                conect.close();
                st.close();

            }catch (SQLException error){
                System.out.println(error);
            }

            return vecList;

        }

    }



    //VENDA
    public static void Venda(Veiculo v) {
        Connection conect = Db.conect(); //Se concectando ao banco
        try{

            String sql = "DELETE FROM veiculo WHERE id = ?";
            PreparedStatement st = conect.prepareStatement(sql);

            st.setInt(1, v.getId());
            st.execute();

            System.out.println("\nVeículo Vendido");
            conect.close();
            st.close();

        }catch (SQLException e){
            System.out.println("Erro na venda");
            System.out.println(e);
        }

    }



}
