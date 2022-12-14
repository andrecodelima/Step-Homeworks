package services;

import java.util.Scanner;

public class Entrada {

    public static String entTexo(){

        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    public static int entInt(){

        int valor = 0;
        boolean certo = false;

        while (certo != true){
            try{
                Scanner sc = new Scanner(System.in);
                valor = sc.nextInt();
                certo = true;

            }catch (Exception e){
                System.out.print("ERRO\n" +
                        "Número inteiro solicitado! \n" +
                        "Tente outra vez: ");
            }
        }

        return valor;
    }

    public static double entDecimal(){

        double valor = 0;
        boolean certo = false;

        while (certo != true){
            try{
                Scanner sc = new Scanner(System.in);
                valor = sc.nextDouble();
                certo = true;

            }catch (Exception e){
                System.out.print("ERRO\n" +
                        "Número decimal solicitado! \n" +
                        "Tente outra vez: ");
            }
        }

        return valor;
    }
}
