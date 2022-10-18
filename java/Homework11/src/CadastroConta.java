import java.util.Scanner;

public class CadastroConta {
    static ContaPF [] contaPF = new ContaPF[10];
    static ContaPJ [] contaCNPJ = new ContaPJ[10];

    static int opcao;
    static int contadorPF=0, contadorPJ = 0;

    public void Cadastro(){

        // var contas
        String numero, agencia, nome, cpf, razaoSocial, cnpj;
        double saldo;

        Scanner lerInt = new Scanner(System.in);
        Scanner lerStr = new Scanner(System.in);
        Scanner lerDoub = new Scanner(System.in);

        while (contadorPF <=10 && contadorPJ <=10){
            System.out.println(" ");
            System.out.println("=== CADASTRO DE CONTAS ===");

            System.out.println(   "Cadastro de Pessoa Física:          Digite [1]"       + "\n" +
                                "Cadastro de Pessoa Jurídica:        Digite [2]"       + "\n" +
                                "Exibir cadastro de Pessoa Física:   Digite [3]"       + "\n" +
                                "Exibir cadastro de Pessoa Jurídica: Digite [4]"       + "\n" +
                                "Sair:                               Digite [5]        ");

            System.out.println("");
            System.out.print("Digite Aqui: ");

            opcao = lerInt.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("CADASTRO DE PESSOA FÍSICA");
                    System.out.println("");

                    System.out.print("Número: ");
                    numero = lerStr.next();

                    System.out.print("Agencia: ");
                    agencia = lerStr.next();

                    System.out.print("Saldo: ");
                    saldo = lerDoub.nextDouble();

                    System.out.print("Nome: ");
                    nome = lerStr.next();

                    System.out.print("CPF: ");
                    cpf = lerStr.next();

                    contaPF[contadorPF] = new ContaPF(numero, agencia, saldo, nome, cpf);
                    contadorPF += 1;
                    break;

                case 2:
                    System.out.println("CADASTRO DE PESSOA JURÍDICA");
                    System.out.println("");

                    System.out.print("Número: ");
                    numero = lerStr.next();

                    System.out.print("Agencia: ");
                    agencia = lerStr.next();

                    System.out.print("Saldo: ");
                    saldo = lerDoub.nextDouble();

                    System.out.print("Razao Social: ");
                    razaoSocial = lerStr.next();

                    System.out.print("CPF: ");
                    cnpj = lerStr.next();

                    contaCNPJ[contadorPJ] = new ContaPJ(numero, agencia, saldo, razaoSocial, cnpj);
                    contadorPF += 1;

                    break;

                case 3:
                    exibirPF();
                    break;

                case 4:
//                    exibirPJ();
                    break;

                case 5:
                    System.out.println("Encerrando Cadastro... Volte Sempre!");
                    break;

                default:
                    System.out.println("ERRO! Escolha uma opção entre 1 e 5!");

            }

            contadorPF += 1;
            contadorPJ += 1;
            System.out.println("Contador: " + contadorPF);

        }


    }

    public void exibirPF(){
            System.out.println( "Número: "  + contaPF[contadorPF].getNumero()     + "\n"
                    +           "Agência: " + contaPF[contadorPF].getAgencia()    + "\n"
                    +           "Saldo: "   + contaPF[contadorPF].getSaldo()      + "\n"
                    +           "Nome: "    + contaPF[contadorPF].getNome()       + "\n"
                    +           "CPF: "     + contaPF[contadorPF].getCpf());
        }


    public void exibirPJ(){
        System.out.println( "Número: "  + contaCNPJ[contadorPJ].getNumero()          + "\n"
                +           "Agência: " + contaCNPJ[contadorPJ].getAgencia()         + "\n"
                +           "Saldo: "   + contaCNPJ[contadorPJ].getSaldo()           + "\n"
                +           "Nome: "    + contaCNPJ[contadorPJ].getRazaoSocial()     + "\n"
                +           "CPF: "     + contaCNPJ[contadorPJ].getCnpj());
    }

}


