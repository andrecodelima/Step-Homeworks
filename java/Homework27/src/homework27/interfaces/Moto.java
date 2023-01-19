
package homework27.interfaces;


public class Moto implements Veiculo {
    private boolean ligado = false;

    public Moto(boolean ligado) {
        this.ligado = ligado;
    }
    
    
  
    public Moto(){}

   public String guidao(String direcao){
         if(ligado == true){
            direcao = "Segurar guidao e girar para esquerda";
        }
         return direcao;
    }
   
    @Override
    public String ligarMotor(boolean ligar, String status) {
        
        if(ligado == false){
            ligar = true;
            status = "Moto ligada";
        }
        return status;
     }

    @Override
    public String desligarMotor(boolean desligar, String status) {
          if(ligado == true){
            desligar = false;
            status = "Moto desligada";

        }
        return status;
    }

    @Override
    public int acelerar(int velocidade) {
         if(ligado == true){
             velocidade = 180;
         }
         return velocidade;
         
    }

    @Override
    public String freiar(boolean freiar) {
        if(ligado == true){
            
        }
        return "Parar Moto";
     }


}


