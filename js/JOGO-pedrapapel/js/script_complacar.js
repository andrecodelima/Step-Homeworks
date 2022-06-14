
function play(){
    var tentativas = [] // Número de tentativas
    var escolhas_PC = [] // Escolhas 'Feitas' pelo PC.
    var i = 1; // Contador para uso no número de tentativas

    // Arrays
    var pc_win = []
    var jogador_win = []
    var pc_loser = []
    var jogador_loser = []
    var empate = []

    // Laço de repetição que vai conter as ações de cada rodada.
    for(let i=1; i<4; i++){
        jogador = window.prompt("Seja bem-vido ao Pedra | Papel | Tesoura." + "\n"
                        + "Para escolher 'Pedra - Digite [1]'" + "\n"
                        + "Para escolher 'Papel - Digite [2]'" + "\n"
                        + "Para escolher 'Tesoura - Digite [3]'" + "\n" + "\n"
                        +  `${i}º Tentativa`);

        pc = Math.floor((Math.random()*3)+1) // pc recebe um número aleatorio entre 1 e 3

        // Início da lógica das disputas //

        //PEDRA
              //Validação do número digitado caso seja diferente de 1,2 e 3.
        if(jogador == 0 || jogador >3 || jogador == NaN){
            jogador = window.prompt("Digite um número entre 1 e 3: ")
        }else{

            //Início da disputa
            if(jogador == 1 && pc == 1){
                alert(`<EMPATE!\n
                        Você escolheu: Pedra e Computador escolheu: Pedra`)
                     empate.push(1)
                     continue
    
            }else if(jogador == 1 && pc == 2){
                alert(`Você PERDEU!\n
                        Você escolheu: Pedra e Computador escolheu: Papel`)
                    pc_win.push(1)
                    jogador_loser.push(1)
                    continue

            }else if(jogador == 1 && pc == 3){
                alert(`Você VENCEU! \n
                        Você escolheu: Pedra e Computador escolheu: Tesoura`)
                    jogador_win.push(1)
                    pc_loser.push(1)
                    continue
            }
        }
        

        //PAPEL
              //Validação do número digitado caso seja diferente de 1,2 e 3.
        if(jogador == 0 || jogador >3 || jogador == NaN){
            jogador = window.prompt("Digite um número entre 1 e 3: ")
        }else{

            //Início da disputa
            if(jogador == 2 && pc == 1){
                alert(`Você GANHOU! \n
                        Você escolheu: Papel e Computador escolheu: Pedra`)
                     jogador_win.push(1)
                     pc_loser.push(1)
                     continue
    
            }else if(jogador == 2 && pc == 2){
                alert(`EMPATE! \n
                        Você escolheu: Papel e Computador escolheu: Papel`)
                    empate.push(1)
                    continue
    
            }else if(jogador == 2 && pc == 3){
                alert(`Você PERDEU! \n
                        Você escolheu: Papel e Computador escolheu: Tesoura`)
                    pc_win.push(1)
                    jogador_loser.push(1)
                    continue
            }
        }
    
        
        //TESOURA
                //Validação do número digitado caso seja diferente de 1,2 e 3.
        if(jogador == 0 || jogador >3 || jogador == NaN){
            jogador = window.prompt("Digite um número entre 1 e 3: ")
        }else{
            
            //Início da disputa
            if(jogador == 3 && pc == 1){
                    alert(`Você PERDEU! \n
                            Você escolheu: Tesoura e Computador escolheu: Pedra`)
                    pc_win.push(1)
                    jogador_loser.push(1)
                    continue
    
            }else if(jogador == 3 && pc == 2){
                    alert(`Você VENCEU! \n
                        Você escolheu: Tesoura e Computador escolheu: Papel`)
                    jogador_win.push(1)
                    pc_loser.push(1)
                    continue
    
            }else if(jogador == 3 && pc == 3){
                    alert(`EMPATE! \n
                        Você escolheu: Tesoura e Computador escolheu: Tesoura`)
                    empate.push(1)
                    continue
            }  
        }
    }
    
        tentativas.push(i) // Contador i é enviado ao array 'tentativas'
        escolhas_PC.push(pc) // var 'pc' é enviado ao array 'escolhas pc'

        // PLACAR //

document.getElementById("win").innerHTML=(jogador_win.length); 
//O tamanho do array 'Jogador_win' é enviado ao página html.

document.getElementById("los").innerHTML=(jogador_loser.length);
document.getElementById("empt").innerHTML=(empate.length);

}  

