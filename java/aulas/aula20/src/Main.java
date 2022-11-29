import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Menu.menu();

        }

    public static void addProduto(Produto p){
             //Cadastro de produtos no Banco de Dados
            //É void pq quando adiciona produto não há retorno. Só está adicionando

            Connection conect = getConnection();

            if(conect == null){
                System.err.println("Erro na conexão\n Impossível Cadastrar");
            }else{
                String sql = "INSERT INTO produtos(nome, fabricante, preco) VALUES(?,?,?)";
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

        public static ArrayList<Produto> getAllProduto(){

        // Retonar lista com todos os produtos

            ArrayList<Produto> produtoList = new ArrayList<Produto>();
            // Criar a lista

            Connection conect = getConnection();
            //Chamar a conexão

            if(conect == null) {
                System.err.println("Erro ao conectar ao Banco de Dados");
                return produtoList;
            }

            String sql = "SELECT * FROM produtos";

            try {
                Statement st = conect.createStatement();
                ResultSet result = st.executeQuery(sql);

                while (result.next()) {
                    // equanto houver (next) outro resultado ...
                    produtoList.add(new Produto(result.getInt("id"),
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

    public static Connection getConnection(){

        //Criando a conexão
        String host = "jdbc:mysql://localhost:3306/papelaria_rio";
        String user = "root";
        String pass = "";

        Connection conect = null;

        try{
            conect = DriverManager.getConnection(host,user,pass);
            System.out.println("Conect!");
            
        } catch (SQLException error){
            System.err.println(error);

        }
        return conect;
    }

    }





