import java.util.Scanner;
public class Main {
    static Aluno [] RegAluno = new Aluno[3];
    static Professor [] RegProfessor = new Professor[3];

    static int qtdAluno = 0;
    static int qtdProf = 0;

    static Scanner read = new Scanner(System.in);
    static int opcao;

    public static void main(String[] args) {


        while (true){

            System.out.println("Menu");

            System.out.println("+++++++++++++++++++++++");
            System.out.println("Cadastrar           [1]");
            System.out.println("Consultar           [2]");
            System.out.println("Sair                [3]");

            System.out.print("\nDigite Aqui: ");
            opcao = read.nextInt();

            switch (opcao){
                case 1:
                   cadastro();
                   break;

                case 2:
//                    consulta();
                    break;

                case 3:
                    System.exit(0);
                    System.out.println("Agradecemos por usar o sistema, volte sempre!");
                    break;

                default:
                    System.out.println("Escolha uma opção correta!");
            }

        }

        }

        public static void cadastro(){

            System.out.println("\nCadastro");

            System.out.println("+++++++++++++++++++++++");
            System.out.println("Cadastrar Aluno     [1]");
            System.out.println("Cadastrar Professor [2]");
            System.out.println("Sair                [3]");

            System.out.print("\nDigite Aqui: ");


            opcao = read.nextInt();

            switch (opcao){
                case 1:
                    Aluno.CadastAluno(RegAluno, qtdAluno);
                    break;

                case 2:
                    Professor.CadastProfessor(RegProfessor, qtdProf);
                    break;


            }


        }

}
