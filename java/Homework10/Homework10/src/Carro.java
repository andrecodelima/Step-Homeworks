public class Carro extends Veiculo{
    protected String combustivel;
    public Carro(String modelo, String marca, String placa, String cor, String combustivel, int ano) {
        super(modelo, marca, placa, cor, ano);
        this.combustivel = combustivel;
    }


    @Override
    public void mover(){
        System.out.println("Acelerando o carro");
    }

    @Override
    public void parar() {
        System.out.println("Freando o carro");
    }
}
