import java.util.Scanner;
import java.util.Calendar;

public class aula6_Desafio {
    public static void main(String[] args) {
//        Receba o dia e o mês de duas datas desse ano e diga quantos dias de distância
//        há entre as duas datas.
    Scanner leia = new Scanner(System.in);
        System.out.print("Dia da Primeira data: ");
        int dia1 = leia.nextInt();
        System.out.print("Mês da Primeira data: ");
        int mes1 = leia.nextInt();

        System.out.print("Dia da Primeira data: ");
        int dia2 = leia.nextInt();
        System.out.print("Mês da Primeira data: ");
        int mes2 = leia.nextInt();

        Calendar data1 = Calendar.getInstance();
        data1.set(Calendar.DAY_OF_MONTH, dia1);
        data1.set(Calendar.MONTH, mes1-1);

        Calendar data2 = Calendar.getInstance();
        data2.set(Calendar.DAY_OF_MONTH, dia2);
        data2.set(Calendar.MONTH, mes2 -1);

        Calendar data3 = Calendar.getInstance();
        data3.set(2022, 9, 27);

        Calendar data4 = Calendar.getInstance();
        data4.set(2022, 9, 29);

        int DifData = data1.get(Calendar.DAY_OF_YEAR) - data2.get(Calendar.DAY_OF_YEAR);
        if(DifData < 0){
            System.out.println(DifData * (-1));
        }

        int DifData2 = data3.get(Calendar.DAY_OF_YEAR) - data4.get(Calendar.DAY_OF_YEAR);
        if(DifData < 0){
            System.out.println(DifData2 * (-1));
        }
    }
}
