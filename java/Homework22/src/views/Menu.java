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
        System.out.println("[4] - CONSULTAR POR ANO");
        System.out.println("[5] - CONSULTAR POR COR");
        System.out.println("[6] - CONSULTAR POR PREÇO");

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
                }

                break;

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
                    System.out.println("Ná há cadastros com Fabricante informado");

                }
                break;

            case "3":
                System.out.println("\nPOR MODELO");
                System.out.println("Informe o modelo: ");
                String modelo = Entrada.texto();

                ArrayList<Veiculo> list3 = VeiculoController.getModelo(modelo);

                for (Veiculo v : list3) {
                    VeiculoController.exibir(v);
                    System.out.println("------------------");
                }

                if (list3.isEmpty()) {
                    System.out.println("Ná há cadastros com Modelo informado");

                }
                break;

            case "4":
                System.out.println("\nPOR ANO");
                System.out.println("Informe o ano: ");
                int ano = Entrada.numInteiro();

                ArrayList<Veiculo> list4 = VeiculoController.getAno(ano);

                for (Veiculo v : list4) {
                    VeiculoController.exibir(v);
                    System.out.println("------------------");
                }

                if (list4.isEmpty()) {
                    System.out.println("Ná há cadastros com ano informado");

                }
                break;

            case "5":
                System.out.println("\nPOR COR");
                System.out.println("Informe a cor: ");
                String cor = Entrada.texto();

                ArrayList<Veiculo> list5 = VeiculoController.getCor(cor);

                for (Veiculo v : list5) {
                    VeiculoController.exibir(v);
                    System.out.println("------------------");
                }

                if (list5.isEmpty()) {
                    System.out.println("Ná há cadastros com a cor informada");

                }
                break;

        }

    }

    public static void vender(){

        Veiculo v = new Veiculo();

        System.out.println("VENDA DE VEÍCULOS");

        System.out.print("INFORME O ID DO VEÍCULO QUE DESEJA VENDER: ");
        v.setId(Entrada.numInteiro());

        VeiculoController.Venda(v);


        }

    }

