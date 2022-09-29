import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
public class Aula6 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Date hoje = new Date();
        System.out.println("Hoje é: "+ hoje);

        Calendar dataCalendario = Calendar.getInstance();
        // Pegando dados - get
        System.out.println("Data pelo Calendar: " + dataCalendario.getTime());
        System.out.println("Dia do mês: " + dataCalendario.get(Calendar.DAY_OF_MONTH));
        System.out.println("Mês atual: " + dataCalendario.get(Calendar.MONTH));
        System.out.println("Ano atual: " + dataCalendario.get(Calendar.YEAR));
        System.out.println("Dia da Semana: " + dataCalendario.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia corrido do ano: " + dataCalendario.get(Calendar.DAY_OF_YEAR));

        System.out.println("=============");
        // Definindo dados - set

        System.out.println("1º Forma de Setar os dados");
        dataCalendario.set(Calendar.DAY_OF_MONTH, 7);
        dataCalendario.set(Calendar.MONTH, 4);
        dataCalendario.set(Calendar.YEAR, 1989);
        System.out.println(dataCalendario.getTime());

        System.out.println("2º Forma de Setar o date");
        dataCalendario.set(2012,07,26);
        System.out.println(dataCalendario.getTime());

        // - EXERCÍCIO 01
        /*
            Crie um IF encadeado que baseado na hora atual, responda
            Bom dia, Boa tarde ou Boa noite.
            Entre 00 e 12 - Bom dia; Entre 12 as 18 - Boa tarde; Entre 18 e 00 Boa noite.
        */
        System.out.println("\n");

        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int minuto = data.get(Calendar.MINUTE);
        System.out.println(hora);
        System.out.println(minuto);

        if(hora >= 00 && hora <= 12){
            System.out.println("Hora: " + hora + " Bom dia!");
        }else if(hora >12 && hora <=18){
            System.out.println("Hora: " + hora + " Boa tarde!");
        }else{
            System.out.println("Hora: " + hora + " Boa noite!");
        }


        }


    }
