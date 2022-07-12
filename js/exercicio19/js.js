
// CONTAGEM REGRESSIVA
var contagem
function msg(){
    var valor = Number(document.getElementById('valor').value)
    contagem = setInterval(function(){
        time = document.getElementById('resp1').innerHTML = valor--
        if(time == 0){
            parar()
            document.getElementById('form').reset()
        }
    },1000)

}

function parar(){
    clearInterval(contagem)
}


// CAIXAS 


setTimeout(function(){
    let caixa1 = document.getElementById('box1')
    let caixa2 = document.getElementById('box2')
    let caixa3 = document.getElementById('box3')
    let caixa4 = document.getElementById('box4')
    
    caixa1.style.backgroundColor = 'black'

    setInterval(function(){

        if(caixa1.style.backgroundColor == 'black'){
            caixa2.style.backgroundColor = 'yellow'
        }else if(caixa2.style.backgroundColor == 'yellow'){
            alert(2)
        }

    },1000)
},1000)


