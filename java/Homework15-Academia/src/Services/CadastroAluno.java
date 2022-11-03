package Services;

import java.util.Scanner;
import PessoaTipo.Aluno;

public class CadastroAluno {
    public CadastroAluno() {
    }

    public static void cadastroAluno(Aluno [] array, int qtd){
        Scanner read = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = read.nextLine();

        System.out.print("Idade: ");
        int idade = read.nextInt();

        System.out.print("Peso: ");
        double peso = read.nextDouble();

        System.out.print("Altura: ");
        double altura = read.nextDouble();

        System.out.print("Turma: ");
        System.out.println("Musculação [1] * Crossfit [2] * Luta [3]");
        System.out.print("Digite Aqui: ");
        String turma = read.next();

        System.out.println("\nCadastro realizado com sucesso!");

        array[qtd] = new Aluno(nome, idade, peso, altura, turma);
    }


}
