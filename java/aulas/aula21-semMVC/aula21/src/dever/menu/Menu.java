package dever.menu;

import dever.Main;
import dever.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void menu(){

        while (true){
            Scanner leia = new Scanner(System.in);

            System.out.println("=======================");
            System.out.println("=======LOJA JAVA ======");
            System.out.println("=======================");
            System.out.println("[0] SAIR");
            System.out.println("[1] Cadastrar");
            System.out.println("[2] Consultar");
            System.out.print("Escolha uma opção: ");

            String op = leia.nextLine();

            switch (op){
                case "0":
                    System.out.println("Encerrando o Sistema");
                    System.exit(0);

                case "1":
                    cadastrar();
                    break;

                case "2":
                    consultar();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente");

            }
        }
    }

    private static void cadastrar(){
        Scanner leia = new Scanner(System.in);
        Produto p = new Produto();

        System.out.println("\n\nCADASTRO DE PRODUTOS\n\n");
        System.out.print("Nome do Produto: ");
        p.setNome(leia.nextLine());

        System.out.print("Fabricante: ");
        p.setFabricante(leia.nextLine());

        System.out.print("Preço: ");
        p.setPreco(leia.nextDouble());

        Main.addProduto(p);

    }

    private static void consultar(){
        System.out.println("\n\nCONSULTA DE PRODUTOS\n\n");
        ArrayList<Produto> produtos = Main.getAllProduto();

        if(produtos.size() == 0){
            System.out.println("Não há produtos cadastrados");
        }else{
            for(Produto p : produtos){
                System.out.println("ID: " + p.getId());
                System.out.println("Produto: " + p.getNome());
                System.out.println("Fabricante: " + p.getFabricante());
                System.out.println("Preço: "  + p.getPreco());
                System.out.println("------------------------");

            }

            System.out.println("\n============ FIM DA CONSULTA ===============\n");
        }

    }

}
