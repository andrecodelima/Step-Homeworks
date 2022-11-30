package dever.view;

import dever.Main;
import dever.controllers.ProdutoController;
import dever.models.ProdutoModel;
import dever.services.Receber;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void menu(){

        while (true){

            System.out.println("=======================");
            System.out.println("=======LOJA JAVA ======");
            System.out.println("=======================");
            System.out.println("[0] SAIR");
            System.out.println("[1] Cadastrar");
            System.out.println("[2] Consultar");
            System.out.print("Escolha uma opção: ");

            String op = Receber.texto();

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
        ProdutoModel p = new ProdutoModel();

        System.out.println("\n\nCADASTRO DE PRODUTOS\n\n");
        System.out.print("Nome do Produto: ");
        p.setNome(Receber.texto());

        System.out.print("Fabricante: ");
        p.setFabricante(Receber.texto());

        System.out.print("Preço: ");
        p.setPreco(Receber.numeroDouble());

        ProdutoController.addProduto(p);

    }

    private static void consultar(){
        System.out.println("\n\nCONSULTA DE PRODUTOS\n\n");
        ArrayList<ProdutoModel> produtos = ProdutoController.getAll();

        if(produtos.size() == 0){
            System.out.println("Não há produtos cadastrados");
        }else{
            for(ProdutoModel p : produtos){
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
