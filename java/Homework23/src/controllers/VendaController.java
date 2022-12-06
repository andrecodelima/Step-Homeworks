package controllers;
import modules.Veiculo;
import modules.Vendas;
import services.Db;
import services.Entrada;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class VendaController {

    public static void addVenda(Vendas venda){
        Connection conn = Db.getConn();

        String sql = "INSERT INTO vendas (idveiculo) VALUES(?)";

        try{
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, venda.getIdveiculo());

            int rows = st.executeUpdate();

            Veiculo veiculo = VeiculoController.getID(venda.getIdveiculo());
            veiculo.setVendido(true);
            VeiculoController.upadateVeiculo(veiculo);

            if(rows > 0){
                System.out.println("\nVenda concluída!\n ");
            }

            conn.close();

        }catch (SQLException e){
            System.out.println(e);
        }


    }


    public static ArrayList<Vendas> getAll(){

        Connection conn = Db.getConn();
        ArrayList<Vendas> list = new ArrayList<Vendas>();


        try {
            String sql = "SELECT * FROM vendas";
            Statement st = conn.createStatement();

            ResultSet result = st.executeQuery(sql);
            while (result.next()){

                list.add(new Vendas(
                                        result.getInt("id"),
                                        result.getInt("idveiculo"),
                                        result.getDate("dataHora")
                                        )
                );
            }

            st.close();
            conn.close();
            return list;

        }catch (SQLException e){
            System.out.println(e);
        }

        return null;
    }



    public static Vendas vendaID(){
        Vendas v = new Vendas();

        System.out.println("POR ID");

        System.out.println("-------------------------");
        System.out.print("Qual ID do veículo vendido: ");

        v.setIdveiculo(Entrada.numInt());

        return v;
    }

    public static Vendas vendaDia(){
        Vendas v = new Vendas();

        System.out.println("POR DATA");

        System.out.println("-------------------------");
        System.out.print("Qual veículo vendido: ");

        v.setDataHora(Entrada.numInt());

        return v;
    }

    public static Vendas vendaVeiculo(){
        Vendas v = new Vendas();

        System.out.println("POR VEÍCULO");

        System.out.println("-------------------------");
        System.out.print("Qual veículo vendido: ");

        v.setIdveiculo(Entrada.numInt());

        return v;
    }
}
