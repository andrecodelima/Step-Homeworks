import java.util.Scanner;

public class Professor extends Pessoa{

    private String turma, turno, materia;

    public Professor(String nome, String genero, String telefone, String endereco, int idade, String turmas, String turnos, String materia) {
        super(nome, genero, telefone, endereco, idade);
        this.turma = turmas;
        this.turno = turnos;
        this.materia = materia;
    }

    public String getTurmas() {
        return turma;
    }

    public void setTurmas(String turmas) {
        this.turma = turmas;
    }

    public String getTurnos() {
        return turno;
    }

    public void setTurnos(String turnos) {
        this.turno = turnos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public static void cadastroProfessor(Professor [] arrayProf, int qtd){
        Scanner ler  = new Scanner(System.in);
        System.out.println("");

        System.out.print("Nome: ");
        String nome = ler.next();

        System.out.print("Genero: ");
        String genero = ler.next();

        System.out.print("Tel: ");
        String tel = ler.next();

        System.out.print("Endereço: ");
        String endereco = ler.next();

        System.out.print("idade: ");
        int idade = ler.nextInt();

        System.out.print("Turma: ");
        String turma = ler.next();

        System.out.print("Turno: ");
        String turno = ler.next();

        System.out.print("Materia: ");
        String materia = ler.next();


        System.out.println("Dados registrados com sucesso!");

        arrayProf[qtd] = new Professor(nome, genero, tel, endereco, idade, turma, turno, materia);
        qtd ++;
    }
}

