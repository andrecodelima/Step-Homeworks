package main;

public class Main {
    public static void main(String[] args) {

        //Trabalhando com Arrays

        int [][] array =
                {
                    {7,9,4,2},
                    {5,8,2,1},
                    {3,6,9,5},
                    {7,8,1,3}
                };
        //Imprima os valores da diagonal principla e da diagonal secundária

        System.out.println("Diagonal Principal");

        for(int i = 0; i < array.length ; i++){
            System.out.println(array[i][i]);
        }

        System.out.println("===============================");

        System.out.println("Diagonal secundária");

        int coluna = array.length-1;

        for(int linha = 0; linha < array.length ; linha++){
            System.out.println(array[linha][coluna]);
            coluna--;
        }

        int [][] array2 =
                {
                        {0,4,7,9,5},
                        {7,9,4,2,0},
                        {5,8,2,1,3},
                        {3,6,9,5,1},
                        {7,8,0,1,3}
                };

        //imprimir pirâmide:
        /*
                 7
                4,2
               8,2,1
              3,6,9,5
             7,8,0,1,3
         */
        for (int x = 0; x < array2.length; x++) {
            switch (x){
                case 0:
                    System.out.println(array2[x][2]);
                    break;
                case 1:
                    System.out.println(array2[x][2] +" "+ array2[x][3]);
                    break;
                case 2:
                    System.out.println(array2[x][1] +" "+ array2[x][2]+" "+ array2[x][3]);
                    break;
                case 3:
                    System.out.println(array2[x][0] +" "+ array2[x][1]+" "+ array2[x][2]+" "+ array2[x][3]);
                    break;
                case 4:
                    System.out.println(array2[x][0] +" "+ array2[x][1]+" "+ array2[x][2]+" "+ array2[x][3]+" "+ array2[x][4]);
                    break;

            }

//            if(x == 0){
//                System.out.println(array2[x][2]);
//            } else if(x == 1)
//                System.out.println(array2[x][2] +" "+ array2[x][3]);
//             else if(x == 2)
//                System.out.println(array2[x][1] +" "+ array2[x][2]+" "+ array2[x][3]);
//            else if(x == 3)
//                System.out.println(array2[x][0] +" "+ array2[x][1]+" "+ array2[x][2]+" "+ array2[x][3]);
//            else if(x == 4)
//                System.out.println(array2[x][0] +" "+ array2[x][1]+" "+ array2[x][2]+" "+ array2[x][3]+" "+ array2[x][4]);
        }
    }
}

/*
* Dever de casa:
* cadastre um array de notas de alunos.
* guarde cada aluno em uma linha do array:
* cada aluno deverá ter 4 notas;
* cadastre 4 alunos e, ao final do cadastro, exiba:
* as notas dos alunos e a média das notas.
*
* --EXTRA- Diga se está aprovado ou reprovado sabendo: de 0 à 5 reprovado, de 5 à 7 recuperação
* e de 7 pra cima está aprovado!
* */