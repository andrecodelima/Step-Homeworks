package views;

import controllers.VeiculoController;
import controllers.VendaController;
import modules.Veiculo;
import services.Entrada;

import java.util.ArrayList;

public class Menu {

    public static void menu(){

        while (true){

            System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
            System.out.println("=+=+=+ NEW CAR MOTORS =+=+=+");
            System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+\n");

            System.out.println("[1] - CADASTRAR");
            System.out.println("[2] - CONSULTAR");
            System.out.println("[3] - VENDER");

            System.out.println("-----------------------------");
            System.out.println("[0] - SAIR");

            System.out.println("");
            System.out.print("Escolha: ");

            int op = Entrada.numInt();

            switch (op){
                case 0:
                    System.out.println("Encerrando o sistema ...");
                    System.exit(0);

                case 1:
                    cadastrar();
                    break;

                case 2:
                    consultar();
                    break;

                case 3:
                    vender();
                    break;

                default:
                    System.out.println("          !             ");
                    System.out.println("Escolha uma opção válida");

            }

        }

    }

    public static void cadastrar(){

        Veiculo v = new Veiculo();
        System.out.println("\n=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("Cadastro de Véiculos ");

        System.out.print("Modelo: ");
        v.setModelo(Entrada.texto());

        System.out.print("Fabricante: ");
        v.setFabricante(Entrada.texto());

        System.out.print("Ano: ");
        v.setAno(Entrada.numInt());

        System.out.print("Cor: ");
        v.setCor(Entrada.texto());

        System.out.print("Preço: ");
        v.setPreco(Entrada.numDouble());

        VeiculoController.addVeiculo(v);
    }


    public static void consultar(){
        System.out.println("\n=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("CONSULTA DE VÉICULOS");

        System.out.println("[1] - TODOS OS VEÍCULOS");
        System.out.println("[2] - MODELO");
        System.out.println("[3] - FABRICANTE");
        System.out.println("[4] - ANO");
        System.out.println("[5] - COR");
        System.out.println("[6] - PRECO");


        System.out.println("");
        System.out.print("Escolha: ");

        int op = Entrada.numInt();

        switch (op){
            case 1:
                System.out.println("TODOS");
                ArrayList<Veiculo> list1 = VeiculoController.getAll();
                for(Veiculo vec: list1){
                    VeiculoController.exibir(vec);
                    System.out.println("------------");
                }

                if(list1.isEmpty()){
                    System.out.println("Não há veículos cadastrados");
                }

                break;

            case 2:
                System.out.println("MODELO");
                System.out.println("------");

                System.out.print("Modelo: ");
                String modelo = Entrada.texto();

                ArrayList<Veiculo> list2 = VeiculoController.getModelo(modelo);
                for(Veiculo vec: list2){
                    VeiculoController.exibir(vec);
                    System.out.println("------------");
                }

                if(list2.isEmpty()){
                    System.out.println("Não há veículos cadastrados");
                }

                break;

            case 3:
                System.out.println("FABRICANTE");
                System.out.println("------");

                System.out.print("Fabricante: ");
                String fabricante = Entrada.texto();

                ArrayList<Veiculo> list3 = VeiculoController.getModelo(fabricante);
                for(Veiculo vec: list3){
                    VeiculoController.exibir(vec);
                    System.out.println("------------");
                }

                if(list3.isEmpty()){
                    System.out.println("Não há veículos cadastrados");
                }

                break;

            case 4:
                System.out.println("ANO");
                System.out.println("------");

                System.out.print("Ano: ");
                int ano = Entrada.numInt();

                ArrayList<Veiculo> list4 = VeiculoController.getAno(ano);
                for(Veiculo vec: list4){
                    VeiculoController.exibir(vec);
                    System.out.println("------------");
                }

                if(list4.isEmpty()){
                    System.out.println("Não há veículos cadastrados");
                }

                break;

            case 5:
                System.out.println("COR");
                System.out.println("------");

                System.out.print("Ano: ");
                String cor = Entrada.texto();

                ArrayList<Veiculo> list5 = VeiculoController.getCor(cor);
                for(Veiculo vec: list5){
                    VeiculoController.exibir(vec);
                    System.out.println("------------");
                }

                if(list5.isEmpty()){
                    System.out.println("Não há veículos cadastrados");
                }

                break;

            case 6:
                System.out.println("PREÇO");
                System.out.println("------");

                System.out.print("Ano: ");
                double preco = Entrada.numDouble();

                ArrayList<Veiculo> list6 = VeiculoController.getPreco(preco);
                for(Veiculo vec: list6){
                    VeiculoController.exibir(vec);
                    System.out.println("------------");
                }

                if(list6.isEmpty()){
                    System.out.println("Não há veículos cadastrados");
                }

                break;

        }



    }

    public static void vender(){
        System.out.println("\n\n===== VENDA DE VEÍCULOS =====");
        System.out.println("----------------------------------");
        System.out.println("[1] - POR ID");
        System.out.println("[2] - POR DIA");
        System.out.println("[3] - POR VEÍCULO");

        System.out.print("Escolha: ");

        int op = Entrada.numInt();
        switch (op){
            case 1:
                VendaController.addVenda(VendaController.vendaID());
                break;
        }




    }



}



