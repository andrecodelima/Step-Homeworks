package dever.services;

import java.util.Scanner;

public class Receber {

    public static String texto(){
        Scanner leia = new Scanner(System.in);

        return leia.nextLine();
    }

    public static int numeroInteiro(){

        int valor = 0;
        boolean acertou = false;

        while (!acertou){
            try{
                Scanner leia = new Scanner(System.in);
                valor = leia.nextInt();
                acertou = true;

            }catch (Exception e){
                System.out.print("Erro. Digite um número inteiro\n" +
                                "Tente novamente: ");

            }
        }
        return valor;
    }

    public static double numeroDouble(){

        double valor = 0;
        boolean acertou = false;

        while (!acertou){
            try{
                Scanner leia = new Scanner(System.in);
                valor = leia.nextDouble();
                acertou = true;

            }catch (Exception e){
                System.out.print("Erro. Digite um número decimal\n" +
                                "Tente novamente: ");

            }
        }
        return valor;
    }
}
