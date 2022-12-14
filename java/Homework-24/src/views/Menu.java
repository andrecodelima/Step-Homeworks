package views;

import controllers.BoletoController;
import controllers.ClienteController;
import models.Boleto;
import models.Cliente;
import services.Entrada;

import java.sql.SQLOutput;
import java.util.ArrayList;

class Menu {

    protected void menu(){

        while (true){
            System.out.println("........ LOJA_PAPER ........\n");
            System.out.println("[1] - CADASTRAR");
            System.out.println("[2] - CONSULTAR");
            System.out.println("[3] - SAIR");

            System.out.print("Escolha uma das opções: ");
            int op = Entrada.entInt();

            switch (op){
                case 1:
                    cadastrar();
                    break;

                case 2:
                    consultar();
                    break;

                case 3:
                    System.out.println("Encerrando o sistema... ");
                    System.exit(0);

            }

        }
    }

    public static void cadastrar(){
        System.out.println("[1] - CADASTRO DE CLIENTES");
        System.out.println("[2] - CADASTRO DE BOLETOS");

        System.out.print("\nEscolha uma das opções: ");
        int op = Entrada.entInt();

        switch (op){
            case 1:
                System.out.println("Cadastro de Clientes\n");
                ClienteController.cadastrar();
                break;

            case 2:
                System.out.println("Cadastro de Boletos\n");
                BoletoController.cadastrar();
                break;

        }

    }

    public static void consultar(){
        System.out.println("[1] - CONSULTA DE CLIENTES");
        System.out.println("[2] - CONSULTA DE TODOS OS BOLETOS");
        System.out.println("[3] - CONSULTA DOS BOLETOS VENCIDOS");

        System.out.print("\nEscolha uma das opções: ");
        int op = Entrada.entInt();

        switch (op){
            case 1:
                System.out.println("CONSULTA DE CLIENTES");
                ArrayList<Cliente>list1 = ClienteController.allClients();
                for(Cliente c : list1){

                    ClienteController.exibir(c);
                    System.out.println("----------------------");

                }if(list1.isEmpty()){
                System.out.println("Não há clientes cadastrados");
            }

            case 2:
                System.out.println("CONSULTA DE TODOS OS BOLETOS");
                ArrayList<Boleto>list2 = BoletoController.allBoletos();
                for(Boleto b : list2){

                    BoletoController.exibir(b);
                    System.out.println("----------------------");

                }if(list2.isEmpty()){
                System.out.println("Não há boletos cadastrados");
            }

            case 3:
                System.out.println("CONSULTA DOS BOLETOS VENCIDOS");
                ArrayList<Boleto>list3 = BoletoController.boletoVencidos();
                for(Boleto bvenc : list3){

                    BoletoController.exibir(bvenc);
                    System.out.println("----------------------");

                }
            }
        }
    }

