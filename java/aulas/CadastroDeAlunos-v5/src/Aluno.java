
import java.util.Scanner;
public class Aluno extends Pessoa {

   private String turma, turno;

    public Aluno(String nome, String genero, String telefone, int idade, String turma, String turno) {
        super(nome, genero, telefone, idade);
        this.turma = turma;
        this.turno = turno;
    }

    public Aluno(String turma, String turno) {
        this.turma = turma;
        this.turno = turno;
    }

    public Aluno(){}


    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public static void CadastAluno(Aluno [] arrayAluno, int qtd){
        Scanner read = new Scanner(System.in);
        System.out.println("Cadastro de Aluno " + "|"+ qtd + "|");

        System.out.print("Nome: ");
        String nome = read.nextLine();

        System.out.print("Genero: ");
        String genero = read.next();

        System.out.print("Idade: ");
        int idade = read.nextInt();

        System.out.print("Telefone: ");
        String tel = read.next();

        System.out.print("Turma: ");
        String turma = read.next();

        System.out.print("Turno: ");
        String turno = read.next();


        System.out.println("\n"+"Dados registrados com sucesso!");

        arrayAluno[qtd] = new Aluno(nome, genero, tel, idade, turma, turno);
        qtd++;
    }



}
