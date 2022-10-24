import java.util.Scanner;

public class ContaPF extends Conta{
    private String nome, cpf;

    public ContaPF() {}

    public ContaPF(String numero, String agencia, double saldo, String nome, String cpf) {
        super(numero, agencia, saldo);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static void cadastraPF(ContaPF [] array, int qtd){
        Scanner read = new Scanner(System.in);
        read.nextLine();

        System.out.print("Qual o número da Conta? ");
        String numeroPf = read.nextLine();

        System.out.print("Qual número da Agência? ");
        String agenciaPf = read.nextLine();

        System.out.print("Qual depósito inicial? ");
        double saldoPf = read.nextDouble();

        read.nextLine();
        System.out.print("Qual o nome? ");
        String nome = read.nextLine();

        System.out.print("Qual o CPF? ");
        String cpf = read.nextLine();

        array[qtd] = new ContaPF(numeroPf,agenciaPf,saldoPf,nome,cpf);
        qtd++;
    }
}
