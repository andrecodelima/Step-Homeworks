package aula03;

public class Aula03 {

    public static void main(String[] args) {
        int [][] numeros = 
        {
            {1,4,8,9},
            {3,2,1,7},
            {6,5,3,8},
            {2,9,4,5}
        };
        
        /*
        1- imprima os números pares que estiverem dentro do array;
        2- imprima os números ímpares do array;
        3- imprima os números primos existentes entre 0 e 100; 2 diamantes
        4- imprima os números ímpares entre 0 e 100
        
        --- número primo tem dois divisores naturais sendo 1 e ele mesmo ---
        */
        
       
        System.out.println("1- imprima os números pares que estiverem dentro do array;");
        for(int i = 0; i< numeros.length ; i ++)
            for(int j = 0 ; j <numeros[i].length ; j++)
                if(numeros[i][j]%2 == 0)
                    System.out.println(numeros[i][j]);
       
        System.out.println("2- imprima os números ímpares que estiverem dentro do array;");
        for(int i = 0; i< numeros.length ; i ++)
            for(int j = 0 ; j <numeros[i].length ; j++)
                if(numeros[i][j]%2 != 0)
                    System.out.println(numeros[i][j]);
                
        
        System.out.println("4- imprima os números ímpares entre 0 e 100");
        for(int i = 0; i <= 100 ; i++)
            if(i%2 != 0)
                System.out.println( i);
        
        
        System.out.println("3- imprima os números primos existentes entre 0 e 100; 2 diamantes");
        
        for(int i=2 ; i <= 100; i++){//percorrer de 0 a 100
            int divisores = 0;//vou contar os divisores
            for(int j=2 ; j<i ; j++){//percorrer de 2 até o anterior ao atual
                if(i%j == 0){//se o resto da divisão entre o atual e um predecessor for igual a 0
                    divisores++; // se é divisor ele incrementa em divisores
                    break;//se tem divisor não precisa mais procurar
                }
            }
            if(divisores == 0)//se não tiver divisores o número é primo;
                System.out.println(i);
        }
        
        //encontre os multiplos de 7 entre 0 e 200;
        
        System.out.println("Multiplos de 7----------");
        
        for(int i=0; i<100; i++){
        
            int valor = 7 * i;
            
            if(valor >= 200){
                break;
            }
            
            System.out.println(valor);
        }
        
        
        /*
        Dever de casa
        
        Imprima os valores que sejam multiplos de 3 e 6, ao mesmo tempo, entre 0 e 100;
        Imprima os valores que seja divisiveis por 4 e 5, ao mesmo tempo, entre 200 e 300;
        receba um número do usuário e informe os seus 100 primeiros múltiplos;
        */
    }   
    
}
