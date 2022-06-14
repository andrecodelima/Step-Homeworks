

function play(){
    var tentativas = [] // Número de tentativas
    var escolhas_PC = [] // Escolhas 'Feitas' pelo PC.
    var i = 1;

    var pc_win = []
    var jogador_win = []
    var pc_loser = []
    var jogador_loser = []
    var empate = []

    for(let i=1; i<4; i++){
        jogador = window.prompt("Seja bem-vido ao Pedra | Papel | Tesoura." + "\n"
                        + "Para escolher 'Pedra - Digite [1]'" + "\n"
                        + "Para escolher 'Papel - Digite [2]'" + "\n"
                        + "Para escolher 'Tesoura - Digite [3]'" + "\n" + "\n"
                        +  `${i}º Tentativa`);

        pc = Math.floor((Math.random()*3)+1) // pc recebe um número aleatorio entre 1 e 3
        // disputa()
    
        //PEDRA
        if(jogador == 0 || jogador >3 || jogador == NaN){
            jogador = window.prompt("Digite um número entre 1 e 3: ")
        }else{
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
            }       jogador_win.push(1)
                    pc_loser.push(1)
                    continue
        }
        
        //PAPEL
        if(jogador == 0 || jogador >3 || jogador == NaN){
            jogador = window.prompt("Digite um número entre 1 e 3: ")
        }else{
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
            }       pc_win.push(1)
                    jogador_loser.push(1)
                    continue
        }
    
        
        //TESOURA
        if(jogador == 0 || jogador >3 || jogador == NaN){
            jogador = window.prompt("Digite um número entre 1 e 3: ")
        }else{
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
    
        tentativas.push(i) // contador i é enviado ao array 'tentativas'
        escolhas_PC.push(pc) // pc é enviado ao array 'escolhas pc'

        // PLACAR
document.getElementById("win").innerHTML=(jogador_win.length);
document.getElementById("los").innerHTML=(jogador_loser.length);
document.getElementById("empt").innerHTML=(empate.length);

}  

// function jogo(){
//     var tentativas = []
//     for(let i=1; i<4; i++){
//         pc = Math.floor((Math.random()*3)+1)
//         tentativas.push(i)
//     }
//  document.write(tentativas)   
// }




// FUNÇÃO COM AS CONDIÇÕES DE CADA ESCOLHA DO JOGADOR E RESPOSTA CORRESPONDENTE DO PC


// function disputa(){
//     var pc_win = []
//     var jogador_win = []
//     var pc_loser = []
//     var jogador_loser = []
//     var empate = []

//     //PEDRA
//     if(jogador == 0 || jogador >3 || jogador == NaN){
//         jogador = window.prompt("Digite um número entre 1 e 3: ")
//     }else{
//         if(jogador == 1 && pc == 1){
//             alert(`<EMPATE!\n
//                  Você escolheu: Pedra e Computador escolheu: Pedra`)
//                  let E = 1
//                  empate.push(E)

//         }else if(jogador == 1 && pc == 2){
//             alert(`Você PERDEU!\n
//             Você escolheu: Pedra e Computador escolheu: Papel`)
//                 let V = 1
//                 let L = 1
//                 pc_win.push(V)
//                 jogador_loser.push(L)

//         }else if(jogador == 1 && pc == 3){
//             alert(`Você VENCEU! \n
//                  Você escolheu: Pedra e Computador escolheu: Tesoura`)
//         }       jogador_win.push(1)
//                 pc_loser.push(1)

//     }
    
//     //PAPEL
//     if(jogador == 0 || jogador >3 || jogador == NaN){
//         jogador = window.prompt("Digite um número entre 1 e 3: ")
//     }else{
//         if(jogador == 2 && pc == 1){
//             alert(`Você GANHOU! \n
//                  Você escolheu: Papel e Computador escolheu: Pedra`)
//                  jogador_win.push(1)
//                  pc_loser.push(1)

//         }else if(jogador == 2 && pc == 2){
//             alert(`EMPATE! \n
//             Você escolheu: Papel e Computador escolheu: Papel`)
//                 empate.push(1)

//         }else if(jogador == 2 && pc == 3){
//             alert(`Você PERDEU! \n
//                  Você escolheu: Papel e Computador escolheu: Tesoura`)
//         }       pc_win.push(1)
//                 jogador_loser.push(1)
//     }

    
//     //TESOURA
//     if(jogador == 0 || jogador >3 || jogador == NaN){
//         jogador = window.prompt("Digite um número entre 1 e 3: ")
//     }else{
//         if(jogador == 3 && pc == 1){
//             alert(`Você PERDEU! \n
//                     Você escolheu: Tesoura e Computador escolheu: Pedra`)
//                 pc_win.push(1)
//                 jogador_loser.push(1)

//         }else if(jogador == 3 && pc == 2){
//             alert(`Você VENCEU! \n
//             Você escolheu: Tesoura e Computador escolheu: Papel`)
//                 jogador_win.push(1)
//                 pc_loser.push(1)

//         }else if(jogador == 3 && pc == 3){
//             alert(`EMPATE! \n
//                     Você escolheu: Tesoura e Computador escolheu: Tesoura`)
//                     empate.push(1)
//         }  
//     }
// }

//FAZER PLACAR!!!



///////////////////////////////////////////////////////////////////////////////////////////

// TESTES
// function play(){
//     var tentativas = []
//     var banco = [] // Escolhas 'Feitas' pelo PC.
//     for(let i=1; i<4; i++){
//         jogador = window.prompt("Seja bem-vido ao Pedra | Papel | Tesoura." + "\n"
//                         + "Para escolher 'Pedra - Digite [1]'" + "\n"
//                         + "Para escolher 'Papel - Digite [2]'" + "\n"
//                         + "Para escolher 'Tesoura - Digite [3]'" + "\n" + "\n"
//                         +  `${i}º Tentativa`);
//         pc = Math.floor((Math.random()*3)+1)
//         disputa()
//         tentativas.push(i)
//         banco.push(pc)
//     }
//  document.write(`Tentativas: ${tentativas.length} <br>
//                 PC: ${banco} <br>
//                 Vitorias do PC: ${pc_win} <br>
//                 Vitórias do Jogador: ${jogador_win}<br>
//                 Empates: ${empate}`)   
// }