package Menu;
import java.util.ArrayList;
import java.util.Scanner;
import Pet.Animal;
import Pet.Cachorro;
import Pet.Gato;
import Pet.Peixe;

import javax.xml.bind.SchemaOutputResolver;

public class Menu {

    public static void menu(){
        ArrayList<Animal> arrayPet = new ArrayList<>();
        int qtd = 0;

        Scanner read = new Scanner(System.in);
        System.out.println("Cadastro de PETS");
        System.out.println("------------------");

        System.out.print("\nQuantos Pets serão cadastrados? ");
        qtd = read.nextInt();

        arrayPet = new ArrayList<>(qtd);

        for(int c = 0; c<=arrayPet.size(); c++){

            System.out.println("[1] - Cachorro");
            System.out.println("[2] - Gato");
            System.out.println("[3] - Peixe");

            System.out.print("Digite Aqui: ");
            int opcao = read.nextInt();

            switch (opcao){
                case 1:
                    arrayPet.add(c, Cachorro.cadastro());
                    break;

//                case 2:
//                    arrayPet.set(c, Gato.cadastro());
//                    break;
//
//                case 3:
//                    arrayPet.set(c, Peixe.cadastro());
//                    break;

                default:
                    System.out.println("Informe uma opção válida");
                    break;
            }

        }

        for(Animal a : arrayPet){
            a.imprime();
        }


    }


}
