////////////////// CADASTRO DO FORM - INÍCIO \\\\\\\\\\\\\\\\
class Cadastro{
    constructor(pTipo, pModelo, pCor, pFabricante, pCilindrada, pPes){

        this.tipo           = pTipo
        this.modelo         = pModelo
        this.cor            = pCor
        this.fabricante     = pFabricante
        this.cilindrada     = pCilindrada
        this.pes            = pPes

    }

    cardCarro = function(){
        let card = "<div class='card'>"                       + 

                        "Tipo: "          + this.tipo         + "<br>"   +
                        "Modelo: "        + this.modelo       + "<br>"   +
                        "Cor: "           + this.cor          + "<br>"   +
                        "Fabricante: "    + this.fabricante   + "<br>"   +
            
                    "</div>"
        return card
    }

    cardMoto = function(){
        let card = "<div class='card'>"                       + 

                        "Tipo: "          + this.tipo         + "<br>"   +
                        "Modelo: "        + this.modelo       + "<br>"   +
                        "Cor: "           + this.cor          + "<br>"   +
                        "Fabricante: "    + this.fabricante   + "<br>"   +
                        "Cilindadras: "   + this.cilindrada   + "<br>"   +

                    "</div>"
        return card
    }

    // barco = function(){
    //     let card = "<div class='card'>"                       + 

    //                     "Tipo: "          + this.tipo         + "<br>"   +
    //                     "Modelo: "        + this.modelo       + "<br>"   +
    //                     "Cor: "           + this.cor          + "<br>"   +
    //                     "Fabricante: "    + this.fabricante   + "<br>"   +
    //                     "Pés: "           + this.pes          + "<br>"   +
            
    //                 "</div>"
    //     return card
    // }


}

var banco           = []

var tipo            = document.getElementById('inputTipo')
var modelo          = document.getElementById('inputModelo')
var cor             = document.getElementById('inputCor')
var fabricante      = document.getElementById('inputFaber')
var cilindrada      = document.getElementById('inputCilindrada')
var pes             = document.getElementById('inputPes')

var limpa           = document.getElementById('formulario')
var div             = document.getElementById('resposta')
var tipo            = document.getElementById('inputTipo')


function cadastrar(){

    switch(tipo.value){
        case "carro":
            banco.push(new Cadastro(tipo.value, modelo.value, cor.value, fabricante.value))
            break

        case "moto":
            banco.push(new Cadastro(tipo.value, modelo.value, cor.value, fabricante.value, cilindrada.value))
            break

        case "barco": 
            banco.push(new Cadastro(tipo.value, modelo.value, cor.value, fabricante.value, pes.value))
            break

        default:
            alert('Tipo de veículo inválido')
    }
    
    limpa.reset()
}

function exibir(){
    let tipo = document.getElementById('inputTipo')
    let cartoes = ''

    if(tipo = 'carro'){

        for(c in banco){
            cartoes += (banco[c].cardCarro())
            div.innerHTML = cartoes
        }
    }else if(tipo = 'moto'){
        for(c in banco){
            cartoes += (banco[c].cardMoto())
            div.innerHTML = cartoes
        }

    }

    // if(tipo = 'moto'){
    //     for(c in banco){
    //         cartoes += (banco[c].cardMoto())
    //     }div.innerHTML = cartoes
    // }

    // switch(tipo.value){
        
    //     case 'carro':        
    //         for(c in banco){
    //             cartoes += (banco[c].cardCarro())
    //         }div.innerHTML = cartoes
    //     break

    //     case 'moto':
    //         for(c in banco){
    //             cartoes += (banco[c].cardMoto())
    //         }div.innerHTML = cartoes
    //     break

    //     // case 'barco':
    //     //     for(c in banco){
    //     //         cartoes += (banco[c].barco())
    //     //     }div.innerHTML = cartoes
    //     // break
    // }

}

////////////////// CADASTRO DO FORM - FIM \\\\\\\\\\\\\\\\

/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

////////////////// OUTRAS FUNÇÕES \\\\\\\\\\\\\\\\



function exibirTipo(){
    let divMoto = document.getElementById('box-moto')
    let divBarco = document.getElementById('box-barco')
    let tipo = document.getElementById('inputTipo')
   
    switch(tipo.value){
        case 'moto':
            divMoto.style.display = 'block'
            divBarco.style.display = 'none'
        break

        case 'barco':
            divMoto.style.display = 'none'
            divBarco.style.display = 'block'
        break

        case 'carro':
            divMoto.style.display = 'none'
            divBarco.style.display = 'none'
        break
   }
}
