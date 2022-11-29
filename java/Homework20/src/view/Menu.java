package view;

import controllers.VeiculoController;
import modules.VeiculoModel;
import services.Entrada;

import java.util.ArrayList;

public class Menu {

    public static void menu(){

        while (true){

            System.out.println("======================");
            System.out.println("Concessionária MILECAR");
            System.out.println("======================");

            System.out.println("[1] - Cadastrar");
            System.out.println("[2] - Consultar");
            System.out.println("[3] - Sair");

            System.out.print("Escolha uma opção: ");
            int op = Entrada.numInteiro();

            switch (op){
                case 1:
                    System.out.println("Cadastro de Veículo");
                    System.out.println("-------------------");
                    cadastrar();
                    break;

                case 2:
                    System.out.println("Consulta de Veículo");
                    System.out.println("-------------------");
                    consulta();
                    break;

                case 3:
                    System.out.println("Encerrando o Sistema ...");
                    System.exit(0);

                default:
                    System.out.println("Número inválido\n" +
                                        "Tente novamente");
            }
        }
    }

    private static void cadastrar(){
        VeiculoModel v = new VeiculoModel();

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

    public static void consulta(){

        System.out.println("\n\nConsulta de Veículos");
        ArrayList<VeiculoModel> VecList = VeiculoController.getVeiculo();
        if(VecList.size()==0){
            System.out.println("Não há veículos cadastrados");
        }else{
            for(VeiculoModel v : VecList){
                System.out.println("Modelo: " + v.getModelo());
                System.out.println("Fabricante: " + v.getFabricante());
                System.out.println("Ano: " + v.getAno());
                System.out.println("Cor: " + v.getCor());
                System.out.println("Preco: " + v.getPreco());

            }

            System.out.println("\n======== FIM DA CONSULTA ========");

        }

    }

}
