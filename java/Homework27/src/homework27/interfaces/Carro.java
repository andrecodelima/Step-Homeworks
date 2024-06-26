
package homework27.interfaces;


public class Carro implements Veiculo {
    private boolean ligado = false;

    public Carro(boolean ligado) {
        this.ligado = ligado;
    }
      
  
    public Carro(){}

    
    public String volante(String direcao){
         if(ligado == true){
            direcao = "Segurar volante e girar para direita";
        }
         return direcao;
    }

    @Override
    public String ligarMotor(boolean ligar, String status) {
        
        if(ligado == false){
            ligar = true;
            status = "Carro ligado";
        }
        return status;
     }

    @Override
    public String desligarMotor(boolean desligar, String status) {
          if(ligado == true){
            desligar = false;
            status = "Carro desligado";

        }
        return status;
    }

    @Override
    public int acelerar(int velocidade) {
         if(ligado == true){
             velocidade = 80;
         }
         return velocidade;
         
    }

    @Override
    public String freiar(boolean freiar) {
        if(ligado == true){
            
        }
        return "Parar Carro";
     }


}


