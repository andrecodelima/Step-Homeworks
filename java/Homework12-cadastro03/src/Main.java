import java.util.Scanner;

public class Main {
    static Aluno[] RegistrarAluno = new Aluno[5];
    static Professor[] RegistrarProfessor = new Professor[5];
    static int qtdAluno = 0;
    static int qtdProf = 0;

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }



    public static void menu() {
        while (true) {
            System.out.println("");
            System.out.println("HOMEWORK - 12 *** Cadastro e Consultas ***");
            System.out.println("===================");
            System.out.println("[1] || Cadastro");
            System.out.println("[2] || Consulta");
            System.out.println("[3] || Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    cadastro();
                    break;

                case 2:
                    consulta();
                    break;

                case 3:
                    System.out.println("Obrigado por utilizar o programa, Até mais!");
                    System.exit(0);

                default:
                    System.out.println("Número inválido, escolha a opção correta!");
                    break;
            }
        }
    }

    public static void cadastro() {
            System.out.println("");
            System.out.println("Cadastro de Alunos e Professores");
            System.out.println("===================");
            System.out.println("[1] || Cadastro de Alunos");
            System.out.println("[2] || Cadastro de Professores");
            System.out.print("Escolha uma opção: ");
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    Aluno.cadastroAluno(RegistrarAluno, qtdAluno);
                    break;

                case 2:
                    Professor.cadastroProfessor(RegistrarProfessor, qtdProf);
                    break;

                default:
                    System.out.println("Número inválido, escolha a opção correta!");
                    break;
            }
        }


    public static void consulta() {

            System.out.println("");
            System.out.println("Cadastro de Alunos e Professores");
            System.out.println("===================");
            System.out.println("[1] || Consulta de Alunos");
            System.out.println("[2] || Consulta de Professores");
            System.out.print("Escolha uma opção: ");
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    consultaAluno();
                    break;

                case 2:
                    consultaProfessor();
                    break;

                default:
                    System.out.println("Número inválido, escolha a opção correta!");
                    break;
            }
        }


    public static void consultaAluno() {
        System.out.println("Consulta de Alunos");

        if(RegistrarAluno[0] == null){
            System.out.println(" ");
            System.out.println("Nenhum cadastro realizado!");
        }else{
            for (int c = 0; c < RegistrarAluno.length; c++) {
                if(RegistrarAluno[c] == null) break;
                System.out.println("..............................................");

                System.out.println("Nome: "     + RegistrarAluno[c].getNome());
                System.out.println("Gênero: "   + RegistrarAluno[c].getGenero());
                System.out.println("Idade: "    + RegistrarAluno[c].getIdade());
                System.out.println("Telefone: " + RegistrarAluno[c].getTelefone());
                System.out.println("Endereço: " + RegistrarAluno[c].getEndereco());
                System.out.println("Turma: "    + RegistrarAluno[c].getTurma());
                System.out.println("Turno: "    + RegistrarAluno[c].getTurno());
                System.out.println("Pai: "      + RegistrarAluno[c].getNomePai());
                System.out.println("Mãe: "      + RegistrarAluno[c].getNomeMae());

                System.out.println("..............................................");
            }
        }


    }

    public static void consultaProfessor() {
        System.out.println("Consulta de Alunos");

        if(RegistrarProfessor[0] == null){
            System.out.println(" ");
            System.out.println("Nenhum cadastro realizado!");
        }else{
            for (int c = 0; c < RegistrarProfessor.length; c++) {

                System.out.println("..............................................");

                System.out.println("Nome: "     + RegistrarProfessor[c].getNome());
                System.out.println("Gênero: "   + RegistrarProfessor[c].getGenero());
                System.out.println("Telefone: " + RegistrarProfessor[c].getTelefone());
                System.out.println("Idade: "    + RegistrarProfessor[c].getIdade());
                System.out.println("Endereço: " + RegistrarProfessor[c].getEndereco());
                System.out.println("Turma: "    + RegistrarProfessor[c].getTurmas());
                System.out.println("Turno: "    + RegistrarProfessor[c].getTurnos());
                System.out.println("Materia: "  + RegistrarProfessor[c].getMateria());

                System.out.println("..............................................");

            }
        }



    }

}
