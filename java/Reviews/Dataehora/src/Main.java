import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe duas datas ");

        System.out.println("Ano");
        int ano1 = sc.nextInt();

        System.out.println("Mês");
        int mes1 = sc.nextInt();

        System.out.println("Dia");
        int dia1 = sc.nextInt();

        LocalDate data1 = LocalDate.of(ano1, mes1, dia1);
        System.out.println(data1);

//        ..............................................

        System.out.println("Ano");
        int ano2 = sc.nextInt();

        System.out.println("Mês");
        int mes2 = sc.nextInt();

        System.out.println("Dia");
        int dia2 = sc.nextInt();

        LocalDate data2 = LocalDate.of(ano2, mes2, dia2);
        System.out.println(data2);

        Period p = Period.between(data1, data2);
        System.out.println(p);

        System.out.println("Datas: " + data1 + " " + data2);
        System.out.println(" ");

        System.out.println("Diferença entre as datas: ");
        System.out.println(p.getYears() + " anos");
        System.out.println(p.getMonths() + " meses");
        System.out.println(p.getDays() + " dias");

    }
}