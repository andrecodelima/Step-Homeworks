import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //COLLECTIONS
        ArrayList<String> frutas = new ArrayList<>();

        System.out.println(frutas);

        frutas.add("Uva");
        frutas.add("Banana");

        System.out.println(frutas);
        System.out.println(frutas.get(0));
        System.out.println(frutas.get(1));

        frutas.add(0, "Melão");
        //Especificando em qual casa o valor vai ficar.
        // Lista de baixo pra cima.
        // Sempre que inserir para ser o primeiro.

        System.out.println(frutas);

        frutas.set(0, "Pêra");
        System.out.println(frutas);
        //No set, qual casa qua vai definir e qual valor vai entrar

        System.out.println(frutas.contains("Banana"));
        //Contains retorna valor booleano, Ou tem ou não tem

        System.out.println(frutas.indexOf("Banana"));
        //Indexof retorna o índice em que o valor se encontra

//        if(frutas.contains("Melão"));
//        System.out.println("Melão está na casa: " + frutas.indexOf("Melão"));
//        }
//
        frutas.remove(0);
        System.out.println(frutas);
        //O remove não deixa indices vazios.

        frutas.remove(frutas.size()-1); // Última Casa;
        System.out.println(frutas);


    }
}