package view;

import controllers.ProdutoController;
import models.ProdutoModel;
import services.Receber;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    // INTERFACE DO PROGRAMA, É AQUI QUE O USUARIO INTERAGE
    public static void menu(){

        while (true){

            System.out.println("================");
            System.out.println("Papelaria");
            System.out.println("================");

            System.out.println("[0] SAIR");
            System.out.println("[1] CADASTRAR");
            System.out.println("[2] CONSULTAR");

            System.out.print("Escolha uma opção: ");
            int op = Receber.numeroInteiro();

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
        ProdutoModel p = new ProdutoModel();

        System.out.print("Nome: ");
        p.setNome(Receber.texto());

        System.out.print("Fabricante: ");
        p.setFabricante(Receber.texto());

        System.out.print("Preço: ");
        p.setPreco(Receber.numeroDouble());

        ProdutoController.addProduto(p);

    }

    public static void consultar(){
        System.out.println("\n\nConsulta de Produtos\n");

        ArrayList<ProdutoModel> produtos = ProdutoController.getAllProduto();
        if(produtos.size() == 0){
            System.out.println("Não há produtos cadastrados");
        }else{
            for(ProdutoModel p : produtos){
                System.out.println("models.Produto: " + p.getNome());
                System.out.println("Fabricante: " + p.getFabricante());
                System.out.println("Preço R$: " + p.getPreco());
                System.out.println("---------------------------");

            }

            System.out.println("\n ======== FIM DA CONSULTA ==========");
        }

    }


}
