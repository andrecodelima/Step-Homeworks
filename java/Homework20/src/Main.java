import modules.VeiculoModel;
import services.Db;
import view.Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

      //  Db c = new Db();
        //  c.getConn();

        Menu m = new Menu();
        m.menu();

    }

    public static void addVeiculo(VeiculoModel v){

        Connection conn = Db.getConn();
        if(conn == null){
            System.out.println("Erro na conexão\n");
        }else{
            String sql = "INSERT INTO veiculo (modelo,fabricante,cor,ano,preco) VALUES(?,?,?,?,?)";
            try{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, v.getModelo());
                statement.setString(2, v.getFabricante());
                statement.setString(3, v.getCor());
                statement.setInt(4, v.getAno());
                statement.setDouble(5, v.getPreco());

                int rows = statement.executeUpdate();

                if(rows > 0){
                    System.out.println("\n===========");
                    System.out.println("Produto cadastrado");
                    System.out.println("=================\n");
                }

                statement.close();
                conn.close();

            }catch (SQLException e){
                System.err.println(e);
            }

        }
    }
}