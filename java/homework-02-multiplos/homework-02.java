
import java.util.Scanner;
public class Ex005 {

	public static void main(String[] args) {
		/*
        Dever de casa
        
        Imprima os valores que sejam multiplos de 3 e 6, ao mesmo tempo, entre 0 e 100;
        Imprima os valores que seja divisiveis por 4 e 5, ao mesmo tempo, entre 200 e 300;
        receba um número do usuário e informe os seus 100 primeiros múltiplos;
        */
		
		// 1 -  Imprima os valores que sejam multiplos de 3 e 6, ao mesmo tempo, entre 0 e 100;
		
		
		for(int c = 0; c <= 100; c++){
			if(c % 3 == 0){
				System.out.print(" " + c);
			}else if(c % 6 == 0) {
				System.out.print(" " + c);
			}
		}
		
		
		// 2 -  Imprima os valores que seja divisiveis por 4 e 5, ao mesmo tempo, entre 200 e 300;
		
		/*
		for(int i = 200; i <= 300; i++){
			if(i % 4 == 0){
				System.out.print(" " + i);
			}else if(i % 5 == 0){
				System.out.print(" " + i);
			}
			
		}
		*/
		
		// 3 - Receba um número do usuário e informe os seus 100 primeiros múltiplos;
		
		// System.out.print("Digite um número inteiro: ");
		
		// Scanner leia = new Scanner(System.in);
		// int numero = leia.nextInt();
		
		// for(int i = 0; i <= 100; i++){
		// 	if(i % numero == 0){
		// 		System.out.print(" " + i);
		// 	}
			
		// }
		
		
		
		
	}

}
