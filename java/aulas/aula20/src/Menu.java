import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void menu(){
        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("================");
            System.out.println("Papelaria");
            System.out.println("================");

            System.out.println("[0] SAIR");
            System.out.println("[1] CADASTRAR");
            System.out.println("[2] CONSULTAR");

            System.out.print("Escolha uma opção: ");
            int op = sc.nextInt();

            switch (op){
                case 0:
                    System.out.println("ENCERRANDO O SISTEMA");
                    System.exit(0);

                case 1: // Cadastrar
                    cadastrar();
                    break;

                case 2:
                    consultar();
                    break;

                default:
                    System.out.println("Tente novamente");

            }
        }

    }
    private static void cadastrar(){
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        System.out.print("Nome: ");
        p.setNome(sc.nextLine());

        System.out.print("Fabricante: ");
        p.setFabricante(sc.nextLine());

        System.out.print("Preço: ");
        p.setPreco(sc.nextDouble());

        Main.addProduto(p);

    }

    public static void consultar(){
        System.out.println("\n\nConsulta de Produtos\n");

        ArrayList<Produto> produtos = Main.getAllProduto();
        if(produtos.size() == 0){
            System.out.println("Não há produtos cadastrados");
        }else{
            for(Produto p : produtos){
                System.out.println("Produto: " + p.getNome());
                System.out.println("Fabricante: " + p.getFabricante());
                System.out.println("Preço R$: " + p.getPreco());
                System.out.println("---------------------------");

            }

            System.out.println("\n ======== FIM DA CONSULTA ==========");
        }

    }


}
