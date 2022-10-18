public class Barco extends Veiculo{

    protected int potencia;
    public Barco(String modelo, String marca, String placa, String cor, int potencia, int ano) {
        super(modelo, marca, placa, cor, ano);
        this.potencia = potencia;

    }

    @Override
    public void mover() {
        System.out.println("Acelerar Barco");
    }

    @Override
    public void parar() {
        System.out.println("Desacelerar barco");
    }
}
