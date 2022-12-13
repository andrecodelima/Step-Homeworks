package views;

import controllers.VeiculoController;
import models.Veiculo;
import services.Entrada;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void menu(){
        while (true){
            System.out.println("[0] - SAIR");
            System.out.println("[1] - CADASTRAR");
            System.out.println("[3] - EXIBIR");

            System.out.print("Escolha uma opção: ");
            int op = Entrada.entInt();


            switch (op){
                case 1:
                    VeiculoController.cadastrar();
                    break;

                case 3:
                    ArrayList<Veiculo>list1 = VeiculoController.getAll();
                    for(Veiculo v : list1){
                        VeiculoController.exibir(v);
                        System.out.println("-------------");
                    }

                    break;

            }

        }
    }
}
