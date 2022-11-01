package Contas;
import Pessoas.PessoaJuridica;
import java.util.Scanner;

public class ContaPessoasJuridica extends Conta{
    private PessoaJuridica dadosEmpresa;
    public ContaPessoasJuridica(){}

    private double limiteDeCredito;


    public ContaPessoasJuridica(String agencia, String conta, double saldo, String razaoSocial, String nomeFantasia, String cnpj) {
        super(agencia, conta, saldo);
        this.dadosEmpresa = new PessoaJuridica(razaoSocial, nomeFantasia, cnpj);
        //Voce instancia a propriedade dadosEmpresa com a Classe Pessoa Juridica.

        this.limiteDeCredito = 1000;

    }

    public PessoaJuridica getDadosEmpresa() {
        return dadosEmpresa;
    }

    public void setDadosEmpresa(PessoaJuridica dadosEmpresa) {
        this.dadosEmpresa = dadosEmpresa;
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    @Override
    public void saque(double valor) {
       if(super.getSaldo() + this.limiteDeCredito >= valor){
            System.out.println("\n\nSaque efetuado com sucesso!\n\n");
            super.setSaldo(super.getSaldo()-valor);
        }else{
            System.err.println("Saldo insuficiente para realizar o saque!");
        }
    }

    public static void cadastroPJ(ContaPessoasJuridica [] arrayPJ, int qtd){
        Scanner read = new Scanner(System.in);

        System.out.println("CADASTRO PESSOA JURÍDICA");

        System.out.print("Agência: ");
        String agencia = read.next();

        System.out.print("Conta: ");
        String conta = read.next();

        System.out.print("Saldo: ");
        double saldo = read.nextDouble();

        System.out.print("Razão Social: ");
        String razaoSocial = read.next();

        System.out.print("Nome Fantasia: ");
        String nomeFantasia = read.next();

        System.out.print("CNPJ: ");
        String cnpj = read.next();

        System.out.println("\nDados cadastrados com sucesso!\n");

        arrayPJ[qtd] = new ContaPessoasJuridica(agencia,conta, saldo, razaoSocial,nomeFantasia,cnpj);

    }
}
