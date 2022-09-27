
import java.util.Scanner;
public class homework_04 {

	public static void main(String[] args) {
		//------------------DEVER DE CASA----------------
		
		/*
		Crie uma programa que te dê duas opções:
		a) imprimir um array de 10x10 com valores aleatórios entre 1 e 30;
		b) receber dois valores inteiros e exibir a soma, multiplicação e potência(2 e 3 == 2³) entre os dois.

		NÃO ESQUEÇA DE CRIAR E USAR OS MÉTODOS (com ou sem retorno) PARA CADA TAREFA.
				 
		*/
		
		programa();
		
	}
	
	public static void programa(){
		int opcao;
		Scanner read = new Scanner(System.in);
		System.out.println("HOMEWOR-04");
		System.out.println("==========");
		System.out.println("IMPRESSÃO DE VALORES");
		System.out.println("");
		
		System.out.print(
						   
				           "PARA IMPRIMIR UM ARRAY COM 30 VALORES ALEATÓRIOS             DIGITE [1]" +  "\n" + 
						   "PARA SABER A SOMA ENTRE DOIS NÚMEROS						 DIGITE [2]" +  "\n" + 
						   "PARA SABER A MULTIPLICAÇÃO ENTRE DOIS NÚMEROS				 DIGITE [3]" +  "\n" +
						   "PARA SABER A POTÊNCIA ENTRE DOIS NÚMEROS				     DIGITE [4]" +  "\n" +
						   																				"\n" +
						   "DIGITE AQUI: "
				
						  );
		
		//TENTAR USAR WHILE
		opcao = read.nextInt();
		System.out.println("Opção: " + opcao);
		
		
				
			switch (opcao){
			case 1:
				System.out.println(" ARRAY DE 10 x 1O ");
				System.out.println(arrayInt());
				
				break;
			
			case 2:
				System.out.println(" SOMA de dois números: " + soma(0, 0));
				break;
			
			case 3:
				System.out.println(" PRODUTO de dois números: " + multiplicacao(0, 0));
				break;
				
			case 4:
				System.out.println(" POTENCIA de dois números: " + potencia());
				break;
				
			default:
				System.out.println(" Número inválido, digite um número entre 1 e 4");
				
		}
			
	}
		
		
		
		
	
	
	private static int[][] arrayInt(){
	    //int cont = 1;
		
		int [][] array = new int[10][10];
		for(int i=0; i<array.length; i++) {
			for(int c=0; c<array[i].length; c++) {
				array[i][c] = (int) Math.floor(Math.random()*31);
				System.out.print(array[i][c] + " ");
			}
			
			System.out.println("|");

		}
		
		return array; 
	}
	
	private static int soma(int a, int b){
		Scanner read = new Scanner(System.in);
		int x; 
		int y;
		
		System.out.println("Digite um número inteiro: ");
		x = read.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		y = read.nextInt();
			
		return x + y;
	}
	
	private static int multiplicacao(int a, int b) {
		Scanner read = new Scanner(System.in);
		int x;
		int y;
		
		System.out.println("Digite um número inteiro: ");
		x = read.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		y = read.nextInt();
		
		return x * y;
		
	}
	
	private static double potencia(){
		Scanner read = new Scanner(System.in);
		double x;
		double y;
		
		System.out.println("Digite um número inteiro: ");
		x = read.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		y = read.nextInt();
		
		return (int) Math.pow(x, y);
		
	}
	
	
	
	
	
	
	
	
	
	

}
