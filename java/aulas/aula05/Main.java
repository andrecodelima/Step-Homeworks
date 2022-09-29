package main;

import java.util.Scanner;

public class Main {
    private static Scanner ler = new Scanner(System.in);
    // static - pode ser acessado mesmo sem instanciar a classe em um objeto;

    public static void main(String[] args) {

        //Funções/Métodos
        System.out.println(Math.random());
        //o método random é um método estático da classe Math, por isso não precisamos criar
        //um objeto do Math para acessá-lo
        imprimeHello();
        System.out.println(soma(7,9));

        System.out.println(subtrai(15,9));

        System.out.println(multiplica(7,9));

        System.out.println(divide(7,0));
        System.out.println(divide(7,3));
    }

    private static void imprimeHello(){ //private é acessado apenas dentro da mesma classe
        System.out.println("Hello World");
        System.out.print("Digite uma frase: ");
        String frase =  ler.nextLine();
        //o método nextLine() é um método não-estático, por isso precisa de um objeto
        //do tipo Scanner para acessá-lo
        System.out.println();

        System.out.println("Impressão do array");
        int [][] array = arrayInteiros();

        for(int i = 0; i < array.length; i++){
            for (int j = 0 ; j < array[i].length ; j++){
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    private static String soma(double valor1, double valor2){
        return "Resultado: " + (valor1 + valor2);
    }

    //--------------Exercício
    //crie uma função para cada operação básica matemática, sendo
    // soma, subtração, multiplicação e divisão
    // todas precisam receber 2 parâmetros e retornar o resultado.
    // faça uma impressão de cada método dentro do "psvm", preenchendo os parâmetros
    //com valores arbitrários

    private static double subtrai(double valor1, double valor2){
        return valor1 - valor2;
    }

    private static double multiplica(double valor1, double valor2){
        return valor1 * valor2;
    }

    private static double divide(double valor1, double valor2){
        if(valor2 == 0){
            return 0;
        }

        return valor1 / valor2;
    }
    /*
    DESAFIO -> crie uma função que retorne um array de 4x4 com valores preenchidos aletóriamente
    entre 0 e 20, usando o Math.random().
    imprima os valores do array gerado através do psvm.
    valor.toFixed(0) == Math.round(valor)
                        Math.round(10.5) == 11 (arredonda)
                        Math.floor(10.5) == 10 (ignora o valor decimal)
     */

    private static int[][] arrayInteiros(){
        int [][] array = new int[4][4];

        for(int i = 0; i < array.length ;i++){
            for (int j = 0; j < array[i].length ; j++){
                array[i][j] = (int) Math.floor(Math.random()*21);
            }
        }
        return array;
    }
}

//------------------DEVER DE CASA----------------
/*
Crie uma programa que te dê duas opções:
a) imprimir um array de 10x10 com valores aleatórios entre 1 e 30;
b) receber dois valores inteiros e exibir a soma, multiplicação e potência(2 e 3 == 2³) entre os dois.

NÃO ESQUEÇA DE CRIAR E USAR OS MÉTODOS (com ou sem retorno) PARA CADA TAREFA.
Isso se chama encapsulamento de funções.

 */