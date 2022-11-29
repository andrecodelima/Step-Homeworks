package Menu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {

    public static void menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("================");
        System.out.println("Papelaria");
        System.out.println("================");

        System.out.println("[0] SAIR");
        System.out.println("[1] CADASTRAR");
        System.out.println("[2] CONSULTAR");

        System.out.print("Escolha uma opção: ");
        int op = sc.nextInt();

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
