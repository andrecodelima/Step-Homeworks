package services;

import java.util.Scanner;

public class Entrada {

    public static String texto(){
        Scanner read = new Scanner(System.in);

        return read.nextLine();
    }


    public static int numInteiro(){

        int valor = 0;
        boolean acertou = false;

        while (!acertou){
            try{
                Scanner read = new Scanner(System.in);
                valor = read.nextInt();
                acertou = true;

            }catch (Exception e){
                System.out.print(   "Erro.                    \n"  +
                                    "Digite um número inteiro.\n"  +
                                    "Tente novamente: ");

            }

        }

        return valor;

    }

    public static double numDouble(){

        double valor = 0;
        boolean acertou = false;

        while (!acertou){
            try{
                Scanner read = new Scanner(System.in);
                valor = read.nextDouble();
                acertou = true;

            }catch (Exception e){
                System.out.print(   "Erro.        \n"  +
                        "Digite um número decimal.\n"  +
                        "Tente novamente: ");

            }

        }

        return valor;

    }



}
