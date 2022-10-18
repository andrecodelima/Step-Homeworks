public class Moto extends Veiculo{
    protected int cilindrada;

    public Moto(String modelo, String marca, String placa, String cor, int cilindrada, int ano) {
        super(modelo, marca, placa, cor, ano);
        this.cilindrada = cilindrada;

    }

    @Override
    public void mover() {
        System.out.println("Acelerar a moto");
    }

    @Override
    public void parar() {
        System.out.println("Frear a moto");
    }
}
