package views;

import controllers.VeiculoController;
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
//                    vender();
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
        System.out.println("  Cadastro de Véiculos ");

        System.out.print("Modelo: ");
        v.setModelo(Entrada.texto());

        System.out.print("Fabricante: ");
        v.setFabricante(Entrada.texto());

        System.out.print("Ano: ");
        v.setAno(Entrada.numInt());

        System.out.print("Cor: ");
        v.setCor(Entrada.texto());

        System.out.print("Preço");
        v.setPreco(Entrada.numDouble());

        VeiculoController.addVeiculo(v);
    }


    public static void consultar(){
        System.out.println("\n=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("   CONSULTA DE VÉICULOS");

        System.out.println("[1] - TODOS OS VEÍCULOS");

        int op = Entrada.numInt();

        switch (op){
            case 1:
                ArrayList<Veiculo> list1 = VeiculoController.getAll();
                for(Veiculo vec: list1){
                    VeiculoController.exibir(vec);
                    System.out.println("------------");
                }

                if(list1.isEmpty()){
                    System.out.println("Não há veículos cadastrados");
                }

                break;

        }

    }


}
