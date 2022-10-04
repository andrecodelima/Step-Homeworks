import java.util.Scanner;
import java.util.Calendar;

public class Homework06 {
    public static void main(String[] args) {
        //Receba a data de nascimento do usuário e diga a idade corretamente.

        Calendar Data = Calendar.getInstance();
        int Ano_Atual = Data.get(Calendar.YEAR);

        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o ano do seu Nascimento: ");
        int ano = ler.nextInt();
        System.out.println("Sua idade: " + (Ano_Atual - ano) + "anos");




    }
}
