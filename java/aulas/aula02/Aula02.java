
package aula02;

import java.util.Scanner;


public class Aula02 {

  
    public static void main(String[] args) {
      //  Scanner leia = new Scanner(System.in);
        
      //  System.out.print("Digite a sua altura: ");
      //  double altura = leia.nextDouble();
        
      //  System.out.print("Digite seu peso: ");
      //  double peso = leia.nextDouble();
        
        // Peso / Altura²
      //  double imc = (peso /(altura * altura));
                
      //  System.out.println("Seu IMC é: " + imc);
        
        // Criação e uso de arrays
        
        // Vetor ou array unidirecional
        // String [] nome;
     /*   int [] numeros = new int[4];
        
        numeros [0] = 2;
        numeros [1] = 4;
        numeros [2] = 6;
        numeros [3] = 8;
        
        // Declaras os valores entre chaves "{}"
        String [] frutas = {"banana", "pera", "maçã", "uva"};
        
        // Se imprimir assim ele vai exibir apenas as posições na memoria
        System.out.println(numeros);
        System.out.println(frutas);
        
        // Precisa exibir usando o FOR.
        
        for(int c = 0; c< numeros.length; c++){
            System.out.println("Número: " + numeros[c]);
        }
        
        System.out.println("");
        
        for(int c = 0; c < frutas.length; c++){
            System.out.println("Frutas: " + frutas[c]);
        }
        
        //        
        
        int [] aux = new int[numeros.length + 1];
        for(int i = 0; i<numeros.length; i++){
            aux[i] = numeros[i];
        }
        
          numeros = aux; // Var numero recebeu o array
          numeros[4] = 10;
          
          for(int i = 0; i< numeros.length; i++){
            System.out.println("Número: " + numeros[i]);
        }*/
          
          // ESCOPO DA VARIÁVEL
          //Se uma variavel é criada dentro de uma chave ela morre junto
         // com a chave como o For por exemplo
        
        
          // Exercício em aula
         
          int [] [] valores = new int [4] [4];
          int [][] matriz = {  // 0, 1, 2, 3
              
                          /*0*/      {1, 3, 5, 7},
                          /*2*/      {2, 4, 6, 8},
                         /*2*/       {15, 22, 44, 30},
                         /*3*/       {9, 3, 2, 4}
                    
                             };
          
        for(int c = 0; c<matriz.length; c++){
            for(int i = 0; i<matriz.length; i++){
                System.out.println("Valor-Matriz: " + matriz[c][i]);
            };
        };
        
        System.out.println("");
        
        // Correção
        int [] [] valoresB = new int [2][3]; //[2] 2 linhas -- [3] 3 colunas
        int [] [] matrizB = { // Matriz 4 x 4 (4 linhas e 4 colunas
                               {1, 2, 3, 4},
                               {5, 6, 7, 8},
                               {9, 10, 11, 12},
                               {13, 14, 15, 16}
                            
                            };
       
        for(int linha = 0; linha<matrizB.length; linha ++){
            for(int coluna = 0; coluna<matriz[linha].length; coluna++){
                System.out.print(matrizB[linha][coluna] + " ");
               
            };
            System.out.println("");
        };
        
        
     

    }
    
}
