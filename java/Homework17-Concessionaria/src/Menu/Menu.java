package Menu;
import Veiculos.Veiculo;
import Veiculos.Carro;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void menu(){

        ArrayList<Veiculo> listVeiculo = new ArrayList<Veiculo>();
        int qtd = 0;

        Scanner read = new Scanner(System.in);
        System.out.println("Cadastro de Carros: \n");
        System.out.print("Informe quantos carros deseja cadastrar: ");
        qtd = read.nextInt();

        listVeiculo = new ArrayList<>(qtd);

        for(int c=0; c<=listVeiculo.size(); c++){

            listVeiculo.add(c,Carro.cadastro());
            break;

        }

        for(Veiculo v : listVeiculo){
            v.imprime();

        }


    }
}
