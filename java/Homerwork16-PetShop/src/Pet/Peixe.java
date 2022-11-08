package Pet;
import java.util.Scanner;
public class Peixe extends Animal{

    public static Animal cadastro(){
        Animal pet = new Peixe();
        Scanner read = new Scanner(System.in);

        System.out.println("Cadastro  || Peixe\n");

        System.out.print("Nome: ");
        pet.setNome(read.nextLine());

        System.out.print("Raça: ");
        pet.setRaca(read.nextLine());

        System.out.print("Idade: ");
        pet.setIdade(read.nextInt());

        System.out.print("Cor: ");
        pet.setCor(read.next());

        System.out.print("Dono: ");
        pet.setDono(read.next());

        System.out.print("CPF do Dono: ");
        pet.setCpfDono(read.next());

        System.out.print("Tel do Dono: ");
        pet.setTelDono(read.next());

        return pet;
    }
    @Override
    public void imprime(){
        super.imprime();
        System.out.println("\n----- | BRINDE | ------");
        System.out.println("Saco de transporte");
    }
}
