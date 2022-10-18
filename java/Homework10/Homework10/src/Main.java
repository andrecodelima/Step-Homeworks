public class Main {
    public static void main(String[] args) {

     //README

    /*
        Crie as classes veículo, carro, moto e barco.
            Coloque as propriedades
            E comportamentos básicos no veículo.
            Crie propriedades em carro, moto e barco, caso veja necessidade.
            USE POLIMORFISMO nos métodos.
            USE HERANÇA.

     */

        System.out.println("============================================");
//      VEICULO PADRÃO

        Veiculo veiculoPadrao = new Veiculo("Padrão", "X", "000-000", "Branco", "Veiculo", 2022);
        System.out.println("VEÍCULO PADRÃO");
        System.out.println("");
        System.out.println("Caracteresticas Gerais:"                   + "\n"
                            + "Modelo: " + veiculoPadrao.modelo        + "\n"
                            + "Marca: "  + veiculoPadrao.marca         + "\n"
                            + "Placa: "  + veiculoPadrao.placa         + "\n"
                            + "Cor: "    + veiculoPadrao.cor           + "\n"
                            + "Tipo: "   + veiculoPadrao.tipoVeiculo   + "\n"
                            + "Ano: "    + veiculoPadrao.ano           + "\n");

        System.out.println("Comportamentos padrões: ");
        veiculoPadrao.mover();
        veiculoPadrao.parar();

        System.out.println("============================================");
        System.out.println("");

//      CARRO

        Carro carro1 = new Carro("Uno", "Fiat", "KSY8299", "Preto", "Gasolina", 2014);

        System.out.println("CARRO");
        System.out.println("");
        System.out.println("Caracteresticas Gerais:"     + "\n"
                + "Modelo: "        + carro1.modelo      + "\n"
                + "Marca: "         + carro1.marca       + "\n"
                + "Placa: "         + carro1.placa       + "\n"
                + "Cor: "           + carro1.cor         + "\n"
                + "Combustível: "   + carro1.combustivel + "\n"
                + "Ano: "           + carro1.ano         + "\n");

        System.out.println("Comportamentos padrões: ");
        carro1.mover();
        carro1.parar();

        System.out.println("============================================");
        System.out.println("");

//      MOTO

        Moto moto1 = new Moto("CG 160 Fan", "Honda", "KAH8139", "Vermelho", 162, 2021);

        System.out.println("MOTO");
        System.out.println("");
        System.out.println("Caracteresticas Gerais:"    + "\n"
                + "Modelo: "        + moto1.modelo      + "\n"
                + "Marca: "         + moto1.marca       + "\n"
                + "Placa: "         + moto1.placa       + "\n"
                + "Cor: "           + moto1.cor         + "\n"
                + "Cilindrada: "    + moto1.cilindrada  + "\n"
                + "Ano: "           + moto1.ano         + "\n");

        System.out.println("Comportamentos padrões: ");
        moto1.mover();
        moto1.parar();

        System.out.println("============================================");
        System.out.println("");

//      BARCO

        Barco lancha = new Barco("Flyer 8 SUNdeck", "ND", "NAV-121", "Branco", 350, 2018);

        System.out.println("BARCO");
        System.out.println("");
        System.out.println("Caracteresticas Gerais:"     + "\n"
                + "Modelo: "        + lancha.modelo      + "\n"
                + "Marca: "         + lancha.marca       + "\n"
                + "Placa: "         + lancha.placa       + "\n"
                + "Cor: "           + lancha.cor         + "\n"
                + "Potencia: "      + lancha.potencia    + "\n"
                + "Ano: "           + lancha.ano         + "\n");

        System.out.println("Comportamentos padrões: ");
        lancha.mover();
        lancha.parar();



    }
}