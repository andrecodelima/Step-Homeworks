package Views;

import Controllers.VeiculoController;
import Models.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class VeiculoView {

    public static void cadastra(ArrayList<Veiculo> lista){

        System.out.println("===================");
        System.out.println("CADASTRO DE VEÍCULOS");
        System.out.println("===================");

        lista.add(VeiculoController.cadastro());
        System.out.println("Veículo Cadastrado");

    }

    public static void printByCor(ArrayList<Veiculo> lista){

        for(Veiculo v : VeiculoController.getByCor(lista)){
            System.out.println("Modelo: " + v.getModelo());
            System.out.println("Ano: " + v.getAno());
            System.out.println("Cor: "  + v.getCor());
        }
    }

}
