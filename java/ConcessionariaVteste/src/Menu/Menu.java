package Menu;
import Veiculos.Veiculo;
import Veiculos.Carro;

import java.sql.Array;
import java.util.Scanner;

public class Menu {

    public void Menu(){
        Veiculo [] arrayCarro;
        int qtd = 0;

        Scanner read = new Scanner(System.in);
        System.out.print("Número de cadastros: ");
        qtd = read.nextInt();

        arrayCarro = new Veiculo[qtd];

        for(int c = 0; c<arrayCarro.length; c++){

            arrayCarro[c] = Carro.cadastro();
            c++;
        }

        for(Veiculo v : arrayCarro){
            v.imprime();
        }

    }
}
