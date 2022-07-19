
var Ursos = [
                './img/urso1.png',
                './img/urso2.png',
                './img/urso3.png'
            ]


var imgUrso = document.getElementById('img-urso')
var quadroAtual = 1
var margemTela = 0
var timer
largura = innerWidth, h = innerHeight

// imgUrso.style.marginLeft = '1px'

setTimeout(function(){
    // subir()
    if(quadroAtual % 2 == 0){
        imgUrso.src = Ursos[0]
        quadroAtual ++
    }else{
        imgUrso.src = Ursos[1]
        quadroAtual ++
    }

    timer = setInterval(function(){
        if(quadroAtual % 2 == 0){
            imgUrso.src = Ursos[0]
            quadroAtual ++
        }else{
            imgUrso.src = Ursos[1]
            quadroAtual ++
        }

        imgUrso.style.marginLeft = margemTela + 'px'
        margemTela += 10
        
        // 1356 - Ponto 0  
        // 726  - Ponto final
        if(margemTela >= largura - 1356){
            imgUrso.style.marginTop = '350px'
        }

        if(margemTela >= largura - 1276){
            imgUrso.style.marginTop ='325px'
        }

        
        if(margemTela >= largura - 1196){
            imgUrso.style.marginTop ='285px'
        }

        if(margemTela >= largura - 1106){
            imgUrso.style.marginTop ='225px'
        }

        
        if(margemTela >= largura - 1036){
            imgUrso.style.marginTop ='180px'
        }

        if(margemTela >= largura - 966){
            imgUrso.style.marginTop ='125px'
        }

        if(margemTela >= largura - 886){
            imgUrso.style.marginTop ='55px'
        }

        if(margemTela >= largura - 786){
            imgUrso.style.marginTop ='0px'
            if(margemTela >= largura - 760){
                imgUrso.style.marginLeft = margemTela + 'px'
                margemTela -= 20
                imgUrso.style.marginTop = '55px'
            }
        }


    },200)

},1000)



console.log(innerWidth)