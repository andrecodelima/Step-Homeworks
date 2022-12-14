import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a data de um boleto");
        System.out.println("VENCIMENTO HOJE!!!");

        System.out.println("Ano");
        int ano = sc.nextInt();

        System.out.println("Mês");
        int mes = sc.nextInt();

        System.out.println("Dia");
        int dia = sc.nextInt();

        LocalDate data = LocalDate.of(ano, mes, dia);
        System.out.print("Data do Boleto" +  " "+ data);

        LocalDate dataHoje = LocalDate.now();

        Period p = Period.between(data, dataHoje);

        if(data.isBefore(dataHoje)){
            System.out.println(" -------------- ");
            System.out.println("Boleto vencido!");
            System.out.println("Dias de vencido: " + p.getMonths() + " meses " + p.getDays() + " dias" );
        }


    }
}
