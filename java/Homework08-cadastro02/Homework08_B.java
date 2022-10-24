package Homeworks;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class Homework08_B {
    public static void main(String[] args) {

//        README
        /*
            Crie uma classe aluno com nome, nascimento, genero, peso e altura;
            Encapsule as propriedades,
            crie construtores
            no psvm, instancie dois objetos do tipo Aluno,
            e exiba na tela (sout) os dados dos dois alunos instanciados;

        */

//      DECLARAÇÃO DAS VARIÁVEIS
        String InputNome, Inputnascimento, Inputgenero;
        double Inputpeso, Inputaltura;


//      ENTRADA DE DADOS
        Scanner ler = new Scanner(System.in);
        System.out.println("CADASTRO DE ALUNOS" + "\n");

        System.out.print("Nome: ");
        InputNome = ler.next();

        System.out.print("Nascimento: ");
        Inputnascimento = ler.next();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        //Converter string em data. Como?

        System.out.print("Genero: " + "[M] |Masculino| ou [F]: ");
        Inputgenero = ler.next();

        System.out.print("Peso: ");
        Inputpeso = ler.nextDouble();

        System.out.print("Altura: ");
        Inputaltura = ler.nextDouble();

//      INSTANCIAÇÃO DOS OBJETOS
        Aluno a1 = new Aluno(InputNome, Inputnascimento, Inputgenero, Inputpeso, Inputaltura);
        Aluno a2 = new Aluno("Glaucio", "22/2/1989", "M", 54.4, 1.31 );

        System.out.println("\n"                                     +
                "====================================="             + "\n" +
                "Nome: "        + a1.getNome()                      + "\n" +
                "Nascimento: "  + a1.getData()                      + "\n" +
                "Gênero: "      + a1.getGenero()                    + "\n" +
                "Peso: "        + a1.getPeso()                      + "\n" +
                "Altura: "      + a1.getAltura())                           ;


//      Entrada manual dos dados
        System.out.println( "\n"                                    +
                "=====================================" + "\n" +
                            "Nome: "        + a2.getNome()          + "\n" +
                            "Nascimento: "  + a2.getData()          + "\n" +
                            "Gênero: "      + a2.getGenero()        + "\n" +
                            "Peso: "        + a2.getPeso()          + "\n" +
                            "Altura: "      + a2.getAltura())              ;
        }

}



//CRIAÇÃO DE CLASSE
class Aluno{
    //  ENCAPSULAMENTO DAS PROPRIEDADES
    private String nome;
    private String data;
    private String genero;
    private double peso;
    private double altura;

//  CRIAÇÃO DO CONSTRUTOR
    public Aluno(String nome, String data, String genero, double peso, double altura) {
        this.nome = nome;
        this.data = data;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

// ATRIBUIÇÃO DE ACESSO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}



