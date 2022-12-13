package controllers;

import models.Cliente;
import services.Db;
import services.Entrada;

import java.sql.*;
import java.util.ArrayList;

public class ClienteController {

    public static void addVeiculo(){
        Connection conn = Db.Connect();

        try {
            String sql = "INSERT INTO cliente (nome,cpf,telefone,email) VALUES (?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);

            st.setString(1, "nome");
            st.setString(2, "cpf");
            st.setString(3, "telefone");
            st.setString(4,"email");

            int rows = st.executeUpdate();
            if(rows > 0 ){
                System.out.println("Veículo cadastrado com sucesso!");
            }else{
                System.out.println("falha no cadastro");
            }

            st.close();
            conn.close();

        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public static void cadastrar(){
        Cliente c = new Cliente();

        System.out.print("Nome: ");
        c.setNome(Entrada.entTexo());

        System.out.print("CPF: ");
        c.setCpf(Entrada.entTexo());

        System.out.print("Telefone: ");
        c.setTelefone(Entrada.entTexo());

        System.out.print("E-mail: ");
        c.setEmail(Entrada.entTexo());

        ClienteController.addVeiculo();
    }


    public static void exibir(){
        Cliente c = new Cliente();

        System.out.println("ID: "       + c.getId());
        System.out.println("Nome: "     + c.getNome());
        System.out.println("CPF: "      + c.getEmail());
        System.out.println("Telefone: " + c.getTelefone());
        System.out.println("E-mail: "   + c.getEmail());


    }

    public static ArrayList<Cliente>allClients(){
        ArrayList<Cliente>list = new ArrayList<Cliente>();
        Connection conn = Db.Connect();

        if(conn == null){
            System.out.println("Falha na conexão");
        }else{
            try{
                String sql = "SELECT * FROM cliente";
                Statement st = conn.createStatement();
                ResultSet result = st.executeQuery(sql);

                while (result.next()){
                    list.add(new Cliente(result.getInt("id"),
                                        result.getString("nome"),
                                        result.getString("cpf"),
                                        result.getString("telefone"),
                                        result.getString("email")
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
