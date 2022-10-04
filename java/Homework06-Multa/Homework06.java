package Homeworks;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Homework_06 {
    public static void main(String[] args) {
        /*
            Dever de casa:

            receba o valor de um boleto e o dia do vencimento // Pagamento?.
            caso esteja em dia, informe o valor de pagamento sem multa.
            Caso esteja atrasado informe o valor de pagamento com 2% por dia de multa;

        */

        Scanner leia = new Scanner(System.in);
        Calendar dataPagamento = Calendar.getInstance();
        Calendar dataVencimento = Calendar.getInstance();

        dataVencimento.set(2022,((10)-1),12);
        //Formatando a data de vencimento
        DateFormat FormatarVencimento = DateFormat.getDateInstance();


        System.out.println("***************************************************");
        System.out.println("              PAGAMENTO DE MENSALIDADE             ");
        System.out.println("***************************************************");

        System.out.print("Informe o valor do boleto: ");
        double valor = leia.nextDouble();

        System.out.print("Informe a Data do Pagamento: ");
        int dia = leia.nextInt();
        dataPagamento.set(Calendar.DAY_OF_MONTH, dia);


                //Formatando a data do pagamento
        DateFormat FormatarPagamento = DateFormat.getDateInstance();

        Date dataPgmto = dataPagamento.getTime();
        Date dataVencmto = dataVencimento.getTime();
        int difDatas = ((dataPagamento.get(Calendar.DAY_OF_MONTH)) - (dataVencimento.get(Calendar.DAY_OF_MONTH)));
        double multa = ((valor * (2/100))*difDatas);


        System.out.println("\n");
        if(dataPgmto.getTime() <= dataVencmto.getTime()){
            System.out.println("Vencimento Em: " + FormatarPagamento.format(dataVencimento.getTime()));
            System.out.println("===================================================");

            System.out.println("Data do Pagamento: " + FormatarPagamento.format(dataPagamento.getTime()));
            System.out.println("Parabéns você pagou em dia!");
            System.out.println("===================================================");

        }else{
            System.out.println("Data do Vencimento: " + FormatarVencimento.format(dataVencimento.getTime()));
            System.out.println("===================================================");

            System.out.println("Data do Pagamento: " + FormatarPagamento.format(dataPagamento.getTime()));
            System.out.println("Multa de atraso: " + multa);
            System.out.println("===================================================");

        }









        // TESTE
//      System.out.println("Vencimento Em: " + formatarVencimento.format(vencimento.getTime()));

        /*

        * 1º - Usar o "formatarvencimento;
        * 2º - o format;
        * 3º - Como argumento passa-se o vencimento que ja foi setado com o get-time;

        * */







    }
}
