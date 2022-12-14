package controllers;

import models.Boleto;
import services.Db;
import services.Entrada;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import java.util.ArrayList;

public class BoletoController {

    public static void addBoleto(Boleto b){
        Connection conn = Db.Connect();

        try{
            String sql = "INSERT INTO boleto (vencimento, valor) VALUES (?,?)";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setDate(1, Date.valueOf(b.getVencimento()));
            st.setDouble(2, b.getValor());

            int rows = st.executeUpdate();
            if(rows > 0){
                System.out.println("Boleto cadastrado com sucesso!");
            }else{
                System.out.println("Falha no cadastro");
            }

            st.close();
            conn.close();

        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void cadastrar(){
        Boleto b = new Boleto();

        int ano;
        int mes;
        int dia;

        System.out.println("Cadastre a data de vencimento");
        System.out.println("-----------------------------");
        System.out.print("Ano: ");
        ano = Entrada.entInt();

        System.out.print("Mês: ");
        mes = Entrada.entInt();

        System.out.print("Dia: ");
        dia = Entrada.entInt();

        LocalDate dataVence = LocalDate.of(ano,mes,dia);
        b.setVencimento(dataVence);

        System.out.print("Valor: ");
        b.setValor(Entrada.entDecimal());

        BoletoController.addBoleto(b);

    }

    public static void exibir(Boleto b){

        System.out.println("ID-Vencimento: "    + b.getId());
        System.out.println("Vencimento: "       + b.getVencimento());
        System.out.println("Valor: "            + b.getValor());
    }

    public static ArrayList<Boleto>allBoletos(){
        ArrayList<Boleto>list = new ArrayList<Boleto>();
        Connection conn = Db.Connect();

        if(conn == null){
            System.out.println("Falha na conexão");
        }else {


            try {

                String sql = "SELECT * FROM boleto";
                Statement st = conn.createStatement();
                ResultSet consult = st.executeQuery(sql);

                while (consult.next()) {
                    list.add(new Boleto(
                                    consult.getInt("id"),
                                    consult.getDate("vencimento").toLocalDate(),
                                    consult.getDouble("valor")
                            )
                    );
                }

                st.close();
                conn.close();

            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return list;
    }

    public static ArrayList<Boleto>boletoVencidos(){
        ArrayList<Boleto>list = new ArrayList<Boleto>();
        Connection conn = Db.Connect();

        if(conn == null){
            System.out.println("Falha na conexão");
        }else {
            LocalDate data = LocalDate.now();

            try {

                String sql = "SELECT * FROM boleto WHERE vencimento > " + data;
                Statement st = conn.createStatement();
                ResultSet consult = st.executeQuery(sql);

                while (consult.next()) {
                    list.add(new Boleto(
                                    consult.getInt("id"),
                                    consult.getDate("vencimento").toLocalDate(),
                                    consult.getDouble("valor")
                            )
                    );
                }

                st.close();
                conn.close();

            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return list;
    }
}
