 
package aula03;

import java.util.Locale;
import java.util.Scanner;

 
public class Aula03 {

  
    public static void main(String[] args) {
        //ENTRADA DE DADOS
        
//        LENDO STRINGS
    //        Scanner leia = new Scanner(System.in);;;
    //        System.out.print("Digite um nome: ");
    //      
    //        String nome;
    //        nome = leia.nextLine();
    //        System.out.println("Nome: " + nome);
    
//        LENDO INTEIROS
//          int x;
//          System.out.print("Digite um número inteiro: ");
//          Scanner num1 = new Scanner(System.in);
//          
//          x = num1.nextInt();
//          System.out.println("Numero digitado: " + x);
          
//        LENDO CASAS DECIMAIS
          double y;
          System.out.print("Digite um número decimal: ");
          Scanner num2 = new Scanner(System.in);
          
          y = num2.nextDouble();
          System.out.printf("Número digitado: " + "%.2f%n", y);
          
          Locale.setDefault(Locale.US);
          System.out.printf("Valor: " + "%.2f%n", y);
    }
    
}
