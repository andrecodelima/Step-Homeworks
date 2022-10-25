import java.util.Scanner;
public class Professor extends Pessoa{
    String cpf;

    public Professor(String nome, String genero, String telefone, int idade, String cpf) {
        super(nome, genero, telefone, idade);
        this.cpf = cpf;
    }

    public Professor(String cpf) {
        this.cpf = cpf;
    }

    public Professor(){}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static void CadastProfessor(Professor [] arrayProf, int qtd){
        Scanner read = new Scanner(System.in);

        System.out.println("Cadastro de Professor " + "|"+ qtd + "|");

        System.out.print("Nome: ");
        String nome = read.nextLine();

        System.out.print("Gênero: ");
        String genero = read.next();

        System.out.print("Telefone: ");
        String tel = read.next();

        System.out.print("Idade: ");
        int idade = read.nextInt();

        System.out.print("CPF: ");
        String cpf = read.nextLine();

        arrayProf [qtd]= new Professor(nome, genero, tel, idade, cpf);
        qtd ++;
    }

}
