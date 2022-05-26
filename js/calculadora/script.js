const visor = document.getElementById("visor");
var operador = "";
var valor1 = 0;


function btn_numero(numero){
    visor.value += numero;
}


function btn_operador(op){
    valor1 = Number(visor.value);
    operador = op;
    visor.value = "";
}

function ponto(p){
   if(visor.value == ','){
       p.replace(',', '.');
   }
}
  
function limpe(){
    visor.value = "";
}

function igual(){
    let total = 0;
    if(operador == '+'){
        total = valor1 + Number(visor.value);
        visor.value = total;

    }else if(operador == '-'){
        total = valor1 - Number(visor.value);
        visor.value = total;
    }else if(operador == 'x'){
        total = valor1 * Number(visor.value);
        visor.value = total;
    }else if(operador == '/'){
        total = valor1 / Number(visor.value);
        visor.value = total;
    }else if(operador == '√'){
        total = (Math.sqrt(valor1, 2))
        visor.value = total;
    }else if(operador == 'x²'){
        total = (Math.pow(valor1, 2))
        visor.value = total;
    }
}



