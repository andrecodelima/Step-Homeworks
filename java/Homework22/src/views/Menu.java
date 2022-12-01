package views;

import controllers.VeiculoController;
import models.Veiculo;
import services.Entrada;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void menu(){

        while (true){

            System.out.println("==========================");
            System.out.println("====== FASTCAR 2000 ======");
            System.out.println("==========================");

            System.out.println("");

            System.out.println("[1] - CADASTRAR");
            System.out.println("----------------");

            System.out.println("[2] - CONSULTAR");
            System.out.println("----------------");

            System.out.println("[3] - VENDER");
            System.out.println("----------------");

            System.out.println("[0] - SAIR");
            System.out.println("-----------------");


            System.out.print("Escolha uma das opções acima: ");

            String op = Entrada.texto();
            switch (op){

                case "1":
                    cadastrar();
                    break;

                case "2":
                    consultar();
                    break;

                case "3":
                    vender();
                    break;

                case "0":
                    System.out.println("Encerrando o sistema ...");
                    System.exit(0);


                default:
                    System.out.println("Opção inválida. Tente novamente");

            }

        }
    }

    public static void cadastrar(){
        Veiculo v = new Veiculo();

        System.out.println("\nCADASTRO DE VEÍCULOS\n");
        System.out.print("Modelo: ");
        v.setModelo(Entrada.texto());

        System.out.print("Fabricante: ");
        v.setFabricante(Entrada.texto());

        System.out.print("Ano: ");
        v.setAno(Entrada.numInteiro());

        System.out.print("Cor: ");
        v.setCor(Entrada.texto());

        System.out.print("Preço: ");
        v.setPreco(Entrada.numDouble());

        VeiculoController.addVeiculo(v);


    }


    public static void consultar() {

        System.out.println("\nCONSULTA DE VEÍCULOS\n");

        System.out.println("[1] - CONSULTAR TODOS OS VEÍCULOS");
        System.out.println("[2] - CONSULTAR POR FABRICANTE");
        System.out.println("[3] - CONSULTAR POR MODELO");
        System.out.println("[4] - CONSULTAR POR COR");
        System.out.println("[5] - CONSULTAR POR PREÇO");

        System.out.print("Escolha uma das opções acima: ");
        String op = Entrada.texto();

        switch (op) {
            case "1":
                ArrayList<Veiculo> list1 = VeiculoController.getAll();
                System.out.println("\nTODOS OS VEÍCULOS");

                for (Veiculo v : list1) {
                    VeiculoController.exibir(v);
                    System.out.println("------------------");
                }

                if (list1.isEmpty()) {
                    System.out.println("Ná há veículos cadastrados");
                    break;
                }

            case "2":
                System.out.println("\nPOR FABRICANTE");
                System.out.println("Informe o fabricante: ");
                String fabricante = Entrada.texto();

                ArrayList<Veiculo> list2 = VeiculoController.getFabricante(fabricante);

                for (Veiculo v : list2) {
                    VeiculoController.exibir(v);
                    System.out.println("------------------");
                }

                if (list2.isEmpty()) {
                    System.out.println("Ná há cadastros com fabricante");

                }

        }

    }
}
