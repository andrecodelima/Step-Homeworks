package views;

import controllers.VeiculoController;
import services.Entrada;

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
                    VeiculoController.exibir();
                    break;

            }

        }
    }
}
