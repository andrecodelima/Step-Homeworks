package PessoaTipo;
import java.util.Scanner;
import Pessoa.Pessoa;

public class Aluno extends Pessoa {
    private String Turma;

    public Aluno(String nome, int idade, double peso, double altura, String turma) {
        super(nome, idade, peso, altura);
        Turma = turma;
    }

    public String getTurma() {
        return Turma;
    }

    public void setTurma(String turma) {
        Turma = turma;
    }
}
