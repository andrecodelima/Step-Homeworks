
var Ursos = [
                '../img/urso1.png',
                '../img/urso2.png',
                '../img/urso3.png'
            ]


var imgUrso = document.getElementById('img-urso')
var quadroAtual = 1
var margem = 1
var timer
w = innerWidth, h = innerHeight

imgUrso.style.marginLeft = '1px'

setTimeout(function(){
    timer = setInterval(function(){
        if(quadroAtual % 2 == 0){
            imgUrso.src = Ursos[0]
            quadroAtual ++  
            imgUrso.style.marginTop = '415px'
            
            if(imgUrso.style.marginTop = '415px'){
                imgUrso.style.marginLeft = '24px'
            }

        }else{
            
           imgUrso.src = Ursos[1]
           quadroAtual ++
        }

        imgUrso.style.marginLeft = margem + 'px'
        margem += 10

        if(margem >= w - 1380){
            imgUrso.style.marginTop = '350px'
        }

        if(margem >= w - 1290){
            // alert(1)
            imgUrso.style.marginTop = '320px'
        }

        if(margem >= w - 1200){
            // alert(1)
            imgUrso.style.marginTop = '285px'
        }

        if(margem >= w - 1125){
            // alert(1)
            imgUrso.style.marginTop = '240px'
        }

        if(margem >= w - 1035){
            // alert(1)
            imgUrso.style.marginTop = '190px'
        }

        if(margem >= w - 955){
            // alert(1)
            imgUrso.style.marginTop = '125px'
        }

        if(margem >= w - 875){
            // alert(1)
            imgUrso.style.marginTop = '60px'
        }

        if(margem >= w - 795){
            // alert(1)
            imgUrso.style.marginTop = '0px'
        }

        if(margem >= w - 765){
            clearInterval(timer)
            alert('PARABÉNS VOCÊ VENCEU!')
        }

    },500)

},1000)



