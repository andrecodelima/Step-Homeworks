package services;

import java.util.Scanner;

public class Entrada {

    public static String entText(){
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();

    }

    public static int entInt(){

        int valor = 0;
        boolean acertou = false;

        while (acertou == false){
            try {
                Scanner sc = new Scanner(System.in);
                valor = sc.nextInt();
                acertou = true;

            } catch (Exception e) {
                System.out.println("Erro!\n" +
                        "Digite um número inteiro!");
                System.out.print("Tente novamente: ");
            }
        }
        return valor;
    }


    public static double entDouble(){
        double valor = 0;
        boolean acertou = false;

        while (acertou == false){
            try {
                Scanner sc = new Scanner(System.in);
                valor = sc.nextDouble();
                acertou = true;
            }catch (Exception e){
                System.out.print("Erro\n " +
                        "Digite um número decimal!" +
                        "Tente novamente: "
                        );
            }
        }
        return valor;
    }
}
