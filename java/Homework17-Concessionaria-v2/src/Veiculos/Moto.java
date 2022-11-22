package Veiculos;

import java.util.Scanner;

public class Moto extends Veiculo{

    public static Veiculo cadastro(){
        Veiculo v = new Moto();
        Scanner sc = new Scanner(System.in);

        System.out.print("Fabricante: ");
        v.setFabricante(sc.next());

        System.out.print("Modelo: ");
        v.setModelo(sc.next());

        System.out.print("Ano: ");
        v.setAno(sc.nextInt());

        System.out.print("Cor: ");
        v.setCor(sc.next());

        return v;
    }

    @Override
    public void exibir(){
        System.out.println("**** MOTO ****");
        super.exibir();

    }

}
