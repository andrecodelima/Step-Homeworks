import java.util.Scanner;

public class ContaPFkids extends Conta{
    private String nomeResp, cpfResp, nomeTit, CpfTit;

    public ContaPFkids(String nomeResp, String cpfResp) {
        this.nomeResp = nomeResp;
        this.cpfResp = cpfResp;
    }

    public ContaPFkids(String numero, String agencia, double saldo, String nomeResp, String cpfResp, String nomeTit, String cpfTit) {
        super(numero, agencia, saldo);
        this.nomeResp = nomeResp;
        this.cpfResp = cpfResp;
        this.nomeTit = nomeTit;
        CpfTit = cpfTit;
    }

    public String getNomeTit() {
        return nomeTit;
    }

    public void setNomeTit(String nomeTit) {
        this.nomeTit = nomeTit;
    }

    public String getCpfTit() {
        return CpfTit;
    }

    public void setCpfTit(String cpfTit) {
        CpfTit = cpfTit;
    }


    public String getNomeResp() {
        return nomeResp;
    }

    public void setNomeResp(String nomeResp) {
        this.nomeResp = nomeResp;
    }

    public String getCpfResp() {
        return cpfResp;
    }

    public void setCpfResp(String cpfResp) {
        this.cpfResp = cpfResp;
    }


    public static void cadastraPFKids(ContaPFkids [] array, int qtd){
        Scanner read = new Scanner(System.in);
        System.out.print("Qual o número da Conta? ");
        String numero = read.nextLine();

        System.out.print("Qual número da Agência? ");
        String agencia = read.nextLine();

        System.out.print("Qual depósito inicial? ");
        double saldo = read.nextDouble();

        read.nextLine();
        System.out.print("Qual a Nome do Titular? ");
        String nomeTit = read.nextLine();

        System.out.print("Qual o CPF? ");
        String cpf = read.nextLine();

        System.out.print("Qual a Nome do Responsável? ");
        String nomeResp = read.nextLine();

        System.out.print("Qual o CPF? ");
        String cpfResp = read.nextLine();


        array[qtd] = new ContaPFkids(numero,agencia,saldo,nomeTit,cpf, nomeResp, cpfResp);
        qtd++;
    }
}
