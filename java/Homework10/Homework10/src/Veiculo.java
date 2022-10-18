public class Veiculo {

    protected String modelo, marca, placa, cor, tipoVeiculo;
    protected int ano;

    public Veiculo(String modelo, String marca, String placa, String cor, String tipo, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
        this.tipoVeiculo = tipo;
        this.ano = ano;
    }

    public Veiculo(String modelo, String marca, String placa, String cor, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

// Definindo os métodos (Comportamentos)

    public void mover(){
        System.out.println("anda");
    }

    public void parar(){
        System.out.println("para");
    }



}
