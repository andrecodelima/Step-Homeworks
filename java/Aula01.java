 
package aula01;

import java.util.Scanner;


public class Aula01 {

   
    public static void main(String[] args) {
        System.out.println("Hello World");
        //Saida do Sistema (System out)
       //String é com "" aspas duplas.

        
        int inteiro = 123456; // Até 23 casas (Já ocupa 23 bytes na memória independente do que voce vai usar)
        //Mais usado
        
        long numeroGrande = 123456; // Até 48 casas  (já vai reservar na memória 48 bytes
        float casasDecimais = (float) 25.8; // Guarda até 23 casas depois da virgula
        double dobroPrecisao =  25.8; // Guarda até 48 casas depois da virgula
        // Mais usado. O CPU calculo os valores como double porque espera sempre uma quantidade maior
        // Se voce usa float o CPU faz mais conversões. Usando o double o CPU já entrega o
        // resultado direto sem fazer conversões. (Mais rápido)
        
        boolean boleano = true;
        char letra = 'a'; // Aspas simples - caracter
        
        //String é com "" aspas duplas.
        
        // Tipos criados
        String texto = "André";
       // O tipo da variável é definida na declaração.
       
       double num1 = 23;
       double num2 = 15;
       
       double total;
       
       
       total = num1 + num2; 
              
       System.out.println(total);
          
       total = num1 - num2;
       System.out.println(total);
       
       
       total = num1 * num2;
       System.out.println(total);
       
       
       total = num1 / num2;
       System.out.println(total);
       
       
       String nome = "André";
       String sobrenome = "Lima";
       String nomecompleto = nome + " " + sobrenome;
       
        System.out.println(nomecompleto);
        System.out.println(nomecompleto.length());
        System.out.println(nomecompleto.indexOf("a"));
        
        
        // Recebendo dados por console
        
        Scanner leia =  new Scanner(System.in);
        System.out.print("Digite o nome: ");
        nome = leia.nextLine(); // Precisa saber o que está lendo.
        //System. in = Está entrando dados no sistem.
        // Mas precisa saber depois o que está sendor recebido
        
        System.out.println("Nome: " + nome);
        
         
    }
    
}


