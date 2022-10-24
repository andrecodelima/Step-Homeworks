import java.util.Scanner;

public class Main {
    static ContaPJ [] contasPj = new ContaPJ[10];
    static ContaPF [] contasPf = new ContaPF[10];

    static ContaPFkids [] contaPFkids = new ContaPFkids[10];
    static int qtdCPf = 0;
    static int qtdCPj = 0;

    static int QtdCPfKids = 0;

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        while (0==0){
            System.out.println("\n\n######## Sistema Bancário ##########");
            System.out.println("====================================");
            System.out.println("(0)||SAIR||");
            System.out.println("(1) Cadastros");
            System.out.println("(2) Consultas");
            System.out.print("Escolha uma opção: ");
            int opcao = read.nextInt();

            switch (opcao){
                case 1:
                    menuCadastro();
                    break;
                case 2:
                    menuConsulta();
                    break;
                default:
                    System.out.println("\n\nErrou, tenta outra vez!!!\n\n");
            }
        }
    }
    public static void menuCadastro(){
        System.out.println("\n\n######## CADASTROS ##########");
        System.out.println("====================================");
        System.out.println("(1) Conta PF");
        System.out.println("(2) Conta PJ");
        System.out.println("(3) Conta PFKids");
        System.out.print("Escolha uma opção: ");
        int opcao = read.nextInt();

        switch (opcao){
            case 1:
                ContaPF.cadastraPF(contasPf,qtdCPf);
                break;

            case 2:
                ContaPJ.cadastraPJ(contasPj,qtdCPj);
                break;

            case 3:
                ContaPFkids.cadastraPFKids(contaPFkids, QtdCPfKids);
                break;

            default:
                System.out.println("\n\nErrou! Tente Novamente!!\n\n");
        }
    }

    public static void menuConsulta(){
        System.out.println("\n\n######## CONSULTAS ##########");
        System.out.println("====================================");
        System.out.println("(1) Conta PF");
        System.out.println("(2) Conta PJ");
        System.out.println("(3) Conta PFKids");
        System.out.print("Escolha uma opção: ");
        int opcao = read.nextInt();

        switch (opcao){
            case 1:
                consultaPF();
                break;

            case 2:
                consultaPJ();
                break;

            case 3:
                consultaPFKids();
                break;

            default:
                System.out.println("\n\nErrou! Tente Novamente!!\n\n");
        }
    }

    public static void consultaPJ(){

        System.out.println("\n\n==============Relatório de Contas PJ==============");
        if(contasPj[0] == null){
            System.out.println("\n ## Não há contas Cadastradas! ##\n\n");
        }else{
            for(int i = 0; i< contasPj.length; i++){
                if(contasPj[i] == null) break;
                System.out.println("Agência: " + contasPj[i].getAgencia());
                System.out.println("Conta: " + contasPj[i].getNumero());
                System.out.println("Razão Social: " + contasPj[i].getRazaoSocial());
                System.out.println("CNPJ: " + contasPj[i].getCnpj());
                System.out.println("Saldo Atual: " + contasPj[i].getSaldo());
                System.out.println("---------------------------------------------\n");
            }
        }
    }

    public static void consultaPF(){

        System.out.println("\n\n==============Relatório de Contas PF==============");
        if(contasPf[0] == null){
            System.out.println("\n ## Não há contas Cadastradas! ##\n\n");
        }else{
            for(int i = 0; i< contasPf.length; i++){
                if(contasPf[i] == null) break;
                System.out.println("Agência: " + contasPf[i].getAgencia());
                System.out.println("Conta: " + contasPf[i].getNumero());
                System.out.println("Nome: " + contasPf[i].getNome());
                System.out.println("CPF: " + contasPf[i].getCpf());
                System.out.println("Saldo Atual: " + contasPf[i].getSaldo());
                System.out.println("---------------------------------------------\n");
            }
        }
    }

    public static void consultaPFKids(){

        System.out.println("\n\n==============Relatório de Contas PFKids==============");
        if(contaPFkids[0] == null){
            System.out.println("\n ## Não há contas Cadastradas! ##\n\n");
        }else{
            for(int i = 0; i< contaPFkids.length; i++){
                if(contaPFkids[i] == null) break;
                System.out.println("Nome Titular: " + contaPFkids[i].getNomeTit());
                System.out.println("CPF Titular: " + contaPFkids[i].getCpfTit());
                System.out.println("Agência: " + contaPFkids[i].getAgencia());
                System.out.println("Conta: " + contaPFkids[i].getNumero());
                System.out.println("Nome do Responsável: " + contaPFkids[i].getNomeResp());
                System.out.println("CPF do Responsável: " + contaPFkids[i].getCpfResp());
                System.out.println("Saldo Atual: " + contaPFkids[i].getSaldo());
                System.out.println("---------------------------------------------\n");
            }
        }
    }
}

/*

DEVER DE CASA

No menu de opção de exibir os cadastros. O usuário pode escolher exibir todas as contas de PF ou PJ.

Lembrando da técnica de encapsulamento, crie métodos estáticos no Main para fazer cada funcionalidade,
deixando o PSVM o mais curto possível.
 */