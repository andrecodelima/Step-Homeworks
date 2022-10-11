package Homeworks;

import java.sql.SQLOutput;
import java.util.*;
import java.time.*;

public class Homework07 {
    public static void main(String[] args) {
        /*
        Dever de casa
        =============

        Receba duas datas e diga a diferença de dias entre elas.
        */

        Scanner leia = new Scanner(System.in);

        // Primeira Data
        System.out.println("----------------------------------");
        System.out.println("Informe os dados da PRIMEIRA DATA");
        System.out.println("----------------------------------");

        System.out.print("Informe o ano: ");
        int ano1 = leia.nextInt();

        System.out.print("Informe o mês: ");
        int mes1 = leia.nextInt();

        System.out.print("Informe o dia: ");
        int dia1 = leia.nextInt();

        LocalDate data1 = LocalDate.of(ano1, mes1, dia1);

        // Segunda Data
        System.out.println("----------------------------------");
        System.out.println("Informe os dados da SEGUNDA DATA");
        System.out.println("----------------------------------");

        System.out.print("Informe o ano: ");
        int ano2 = leia.nextInt();

        System.out.print("Informe o mês: ");
        int mes2 = leia.nextInt();

        System.out.print("Informe o dia: ");
        int dia2 = leia.nextInt();

        LocalDate data2 = LocalDate.of(ano2, mes2, dia2);

        System.out.println();

        System.out.print("Data1: " + data1 + "\n" + "Data2: " + data2);
        System.out.println();

        // Diferença entre as datas

        System.out.println("----------------------------------");
        System.out.println("    Intervalo entre as datas      ");
        System.out.println("----------------------------------");

        Period intervalo = Period.between(data1, data2);
        System.out.println("Diferença entre os anos:  " + intervalo.getYears()              + " ano(s)");
        System.out.println("Diferença entre os meses: " + intervalo.getMonths()             + " meses"   );

        if(intervalo.getDays() < 0){
            System.out.println("Diferença entre os dias:  " + (intervalo.getDays() *(-1))   + " dias"  );
        }else{
            System.out.println("Diferença entre os dias:  " + intervalo.getDays()           + " dias"  );
        }





    }
}
