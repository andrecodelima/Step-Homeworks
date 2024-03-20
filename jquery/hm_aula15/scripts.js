class Carro{
    constructor(modelo, fabricante, cor, placa, valor){

        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.placa = placa;
        this.valor = valor;

    }

    cadastroExibido() {
        
        let card = '<div class="card">' + 

                        "Modelo: "      + this.modelo           + "</br>" + 
                        "Fabricante: "  + this.fabricante       + "</br>" +
                        "Cor: "         + this.cor              + "</br>" +
                        "Placa: "       + this.placa            + "</br>" +
                        "Valor: "       + this.valor            + "</br>" +

                    '</div>';
        return card;
    }
}

var listaCarro          = [];
var formulario          = document.getElementById('formulario');
var divCard             = document.getElementById('resposta');

let inputModelo         = document.getElementById('modelo');
let inputFabricante     = document.getElementById('fabricante');
let inputCor            = document.getElementById('cor');
let inputPlaca          = document.getElementById('placa');
let inputValor          = document.getElementById('valor');

function cadastrar(){

    listaCarro.push(new Carro(
                              inputModelo.value,
                              inputFabricante.value,
                              inputCor.value,
                              inputPlaca.value,
                              inputValor.value)
                    )

    formulario.reset();
}

function exibir(){
    let cartoes = '';

    if(listaCarro.length == 0){
        alert('Não há carros cadastrados')
    }else{
        for(let i in listaCarro){

            cartoes += listaCarro[i].cadastroExibido();
        }
    
        divCard.innerHTML = cartoes;
        
    }

    console.log(listaCarro)
}

