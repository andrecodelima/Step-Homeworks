package services;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Scanner;

public class Entrada {

    public static String texto(){

        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    public static int numInt(){

        int valor = 0;
        boolean acertou = false;

        while (!acertou){

            try{
                Scanner sc = new Scanner(System.in);
                valor = sc.nextInt();
                acertou = true;
            }catch (Exception e){
                System.out.print("Erro!\n" +
                                    "Digite um valor inteiro: ");

            }
        }

        return valor;

    }

    public static double numDouble(){
        double valor = 0;
        boolean acertou = false;

        while (!acertou){

            try {
                Scanner sc = new Scanner(System.in);
                valor = sc.nextDouble();
                acertou = true;
            }catch (Exception e){
                System.out.print("Errou!\n" +
                                "Digite um valor decimal: ");
            }
        }

        return valor;

    }

    public static Data numDouble(){
        Date valor = new Date();

        valor.getTime();

        boolean acertou = false;

        while (!acertou){

            try {
                Scanner sc = new Scanner(System.in);
                valor = sc.nextDouble();
                acertou = true;
            }catch (Exception e){
                System.out.print("Errou!\n" +
                        "Digite um valor decimal: ");
            }
        }

        return valor;

    }

}
