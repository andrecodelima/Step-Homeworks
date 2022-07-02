
function Tabuada(n){
    n = Number(window.prompt('Entre 1 e 10, escolha um número para a tabuada: '))
    for(let c = 1; c<11; c++){
        document.write(n + ' X ' + c + ' = ' + (n*c) + '<br><br>')
    }
}

Tabuada()


