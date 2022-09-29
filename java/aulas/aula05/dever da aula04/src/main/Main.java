package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double [][] notas = new double[4][4];
        Scanner read = new Scanner(System.in);

        System.out.println("Cadastro de notas");

        for (int i = 0; i < notas.length; i++){
            System.out.println("Informações do " + (i+1) + "º aluno:");
            for(int j = 0; j < notas[i].length; j++){
                System.out.print("Aluno " + (i+1) + ", nota " + (j+1) +": ");
                notas[i][j] = read.nextInt();
            }
            System.out.println("Fim do " + (i+1) + "º aluno:");
            System.out.println("========================");
        }

        System.out.println("Notas cadastradas");
        for(int i = 0; i < notas.length ; i++){
            double media = 0;
            System.out.println("Notas do " + (i+1) + "º aluno:");
            System.out.print("Nota: ");

            for (int j = 0; j < notas[i].length; j++){
                System.out.print(notas[i][j] + "\t\t");
                media += notas[i][j];
            }
            //Extra-------------------------------------------------
            if(media < 5){
                System.out.println("Condição final: Reprovado");
            } else if (media < 7) {
                System.out.println("Condição final: Recuperação");
            }else{
                System.out.println("Condição final: Aprovado");
            }
            //------------------------------------------------------

            System.out.println("\nFim do " + (i+1) + "º aluno");
            System.out.println("=============================");
        }
    }
}

/*
 * Dever de casa:
 * cadastre um array de notas de alunos.
 * guarde cada aluno em uma linha do array:
 * cada aluno deverá ter 4 notas;
 * cadastre 4 alunos e, ao final do cadastro, exiba:
 * as notas dos alunos e a média das notas.
 *
 * --EXTRA- Diga se está aprovado ou reprovado sabendo: de 0 à 5 reprovado, de 5 à 7 recuperação
 * e de 7 pra cima está aprovado!
 * */