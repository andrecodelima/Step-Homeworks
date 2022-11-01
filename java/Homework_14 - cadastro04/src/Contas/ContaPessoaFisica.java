package Contas;
import java.util.Scanner;
import Pessoas.PessoaFisica;

public class ContaPessoaFisica extends Conta{
    private PessoaFisica dadosPessoais;
    public ContaPessoaFisica() {
    }


    public ContaPessoaFisica(String agencia, String conta, double saldo, String nome, String cpf, String genero) {
        super(agencia, conta, saldo);
        this.dadosPessoais = new PessoaFisica(nome, cpf, genero);

    }

    public PessoaFisica getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(PessoaFisica dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    @Override
    public void saque(double valor) {
        if(valor <= super.getSaldo()){
            System.out.println("\nSaque efetuado com sucesso\n");
            super.setSaldo(super.getSaldo()-valor);
            System.out.println("Saldo atualizado: " + getSaldo());

        }else{
            System.err.println("Saldo insuficiente!");
        }
    }
    double valor2 = super.getSaldo();


    public static void cadastroPF(ContaPessoaFisica [] arrayPF, int qtd){
        Scanner read = new Scanner(System.in);

        System.out.print("Agência: ");
        String agencia = read.next();

        System.out.print("Conta: ");
        String conta = read.next();

        System.out.print("Saldo: ");
        double saldo = read.nextDouble();
        
        System.out.print("Nome: ");
        String nome = read.next();

        System.out.print("CPF: ");
        String cpf = read.next();

        System.out.print("Gênero: ");
        String genero = read.next();

        System.out.println("\nDados cadastrados com sucesso!\n");

        arrayPF[qtd] = new ContaPessoaFisica(agencia, conta, saldo, nome, cpf, genero);


    }


}


