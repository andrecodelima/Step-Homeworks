package Veiculos;

import java.util.Scanner;

public class Carro extends Veiculo{

    private String tipoDirecao;
    private String tipoCombustivel;

    public Carro(String modelo, String fabricante, String cor, int anoFabricacao, String tipoDirecao, String tipoCombustivel) {
        super(modelo, fabricante, cor, anoFabricacao);
        this.tipoDirecao = tipoDirecao;
        this.tipoCombustivel = tipoCombustivel;
    }

    public Carro(){}

    public String getTipoDirecao() {
        return tipoDirecao;
    }

    public void setTipoDirecao(String tipoDirecao) {
        this.tipoDirecao = tipoDirecao;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }


    public static Veiculo cadastro(){

        Veiculo v = new Carro();
        Carro c = new Carro();
        Scanner read = new Scanner(System.in);

        System.out.print("Modelo: ");
        v.setModelo(read.next());

        System.out.print("Fabricante: ");
        v.setFabricante(read.next());

        System.out.print("Cor: ");
        v.setCor(read.next());

        System.out.print("Ano: ");
        v.setAnoFabricacao(read.nextInt());

        System.out.print("Tipo de Direção: ");
        c.setTipoDirecao(read.next());

        System.out.print("Tipo de Combustível: ");
        c.setTipoCombustivel(read.next());

        return v;
    }

    @Override
    public void imprime(){
        System.out.println("==== Carro ====");
        System.out.println("Tipo de direção: " + getTipoDirecao());
//        System.out.println("Tipo de Combustível: " + getTipoCombustivel());
        System.out.println();
        super.imprime();


    }


}
