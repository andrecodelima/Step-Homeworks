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
                                        result.getDouble("preco"),
                                        result.getBoolean("vendido")
                                        )
                            );
                }

            }catch (SQLException e){
                System.out.println(e);
            }

        }
        return list;
    }


    public static ArrayList<Veiculo>getFabricante(String fabricante){ //Fabricante

        ArrayList<Veiculo>list = new ArrayList<Veiculo>();
        Connection conn = Db.getConn();

        if(conn == null){
            System.out.println("Erro na conexão");
        }else{

            String sql = "SELECT FROM veiculo WHERE fabricante like '%" + fabricante + "%'";

            try{
                Statement st = conn.createStatement();
                ResultSet result = st.executeQuery(sql);

                while (result.next()){

                    list.add(new Veiculo(result.getInt("id"),
                                         result.getString("modelo"),
                                         result.getString("fabricante"),
                                         result.getInt("ano"),
                                         result.getString("Cor"),
                                         result.getDouble("preco"),
                                         result.getBoolean("vendido")

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

        public static ArrayList<Veiculo>getModelo(String modelo){
            ArrayList<Veiculo>list = new ArrayList<Veiculo>();
            Connection conn = Db.getConn();

            if(conn == null){
                System.err.println("Erro na conexão");
            }else{

                String sql = "SELECT * FROM veiculo WHERE modelo LIKE '%" + modelo + "%'";

                try{
                    Statement st = conn.createStatement();
                    ResultSet result = st.executeQuery(sql);

                    while (result.next()){
                        list.add(new Veiculo(result.getInt("id"),
                                            result.getString("modelo"),
                                            result.getString("fabricante"),
                                            result.getInt("ano"),
                                            result.getString("cor"),
                                            result.getDouble("preco"),
                                            result.getBoolean("vendido")

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

    public static ArrayList<Veiculo>getAno(int ano){
        ArrayList<Veiculo>list = new ArrayList<Veiculo>();
        Connection conn = Db.getConn();

        if(conn == null){
            System.err.println("Erro na conexão");
        }else{

            String sql = "SELECT * FROM veiculo WHERE ano is "+ ano;

            try{
                Statement st = conn.createStatement();
                ResultSet result = st.executeQuery(sql);

                while (result.next()){
                    list.add(new Veiculo(result.getInt("id"),
                                    result.getString("modelo"),
                                    result.getString("fabricante"),
                                    result.getInt("ano"),
                                    result.getString("cor"),
                                    result.getDouble("preco"),
                                    result.getBoolean("vendido")

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

    public static ArrayList<Veiculo>getCor(String cor){
        ArrayList<Veiculo>list = new ArrayList<Veiculo>();
        Connection conn = Db.getConn();

        if(conn == null){
            System.err.println("Erro na conexão");
        }else{

            String sql = "SELECT FROM veiculo WHERE cor like '%" + cor + "%'";

            try{
                Statement st = conn.createStatement();
                ResultSet result = st.executeQuery(sql);

                while (result.next()){
                    list.add(new Veiculo(result.getInt("id"),
                                    result.getString("modelo"),
                                    result.getString("fabricante"),
                                    result.getInt("ano"),
                                    result.getString("cor"),
                                    result.getDouble("preco"),
                                    result.getBoolean("vendido")

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

    public static ArrayList<Veiculo>getPreco(Double preco){
        ArrayList<Veiculo>list = new ArrayList<Veiculo>();
        Connection conn = Db.getConn();

        if(conn == null){
            System.err.println("Erro na conexão");
        }else{

            String sql = "SELECT * FROM veiculo WHERE preco is " + preco;

            try{
                Statement st = conn.createStatement();
                ResultSet result = st.executeQuery(sql);

                while (result.next()){
                    list.add(new Veiculo(result.getInt("id"),
                                    result.getString("modelo"),
                                    result.getString("fabricante"),
                                    result.getInt("ano"),
                                    result.getString("cor"),
                                    result.getDouble("preco"),
                                    result.getBoolean("vendido")

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


    public static void upadateVeiculo(Veiculo v){

        Connection conn = Db.getConn();


        if(conn == null){
            System.out.println("Erro na conexão");
        }else{

            String sql = "UPDATE veiculo "      +
                          "modelo = ?,"         +
                          "fabricante = ?,"     +
                          "cor = ?,"            +
                          "ano = ?,"            +
                          "preco = ?,"          +
                         "vendido = ?"          +
                         "WHERE id = ?";

            try{

                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, v.getModelo());
                st.setString(2, v.getFabricante());
                st.setInt(3, v.getAno());
                st.setString(4, v.getCor());
                st.setDouble(5, v.getPreco());
                st.setBoolean(6, v.isVendido());
                st.setInt(7, v.getId());


                int rows = st.executeUpdate();

                if(rows > 0){

                    System.out.println("\nVeículo atualizado com sucesso!");
                }else{
                    System.out.println("\nFalha ao atualizar o veículo");
                }

                conn.close();
                st.close();

            }catch (SQLException e){
                System.out.println(e);
            }
        }

    }

    public static Veiculo getID(int id){
        Connection conn = Db.getConn();

        if(conn == null){
            System.err.println("Erro na conexão");
        }else{

            String sql = "SELECT * FROM veiculo WHERE preco = " + id;

            try{
                Statement st = conn.createStatement();
                ResultSet result = st.executeQuery(sql);
                Veiculo v = null;

                while (result.next()){
                   v = new Veiculo(result.getInt("id"),
                                    result.getString("modelo"),
                                    result.getString("fabricante"),
                                    result.getInt("ano"),
                                    result.getString("cor"),
                                    result.getDouble("preco"),
                                    result.getBoolean("vendido")

                            );

                }

                st.close();
                conn.close();
                return v;


            }catch (SQLException e){
                System.out.println(e);
            }
        }

        return null;
    }



}



