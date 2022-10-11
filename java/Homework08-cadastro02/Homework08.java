//package Homeworks;
//import java.util.Scanner;
//import java.util.Date;
//
//public class Homework08 {
//    public static void main(String[] args) {
//
////        README
//        /*
//            Crie uma classe aluno com nome, nascimento, genero, peso e altura;
//            Encapsule as propriedades,
//            crie construtores
//            no psvm, instancie dois objetos do tipo Aluno,
//            e exiba na tela (sout) os dados dos dois alunos instanciados;
//
//        */
//
////      DECLARAÇÃO DAS VARIÁVEIS
//        String InputNome, Inputnascimento, Inputgenero;
//        double Inputpeso, Inputaltura;
//
//
////      ENTRADA DE DADOS
////        Scanner ler = new Scanner(System.in);
////        System.out.println("CADASTRO DE ALUNOS" + "\n");
////
////        System.out.print("Nome: ");
////        InputNome = ler.next();
////
////        System.out.print("Nascimento: ");
////        Inputnascimento = ler.next();
////
////        System.out.print("Genero: " + "[M] |Masculino| ou [F]: ");
////        Inputgenero = ler.next();
////
////        System.out.print("Peso: ");
////        Inputpeso = ler.nextDouble();
////
////        System.out.print("Altura: ");
////        Inputaltura = ler.nextDouble();
//
//        for(int c = 0; c<=2; c++){
//
//            Scanner ler = new Scanner(System.in);
//
//            System.out.println("CADASTRO DE ALUNOS" + "\n");
//
//            System.out.println("CADASTRO " + c+1);
//
//            System.out.print("Nome: ");
//            InputNome = ler.next();
//
//            System.out.print("Nascimento: ");
//            Inputnascimento = ler.next();
//
//            System.out.print("Genero: " + "[M] |Masculino| ou [F]: ");
//            Inputgenero = ler.next();
//
//            System.out.print("Peso: ");
//            Inputpeso = ler.nextDouble();
//
//            System.out.print("Altura: ");
//            Inputaltura = ler.nextDouble();
//
//            Aluno a1 = new Aluno(InputNome, Inputnascimento, Inputgenero, Inputpeso, Inputaltura);
//
//            System.out.println("\n"                                     +
//                                "Aluno Nº: "     + c                    + "\n" +
//                                "=====================================" + "\n" +
//                                "Nome: "        + a1.getNome()          + "\n" +
//                                "Nascimento: "  + a1.getData()          + "\n" +
//                                "Gênero: "      + a1.getGenero()        + "\n" +
//                                "Peso: "        + a1.getPeso()          + "\n" +
//                                "Altura: "      + a1.getAltura());
//        }
//    }
//
//
//}
//
//class Aluno{
//    private String nome;
//    private String data;
//    private String genero;
//    private double peso;
//    private double altura;
//
//    public Aluno(String nome, String data, String genero, double peso, double altura) {
//        this.nome = nome;
//        this.data = data;
//        this.genero = genero;
//        this.peso = peso;
//        this.altura = altura;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getData() {
//        return data;
//    }
//
//    public void setData(String data) {
//        this.data = data;
//    }
//
//    public String getGenero() {
//        return genero;
//    }
//
//    public void setGenero(String genero) {
//        this.genero = genero;
//    }
//
//    public double getPeso() {
//        return peso;
//    }
//
//    public void setPeso(double peso) {
//        this.peso = peso;
//    }
//
//    public double getAltura() {
//        return altura;
//    }
//
//    public void setAltura(double altura) {
//        this.altura = altura;
//    }
//}
