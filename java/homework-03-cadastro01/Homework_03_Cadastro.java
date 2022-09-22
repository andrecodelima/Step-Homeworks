import java.util.Scanner;
public class Homework_03_Cadastro {

	public static void main(String[] args) {
		/*
		* Dever de casa:
		* cadastre um array de notas de alunos.
		* guarde cada aluno em uma linha do array:
		* 
		* cada aluno deverá ter 4 notas;
		* cadastre 4 alunos e, ao final do cadastro, exiba:
		* 
		* as notas dos alunos e a média das notas.
		*
		* --EXTRA- Diga se está aprovado ou reprovado sabendo: de 0 à 5 reprovado, de 5 à 7 recuperação
		* e de 7 pra cima está aprovado!
		* */
		
		System.out.println("CADASTRO DE ALUNOS - V 1.0");
		System.out.println("");

		Scanner leia = new Scanner(System.in);

		System.out.printf("Cadastre o primeiro Aluno: ");
		String aluno1 = leia.next();
		System.out.printf("Aluno: " + aluno1 + " " + "Cadastrado com sucesso");
		System.out.println("\n");

		
		System.out.printf("Cadastre o segundo Aluno: ");
		String aluno2 = leia.next();
		System.out.printf("Aluno: " + aluno2 + " " + "Cadastrado com sucesso");
		System.out.println("\n");

		System.out.printf("Cadastre o terceiro Aluno: ");
		String aluno3 = leia.next();
		System.out.printf("Aluno: " + aluno3 + " " + "Cadastrado com sucesso");
		System.out.println("\n");

		System.out.printf("Cadastre o quarto Aluno: ");
		String aluno4 = leia.next();
		System.out.printf("Aluno: " + aluno4 + " " + "Cadastrado com sucesso");
		System.out.println("\n");

		System.out.println(" ");

		double [][] boletim = {
				{9.5, 8.0, 5.2, 7.6},
				{3.0, 7.0, 6.9, 9.1},
				{4.1, 5.4, 6.3, 4.2},
				{6.6, 8.1, 9.5, 9.8}
		};
		
		
		System.out.println("|                                               | ");
		System.out.println("|=================== BOLETIM ===================| ");
		System.out.println("|                                               | ");

		System.out.println(" ");
		for(int i = 0; i<boletim.length; i++){
			for(int c = 0; c<boletim[i].length; c++){
				
//				int contador = 1;
//				contador ++;
				double media = ((boletim[i][0] + boletim[i][1] + boletim[i][2] + boletim[i][3])/4);

				switch (i) {
				case 0:
					media = ((boletim[i][0] + boletim[i][1] + boletim[i][2] + boletim[i][3])/4);
					System.out.println(aluno1);
					System.out.println(" ");
					System.out.println("Nota 1: " + boletim[i][0] + "\n"  + 
									    "Nota 2: " + boletim[i][1] + "\n" +
										"Nota 3: " + boletim[i][2] + "\n"  +
									    "Nota 4: " + boletim[i][3] + "\n"  +
										" " + "\n");
					
					System.out.printf("Média: " + "%.2f%n", media);
					
					if(media <= 5){
						System.out.println("Situação: Reprovado");
					}else if(media >5 && media <= 7) {
						System.out.println("Situação: Em Recuperação");
					}else {
						System.out.println("Situação: Aprovado");
					}
					
					System.out.println("================================================");
					break;
					
				case 1:
					media = ((boletim[i][0] + boletim[i][1] + boletim[i][2] + boletim[i][3])/4);
					System.out.println(aluno2);
					System.out.println(" ");
					System.out.println("Nota 1: " + boletim[i][0] + "\n"  + 
									    "Nota 2: " + boletim[i][1] + "\n" +
										"Nota 3: " + boletim[i][2] + "\n"  +
									    "Nota 4: " + boletim[i][3] + "\n"  +
										" " + "\n");
					
					System.out.printf("Média: " + "%.2f%n", media);
					
					if(media <= 5){
						System.out.println("Situação: Reprovado");
					}else if(media >5 && media <= 7) {
						System.out.println("Situação: Em Recuperação");
					}else {
						System.out.println("Situação: Aprovado");
					}
					
					System.out.println("================================================");
					break;
					
				case 2:
					media = ((boletim[i][0] + boletim[i][1] + boletim[i][2] + boletim[i][3])/4);
					System.out.println(aluno3);
					System.out.println(" ");
					System.out.println("Nota 1: " + boletim[i][0] + "\n"  + 
									    "Nota 2: " + boletim[i][1] + "\n" +
										"Nota 3: " + boletim[i][2] + "\n"  +
									    "Nota 4: " + boletim[i][3] + "\n"  +
										" " + "\n");
					
					System.out.printf("Média: " + "%.2f%n", media);
					
					if(media <= 5){
						System.out.println("Situação: Reprovado");
					}else if(media >5 && media <= 7) {
						System.out.println("Situação: Em Recuperação");
					}else {
						System.out.println("Situação: Aprovado");
					}
					
					System.out.println("================================================");
					break;
					
					
					
				case 3:
					media = ((boletim[i][0] + boletim[i][1] + boletim[i][2] + boletim[i][3])/4);
					System.out.println(aluno4);
					System.out.println(" ");
					System.out.println("Nota 1: " + boletim[i][0] + "\n"  + 
									    "Nota 2: " + boletim[i][1] + "\n" +
										"Nota 3: " + boletim[i][2] + "\n"  +
									    "Nota 4: " + boletim[i][3] + "\n"  +
										" " + "\n");
					
					System.out.printf("Média: " + "%.2f%n", media);
					
					if(media <= 5){
						System.out.println("Situação: Reprovado");
					}else if(media >5 && media <= 7) {
						System.out.println("Situação: Em Recuperação");
					}else {
						System.out.println("Situação: Aprovado");
					}
					
					System.out.println("================================================");
					break;
					
				}
				break;
				
				
			}
			
		}
	}

}
