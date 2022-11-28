import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String host = "localhost";
        String port = "3306";
        String banco = "papelaria_rio";

        String url = "jdbc:mysql://" + host + ":" + port + "/" + banco;

        String user = "root";
        String pass = "";


        while (true){
            Scanner sc = new Scanner(System.in);

            System.out.println("CADASTRO DE PRODUTOS - PAPELARIA");
            System.out.println("[1] - CADASTRAR || [2] CONSULTAR  || [3] SAIR");
            System.out.print("Digite Aqui: ");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    try{
                        Connection conn = DriverManager.getConnection(url,user,pass);
                        if(conn != null){
                            System.out.println("Conectado ao Banco de dados!\n\n");
                        }

                        Produto item = new Produto();

                        System.out.print("Nome: ");
                        item.nome = sc.next();

                        System.out.print("Fabricante: ");
                        item.fabricante = sc.next();

                        System.out.print("Preço: ");
                        item.preco = sc.next();

                        String sql = "INSERT INTO produtos(nome,fabricante,preco)VALUES(?,?,?)";
                        PreparedStatement statement = conn.prepareStatement(sql);

                        statement.setString(1, item.nome);
                        statement.setString(2, item.fabricante);
                        statement.setString(3, item.preco);

                        int rows = statement.executeUpdate();
                        if(rows > 0){
                            System.out.println("\nProduto cadastrado com sucesso!");
                        }

                        conn.close();


                    }catch (SQLException ex){
                        System.out.println("Erro: " + ex);
                    }
                    break;

                case 2:
                    try{
                        Connection conn = DriverManager.getConnection(url,user,pass);
                        if(conn != null){
                            System.out.println("\nConectado ao banco\n");
                        }

                        String sql = "SELECT * FROM produtos";
                        Statement statement = conn.createStatement();

                        ResultSet result = statement.executeQuery(sql);

                        ArrayList<Produto> produtos = new ArrayList<Produto>();
                        while (result.next()){
                            produtos.add(new Produto(result.getString("nome"),
                                                    result.getString("fabricante"),
                                                    result.getString("preco"),
                                                    result.getInt(1)

                                                    )
                                        );
                        }

                        for(Produto p : produtos){
                            System.out.println("ID" +       p.id);
                            System.out.println("Nome: " + p.nome);
                            System.out.println("Fabricante: " + p.fabricante);
                            System.out.println("Preço: " + p.preco);
                            System.out.println("\n");
                        }


                   }catch (SQLException ex){
                        System.out.println("ERRO: " + ex);
                   }
                    break;

                case 3:
                    System.out.println("OBRIGADO! VOLTE SEMPRE!");
                    System.exit(0);



            }

        }


    }
}


class Produto{

    String nome;
    String fabricante;
    String preco;
    int id;

    public Produto(String nome, String fabricante, String preco, int id) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
        this.id = id;
    }

    public Produto(){}


}