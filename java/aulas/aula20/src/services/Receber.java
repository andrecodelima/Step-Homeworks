package services;

import java.util.Scanner;

public class Receber {

    public static String texto(){

        Scanner sc = new Scanner(System.in);

        return sc.nextLine();

        }

        public static int numeroInteiro(){
            Scanner sc = new Scanner(System.in);
            int valor = 0;
            boolean acertou = false;

            while (acertou != true){
                try{
                    valor = sc.nextInt();
                    acertou = true;

                }catch (Exception e){
                    System.out.println("Erro - Necessário numero inteiro");
                    System.out.print("Tente novamente: ");
                }

                return sc.nextInt();

                }
            return valor;

        }

    public static double numeroDouble(){
        Scanner sc = new Scanner(System.in);
        double valor = 0;
        boolean acertou = false;

        while (acertou != true){
            try{
                valor = sc.nextInt();
                acertou = true;

            }catch (Exception e){
                System.out.println("Erro - Necessário numero inteiro");
                System.out.print("Tente novamente: ");
            }

            return sc.nextDouble();

        }
        return valor;

    }
    }

