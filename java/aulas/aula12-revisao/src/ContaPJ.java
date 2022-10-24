import java.util.Scanner;

public class ContaPJ extends Conta{
    private String razaoSocial, cnpj;

    public ContaPJ() {}

    public ContaPJ(String numero, String agencia, double saldo, String razaoSocial, String cnpj) {
        super(numero, agencia, saldo);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public static void cadastraPJ(ContaPJ [] array, int qtd){
        Scanner read = new Scanner(System.in);
        System.out.print("Qual o número da Conta? ");
        String numero = read.nextLine();

        System.out.print("Qual número da Agência? ");
        String agencia = read.nextLine();

        System.out.print("Qual depósito inicial? ");
        double saldo = read.nextDouble();

        read.nextLine();
        System.out.print("Qual a Razão Social? ");
        String razaoSocial = read.nextLine();

        System.out.print("Qual o CNPJ? ");
        String cnpj = read.nextLine();

        array[qtd] = new ContaPJ(numero,agencia,saldo,razaoSocial,cnpj);
        qtd++;
    }
}
