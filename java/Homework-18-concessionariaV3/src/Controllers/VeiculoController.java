package Controllers;

import Models.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class VeiculoController {

    public static ArrayList<Veiculo> getByCor(ArrayList<Veiculo> lista){
        ArrayList<Veiculo> result = new ArrayList();
        for(Veiculo v : lista){
            if(v.getCor().toLowerCase().equals("Azul")){
                System.out.println("Carro premiado");
            }
        }

        return result;
    }
    public static Veiculo cadastro(){

        Veiculo p = new Veiculo();
        Scanner sc = new Scanner(System.in);

        System.out.print("Modelo: ");
        p.setModelo(sc.nextLine());

        System.out.print("Ano: ");
        p.setAno(sc.nextInt());

        System.out.print("Cor: ");
        p.setCor(sc.next());

        return p;

    }


}
