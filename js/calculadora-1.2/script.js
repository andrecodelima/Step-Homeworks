var tela = document.getElementById('visor');
var telab = document.getElementById('visor');
var tela2 = document.getElementById('telasec');
var valor = 0;
var total = 0;
var operacao = '';

// Digita numero e guarda
function btn_numero(numero){
    if(tela.value != ''){
        telab.value = numero;
    }else if(tela.value == ''){
        tela.value = numero;
    }
    
    tela2.innerHTML = tela.value + '+' + telab.value;

}

// Realiza a operacao
function btn_operador(op){
    operacao = op;
    valor = Number(telab.value);
    tela.value = '';
}

function igual(){
    if (operacao == '+'){
        total = valor + Number(tela.value);
        tela.value = total;
    }
}

// function mostra(){

// }

// function exibir(){
//     alert(valor + operacao + tela.value);    
// }
