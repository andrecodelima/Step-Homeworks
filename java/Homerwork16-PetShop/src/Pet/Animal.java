package Pet;
import java.util.Scanner;
import java.text.DecimalFormat;

public abstract class Animal {
    private String nome;
    private String raca;
    private int idade;
    private String cor;
    private String dono;
    private String cpfDono;
    private String telDono;

    public Animal(String nome, String raca, int idade, String cor, String dono, String cpfDono, String telDono) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.dono = dono;
        this.cpfDono = cpfDono;
        this.telDono = telDono;
    }

    public Animal(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getCpfDono() {
        return cpfDono;
    }

    public void setCpfDono(String cpfDono) {
        this.cpfDono = cpfDono;
    }

    public String getTelDono() {
        return telDono;
    }

    public void setTelDono(String telDono) {
        this.telDono = telDono;
    }

    public void imprime(){
        System.out.println("\n----------------");

        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Cor: " + cor);
        System.out.println("Dono: " + dono);
        System.out.println("CPF do Dono: " + cpfDono);
        System.out.println("Telefone do Dono: " + telDono);


    }


}
