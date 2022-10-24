import java.util.Scanner;

public class Aluno extends Pessoa{
    private String turma, turno, nomePai, nomeMae;

    public Aluno(String nome, String genero, String telefone, String endereco, int idade, String turma, String turno, String nomePai, String nomeMae) {
        super(nome, genero, telefone, endereco, idade);
        this.turma = turma;
        this.turno = turno;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }


    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public static void cadastroAluno(Aluno [] arrayAluno, int qtd){
        Scanner ler  = new Scanner(System.in);
        System.out.println("");

        System.out.print("Nome: ");
        String nome = ler.nextLine();

        System.out.print("Genero: ");
        String genero = ler.nextLine();

        System.out.print("Tel: ");
        String tel = ler.nextLine();

        System.out.print("Endereço: ");
        String endereco = ler.nextLine();

        System.out.print("idade: ");
        int idade = ler.nextInt();

        ler.nextLine();
        System.out.print("Turma: ");
        String turma = ler.nextLine();

        System.out.print("Turno: ");
        String turno = ler.nextLine();


        System.out.print("Nome do Pai: ");
        String pai = ler.nextLine();

        System.out.print("Nome da mãe: ");
        String mae = ler.nextLine();

        System.out.println("Dados registrados com sucesso!");

        arrayAluno[qtd] = new Aluno(nome, genero, tel, endereco, idade, turma, turno, pai, mae);
        qtd ++;

    }


}
