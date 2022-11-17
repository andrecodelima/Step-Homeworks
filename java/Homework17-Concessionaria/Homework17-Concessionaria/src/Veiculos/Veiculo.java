package Veiculos;

public abstract class Veiculo {

    private String modelo;
    private String fabricante;
    private String cor;
    private int anoFabricacao;

    public Veiculo(String modelo, String fabricante, String cor, int anoFabricacao) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    public Veiculo(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }


    public void imprime(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Cor: " +  cor);
        System.out.println("Ano de Fabricação: " + anoFabricacao);

    }

}
