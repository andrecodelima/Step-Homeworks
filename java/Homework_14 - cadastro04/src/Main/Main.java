package Main;
import java.util.Scanner;
import Contas.ContaPessoaFisica;
import Contas.ContaPessoasJuridica;

public class Main {
    static Scanner read = new Scanner(System.in);

    static int opcao;

    static ContaPessoaFisica [] regPF = new ContaPessoaFisica [3];
    static ContaPessoasJuridica [] regPJ = new ContaPessoasJuridica[3];

    static ContaPessoasJuridica contaPJ = new ContaPessoasJuridica();
    static ContaPessoaFisica contaPF = new ContaPessoaFisica();

    static int qtdPF;
    static int qtdPJ;

    public static void main(String[] args) {menu();}

    public static void menu() {
            while (true) {
                System.out.println("\nBANCO SANTANDRÉ");
                System.out.println("\nSelecione o tipo de Conta");
                System.out.println("[1] - Pessoa Física || [2] - Pessoa Jurídica || [3] Sair");
                System.out.print("Digite Aqui: ");
                opcao = read.nextInt();

                switch (opcao) {
                    case 1:
                        PF();
                        break;

                    case 2:
                        PJ();
                        break;

                    case 3:
                        System.out.println("Obrigado pela preferência! Obrigado!");
                        System.exit(0);

                }

            }
        }

    public static void PF(){
        System.out.println("\nÁREA DE PESSOA FÍSICA");
        System.out.println("[1] - Cadastro || [2] - Consulta || [3] Depósito || [4] Saque [5] Sair");
        System.out.print("\nDigite Aqui: ");
        opcao = read.nextInt();

        switch (opcao){
            case 1:
                ContaPessoaFisica.cadastroPF(regPF, qtdPF++);
                break;

            case 2:
                consultaPF();
                break;

            case 3:
                System.out.print("Informe o valor do Depósito: ");
                double valorDep = read.nextDouble();
                contaPF.deposito(valorDep);
                break;

            case 4:
                System.out.print("Informe o valor do Saque: ");
                double valor = read.nextDouble();
                contaPF.saque(valor);
                break;

            case 5:
                System.out.println("Obrigado pela preferência! Obrigado!");
                System.exit(0);

        }


    }

    public static void PJ(){
        System.out.println("\nÁREA DE PESSOA JÚRIDICA");
        System.out.println("[1] - Cadastro || [2] - Consulta || [3] Depósito || [4] Saque [5] Sair");
        System.out.print("\nDigite Aqui: ");
        opcao = read.nextInt();

        switch (opcao){
            case 1:

                ContaPessoasJuridica.cadastroPJ(regPJ, qtdPJ++);
                break;

            case 2:
                consultaPJ();
                break;

            case 3:
                System.out.print("Informe o valor do Depósito: ");
                double valorDep = read.nextDouble();
                contaPJ.deposito(valorDep);
                break;

            case 4:
                System.out.print("Informe o valor do Saque: ");
                double valor = read.nextDouble();
                contaPJ.saque(valor);
                break;

            case 5:
                System.out.println("Obrigado pela preferência! Obrigado!");
                System.exit(0);
        }


    }

    public static void consultaPF(){
        System.out.println("\nCONSULTA PESSOA FÍSICA\n");
        if(regPF[0] == null){
            System.out.println("Nenhum registro encontrado!");
        }else{
            for(int c = 0; c < regPF.length; c++){
                if(regPF[c] == null){break;}

                else{
                    System.out.println("\n===================================================");
                    System.out.println("Nome:     " + regPF[c].getDadosPessoais().getNome());
                    System.out.println("CPF:      " + regPF[c].getDadosPessoais().getCpf());
                    System.out.println("Gênero    " + regPF[c].getDadosPessoais().getGenero());
                    System.out.println("Agência:  " + regPF[c].getAgencia());
                    System.out.println("Conta:    " + regPF[c].getConta());
                    System.out.println("Saldo:    " + regPF[c].getSaldo());
                    System.out.println("====================================================\n");

                }

            }
        }

    }

    public static void consultaPJ() {
        System.out.println("\nCONSULTA PESSOA FÍSICA\n");
        if (regPJ[0] == null) {
            System.out.println("Nenhum registro encontrado!");
        } else {
            for (int c = 0; c < regPJ.length; c++) {
                if (regPJ[c] == null) {
                    break;
                } else {
                    System.out.println("\n===================================================");
                    System.out.println("Razão Social: "   + regPJ[c].getDadosEmpresa().getRazaoSocial());
                    System.out.println("Nome Fantasia: "  + regPJ[c].getDadosEmpresa().getNomeFantasia());
                    System.out.println("CNPJ    "         + regPJ[c].getDadosEmpresa().getCnpj());
                    System.out.println("Agência:  "       + regPJ[c].getAgencia());
                    System.out.println("Conta:    "       + regPJ[c].getConta());
                    System.out.println("Saldo:    "       + regPJ[c].getSaldo());
                    System.out.println("====================================================\n");

                }

            }
        }

    }
}




