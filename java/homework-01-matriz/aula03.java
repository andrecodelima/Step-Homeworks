
package homework02.matriz;


public class Homework02Matriz {


    public static void main(String[] args) {
        
        /*
        
        DEVER DE CASA
        -------------
        
        Crie um array de 4x4 com nomes
        
        imprima os nomes do array separados, um em cada linha.
        
        DESAFIO--------------------------
        Imprima os nomes do array oraganizados por linhas como as do próprio array.
        ex:
        
        Juca    Zeca    Ana     Paulo
        Tião    Bela    Vivi    Mara
        Mari    Joca    Tonho   Vito
        Gabi    Peu     Tuco    Bia
        
        
        */
                
      
        String [] [] matriz =  {
                                    
                                  {"Ana",  "André", "Amanda", "Agata"},
                                  {"Nei", "Noemi", "Nelson", "Nilce"},
                                  {"Dil",  "Nildo", "Dulcir", "Dulce"},
                                  {"Rui",  "Ronan", "Robson", "Rildo"}
        
                                };

        System.out.println(" ");
        System.out.println("===================== MATRIZES ===================");
        System.out.println(" ");
        for(int i=0; i<matriz.length; i++){
            for(int c=0; c<matriz[i].length; c++){
                System.out.print(+ (i+1) + " | " + (matriz[i][c]) + " " + " | ");
            };
            
            System.out.println("");
        };
        System.out.println(" ");
        System.out.println("==================================================");
        System.out.println(" ");
        
    }
    
}
