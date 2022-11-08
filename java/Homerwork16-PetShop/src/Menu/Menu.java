package Menu;
import java.util.Scanner;
import Pet.Animal;
import Pet.Cachorro;
import Pet.Gato;
import Pet.Peixe;

import javax.xml.bind.SchemaOutputResolver;

public class Menu {

    public void menu(){
        Animal [] arrayPet;
        int qtd = 0;

        Scanner read = new Scanner(System.in);
        System.out.print("Quantos Pets serão cadastrados?");
        qtd = read.nextInt();

        arrayPet = new Animal[qtd];

        for(int c = 0; c< arrayPet.length; c++){
            System.out.println("Cadastro de PETS");
            System.out.println("------------------");

            System.out.println("[1] - Cachorro");
            System.out.println("[2] - Gato");
            System.out.println("[3] - Peixe");

            System.out.print("Digite Aqui:");
            int opcao = read.nextInt();

            switch (opcao){
                case 1:
                    arrayPet[c] = Cachorro.cadastro();
                    break;

                case 2:
                    arrayPet[c] = Gato.cadastro();
                    break;

                case 3:
                    arrayPet[c] = Peixe.cadastro();
                    break;

                default:
                    System.out.println("Informe uma opção válida");
                    c--;
                    break;

            }

        }


    }


}
