 
package aula02;
 
public class Aula02 {
 
    public static void main(String[] args) {
        
        int x;
        double y;
        
        x = 5;
        y = x * 2;
        
        System.out.println("Res de Y: " + y);
        
        // Ex1 - Cálcular área de um trapézio
        
         double b, B, h, area;
         
         b = 6.0;
         B = 8.0;
         h = 5.0;
         
         area = ((b + B)/2)*h;
         
         System.out.println("Área do trapézio: " + area);
    }
    
}
