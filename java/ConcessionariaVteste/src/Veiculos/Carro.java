package Veiculos;

import java.util.Scanner;

public class Carro extends Veiculo{

    private String cor;

    public Carro(String modelo, int ano, String cor) {
        super(modelo, ano);
        this.cor = cor;
    }
    public Carro(){}

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static Veiculo cadastro(){
        Veiculo v = new Carro();
        Carro c = new Carro();

        Scanner read = new Scanner(System.in);

        System.out.print("Modelo: ");
        v.setModelo(read.next());

        System.out.print("Ano: ");
        v.setAno(read.nextInt());

        System.out.print("Cor: ");
        c.setCor(read.next());

        return v;

    }

    public void imprime(){
        super.imprime();
        System.out.println("Cor: " + getCor());

    }
}
