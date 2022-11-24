package Veiculos;

public abstract class Veiculo {

    String fabricante;
    String modelo;
    int ano;
    String cor;

    public Veiculo(String fabricante, String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.cor = cor;
    }

    public Veiculo (){}

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void exibir(){
        System.out.println("Cadastro de Veiculos");
        System.out.println("====================");

        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Mddelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Cor: " + this.getCor());

        System.out.println("====================");


    }
}
