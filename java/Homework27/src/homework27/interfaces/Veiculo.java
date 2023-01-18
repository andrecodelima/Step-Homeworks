
package homework27.interfaces;


public interface Veiculo {
    public void direcao();
    public String ligarMotor(boolean ligar, String status);
    public String desligarMotor(boolean desligar, String status);
    public int acelerar(int acelerar);
    public String freiar(boolean freiar);
    
     
    
}


