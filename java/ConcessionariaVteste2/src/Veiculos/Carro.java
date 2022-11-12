package Veiculos;

public class Carro extends Veiculo{
    private String cor = "Black";

    public Carro(String modelo, String cor) {
        super(modelo);
        this.cor = cor;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public void imprime(){
        System.out.println("|| Carro ||");
        System.out.println("Cor: " + getCor());
    }
}
