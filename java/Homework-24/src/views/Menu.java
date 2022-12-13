package views;

import controllers.ClienteController;
import models.Cliente;
import services.Entrada;

import java.util.ArrayList;

class Menu {

    protected void menu(){

        while (true){
            System.out.println("........ LOJA_PAPER ........\n");
            System.out.println("[1] - CADASTRAR");
            System.out.println("[2] - CONSULTAR");
            System.out.println("[3] - SAIR");

            System.out.print("Escolha uma das opções: ");
            int op = Entrada.entInt();

            switch (op){
                case 1:
                    ClienteController.cadastrar();
                    break;

                case 2:

                    ArrayList<Cliente>list1 = ClienteController.allClients();
                    for(Cliente c : list1){

                        ClienteController.exibir(c);
                        System.out.println("----------------------");
                    }if(list1.isEmpty()){
                    System.out.println("Não há clientes cadastrados");
                    }

                    break;

                case 3:
                    System.out.println("Encerrando o sistema... ");
                    System.exit(0);

            }

        }
    }
}
