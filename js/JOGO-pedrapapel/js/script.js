

// function play(){
//     jogador = window.prompt("Seja bem-vido ao Pedra | Papel | Tesoura." + "\n"
//                 + "Para escolher 'Pedra - Digite [1]'" + "\n"
//                 + "Para escolher 'Papel - Digite [2]'" + "\n"
//                 + "Para escolher 'Tesoura - Digite [3]'" + "\n");
    
//     jogo()    
// }

function jogo(){
    var tentativas = []
    for(let i=1; i<4; i++){
        pc = Math.floor((Math.random()*3)+1)
        tentativas.push(i)
    }
 document.write(tentativas)   
}


// TESTES
function play(){
    var tentativas = []
    var banco = []
    for(let i=1; i<4; i++){
        jogador = window.prompt("Seja bem-vido ao Pedra | Papel | Tesoura." + "\n"
                        + "Para escolher 'Pedra - Digite [1]'" + "\n"
                        + "Para escolher 'Papel - Digite [2]'" + "\n"
                        + "Para escolher 'Tesoura - Digite [3]'" + "\n" + "\n"
                        +  `${i}º Tentativa`);
        pc = Math.floor((Math.random()*3)+1)
        disputa()
        tentativas.push(i)
        banco.push(pc)
    }
 document.write(`Tentativas: ${tentativas}\n
                PC: ${banco}`)   
}

function disputa(){
    var pc_win = []
    var jogador_win = []
    var pc_loser = []
    var jogador_loser = []
    var empate = []

    //PEDRA
    if(jogador == 1 && pc == 1){
        alert(`EMPATE! \n
             Você escolheu: Pedra e Computador escolheu: Pedra`)
    }else if(jogador == 1 && pc == 2){
        alert(`Você PERDEU! \n
        Você escolheu: Pedra e Computador escolheu: Papel`)
    }else if(jogador == 1 && pc == 3){
        alert(`Você VENCEU! \n
             Você escolheu: Pedra e Computador escolheu: Tesoura`)
    }
    
    //PAPEL
    if(jogador == 2 && pc == 1){
        alert(`Você GANHOU! \n
             Você escolheu: Papel e Computador escolheu: Pedra`)
    }else if(jogador == 2 && pc == 2){
        alert(`EMPATE! \n
        Você escolheu: Papel e Computador escolheu: Papel`)
    }else if(jogador == 2 && pc == 3){
        alert(`Você PERDEU! \n
             Você escolheu: Papel e Computador escolheu: Tesoura`)
    }
    
    //TESOURA
    if(jogador == 3 && pc == 1){
        alert(`Você PERDEU! \n
                Você escolheu: Tesoura e Computador escolheu: Pedra`)
    }else if(jogador == 3 && pc == 2){
        alert(`Você VENCEU! \n
        Você escolheu: Tesoura e Computador escolheu: Papel`)
    }else if(jogador == 3 && pc == 3){
        alert(`EMPATE! \n
                Você escolheu: Tesoura e Computador escolheu: Tesoura`)
    }  
    
}

//FAZER PLACAR!!!!