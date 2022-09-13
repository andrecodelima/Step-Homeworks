
package aula01revisao;

import java.util.Locale;


public class Aula01Revisao {

    public static void main(String[] args) {
        System.out.println("hello world!");
        
        double n1 = 34;
        double n2 = 23;
        
        double total = n1 + n2;
        
        System.out.println("O total da soma de n1 com n2 é: " + total);
        //Operações Ariméticas - P1
        
             //Subtração
        total = n1 - n2;
        System.out.println("n1 - n2 = " + total);
        
            //Multiplicação
        total = n1 * n2;
        System.out.println("n1 x n2 = " + total);
        
            //Divisão
        total = n1/n2;
        System.out.println("n1 / n2 = " + total);
        
        // Limitando o número de casas
        System.out.printf("n1 / n2 = " + "%.2f%n", total);
        
        //Mod (resto da divisão
        total = n1 % 3;
        System.out.println("Resto da divisão de " + n1 + " com 2: " + total);
        
        
        //EXERCÍCIO DE FIXAÇÃO
        String product1 = "Computer";
        String product2 = "Office Desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        System.out.println("Products:");
        System.out.println(product1 + "," + " wich price is $ " + price1);
        System.out.println(product2 + "," + " wich price is $ " + price2);
        
        System.out.println("");
        System.out.println("Record: " + age + " years old, code " + code + "and gender: " + gender);
        
        System.out.println("");
        System.out.println(measure + " wich eight decimal places: " + measure);
        System.out.printf("Rouded (three decimal places):" + "%.3f%n" , measure);
        
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: " + "%.3f%n", measure);
        
        
        //Entrada de Dados
    }
    
}
