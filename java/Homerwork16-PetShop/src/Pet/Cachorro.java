package Pet;
import java.util.Scanner;
public class Cachorro extends Animal {

    public static Animal cadastro(){
       Animal pet = new Cachorro();
       Scanner read = new Scanner(System.in);

       System.out.print("Nome: ");
       pet.setNome(read.nextLine());

       System.out.print("Idade: ");
       pet.setIdade(read.nextInt());

       System.out.print("Cor: ");
       pet.setCor(read.next());

       System.out.print("Dono: ");
       pet.setDono(read.next());

       System.out.print("CPF do Dono: ");
       pet.setCpfDono(read.next());

       System.out.print("Tel do Dono: ");
       pet.setTelDono(read.nextLine());

        return pet;

    }

    @Override
    public void imprime(){
       System.out.println("----- | Cachorro | ------");
       System.out.println("Brinde: Coleira e Pote de Ração");
    }


}
