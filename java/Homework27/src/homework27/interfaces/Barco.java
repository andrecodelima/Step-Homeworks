
package homework27.interfaces;


public class Barco implements Veiculo {
    private boolean ligado = false;

    public Barco(boolean ligado) {
        this.ligado = ligado;
    }
    
    
  
    public Barco(){}

   public String timao(String direcao){
         if(ligado == true){
            direcao = "Segurar timao";
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


