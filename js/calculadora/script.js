const valorTela = document.getElementById('visor'); //Recebe os valores da tela
var tela2 = ''; // Recebe os valores da segunda tela
var valor2 = 0;
var operador = '';



function btn_numero(numero){
   valorTela.value += numero; //Recebe o valor digitado e soma o valor atual da tela.
                        //Como no primeiro momento o valor da tela é 0, soma é 0 + num digitado.
    document.getElementById('telasec').innerHTML = valorTela.value;
    valorantigo = valorTela.value;
    }

function btn_operador(op){
    valor2 = Number(valorTela.value); //Armazena o valor digitado.
    operador = op;
    tela2 = document.getElementById('telasec').innerHTML = valorTela.value + operador;
    valorTela.value = '';//Limpa o valor da tela1 após a operação.
}

function igual(){
    let total = 0; //Inicialização da variavel total;
    if(operador == '+'){
        total = Number(valorTela.value) + valor2;
        valorTela.value = total;
    }else if(operador == '-'){
        total = Number(valorTela.value) - valor2;
        valorTela.value = total;
    }else if(operador == 'x'){
        total = Number(valorTela.value) * valor2;
        valorTela.value = total;
    }else if(operador == '/'){
        total = Number(valorTela.value) / valor2;
        valorTela.value = total;
    }

}



