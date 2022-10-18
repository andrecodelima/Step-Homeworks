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
            System.out.print("Para cadastro de Pessoa Física - Digite [1]" + "\n"
                    +"Para cadastro de Pessoa Jurídica: Digite [2]" + "\n" +
                    "Digite Aqui: ");
            System.out.print(" ");

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

//                    System.out.println(contaPF[contadorPF].getNome());
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

                default:
                    System.out.println("ERRO");

            }contadorPF += 1;
            contadorPJ += 1;
            System.out.println("Contador: " + contadorPF);

        }

    }

}


