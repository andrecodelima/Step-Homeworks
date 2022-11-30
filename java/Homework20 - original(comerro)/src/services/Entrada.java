package services;

import java.util.Scanner;

public class Entrada {

    public static String texto(){

        Scanner sc = new Scanner(System.in);

        return sc.next();

    }

    public static int numInteiro(){
        int valor = 0;
        boolean acertou = false;

        while (!acertou){
            Scanner sc = new Scanner(System.in);

            try{
                valor = sc.nextInt();
                acertou = true;

            }catch (Exception e){
                System.out.println("Erro - Tente novamente");

            }

            return sc.nextInt();
        }

            return valor;

    }


    public static double numDouble(){
        Scanner sc = new Scanner(System.in);
        double valor = 0;
        boolean acertou = false;

        while (!acertou){

            try{

            }catch(Exception e){
                System.out.println("Erro - Necessário número decimal ");
                System.out.println("Tente novamente");
            }

            return sc.nextDouble();
        }

            return valor;
    }





}
