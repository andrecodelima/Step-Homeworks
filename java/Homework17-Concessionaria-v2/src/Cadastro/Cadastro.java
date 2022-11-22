package Cadastro;

import Veiculos.Caminhao;
import Veiculos.Carro;
import Veiculos.Moto;
import Veiculos.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    public void menu(){

        ArrayList<Veiculo> arrayVec = new ArrayList<>();
        int qtd = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número de cadastros: ");
        qtd = sc.nextInt();

        arrayVec = new ArrayList<>(qtd);

        for(int c = 0; c <=arrayVec.size(); c++){

            System.out.println("Informe o que deseja cadastrar");
            System.out.println("[1] - Carro || [2] - Moto || [3] - Caminhão");
            System.out.print("Digite Aqui: ");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Carro");
                    arrayVec.add(c, Carro.cadastro());
                    break;

                case 2:
                    System.out.println("Moto");
                    arrayVec.add(c, Moto.cadastro());
                    break;

                case 3:
                    System.out.println("Caminhão");
                    arrayVec.add(c, Caminhao.cadastro());
                    break;

             }

        }

        for(Veiculo a: arrayVec){
            a.exibir();
        }


    }
}
