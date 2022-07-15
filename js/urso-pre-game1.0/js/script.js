
var Ursos = [
                './img/urso1.png',
                './img/urso2.png',
                './img/urso3.png'
            ]


var imgUrso = document.getElementById('img-urso')
var quadroAtual = 1
var margem = 10
var timer
w = innerWidth, h = innerHeight



setTimeout(function(){
    timer = setInterval(function(){
        if(quadroAtual % 2 == 0){
            imgUrso.src = Ursos[0]
            quadroAtual ++
            imgUrso.style.marginLeft = '10px'

        }else{
           imgUrso.src = Ursos[1]
           quadroAtual ++
        }

        imgUrso.style.marginLeft = margem + 'px'
        margem += 10

        if(margem >= w-800){
            clearInterval(timer)

            setTimeout(function(){
                timer = setInterval(function(){
                    if(quadroAtual % 2 == 0){
                        imgUrso.src = Ursos[0]
                        quadroAtual ++
                        imgUrso.style.marginLeft = '10px'
            
                    }else{
                       imgUrso.src = Ursos[1]
                       quadroAtual ++
                    }

                    imgUrso.style.marginLeft = margem + 'px'
                    margem -= 10

                },500)

                
            },1000)
        }

    },500)
    
},2000)
parar()

function parar(){
    clearInterval(timer)
}

function denovo(){
    
setTimeout(function(){
    timer = setInterval(function(){
        if(quadroAtual % 2 == 0){
            imgUrso.src = Ursos[0]
            quadroAtual ++
            imgUrso.style.marginLeft = '10px'

        }else{
           imgUrso.src = Ursos[1]
           quadroAtual ++
        }

        imgUrso.style.marginLeft = margem + 'px'
        margem += 10

        if(margem >= w-800){
            clearInterval(timer)

            setTimeout(function(){
                timer = setInterval(function(){
                    if(quadroAtual % 2 == 0){
                        imgUrso.src = Ursos[0]
                        quadroAtual ++
                        imgUrso.style.marginLeft = '10px'
            
                    }else{
                       imgUrso.src = Ursos[1]
                       quadroAtual ++
                    }

                    imgUrso.style.marginLeft = margem + 'px'
                    margem -= 10

                },500)

                
            },1000)
        }

    },500)
    
},2000)
}