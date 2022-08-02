/////////////////////// CADASTRO DE VEÍCULOS \\\\\\\\\\\\\\\\\\\\\\\\
        
    /*|------- CRIAÇÃO DE CLASSE - INÍCIO ------ |*/
    
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

    cardBarco = function(){
        let card = "<div class='card'>"                       + 

                        "Tipo: "          + this.tipo         + "<br>"   +
                        "Modelo: "        + this.modelo       + "<br>"   +
                        "Cor: "           + this.cor          + "<br>"   +
                        "Fabricante: "    + this.fabricante   + "<br>"   +
                        "Pés: "           + this.pes          + "<br>"   +
            
                    "</div>"
        return card
    }


}
    /*|------- CRIAÇÃO DE CLASSE - FIM ------ |*/

    /*|------- VAR GLOBAIS - INÍCIO ------ |*/

var bancoCarro           = []
var bancoMoto            = []
var bancoBarco           = []

var tipo            = document.getElementById('inputTipo')
var modelo          = document.getElementById('inputModelo')
var cor             = document.getElementById('inputCor')
var fabricante      = document.getElementById('inputFaber')
var cilindrada      = document.getElementById('inputCilindrada')
var pes             = document.getElementById('inputPes')

var limpa           = document.getElementById('formulario')
var div             = document.getElementById('resposta')



    /*|------- FUNÇÕES GLOBAIS  ------ |*/

    /*|------- FUNÇÃO CADASTRAR ------ |*/

function cadastrar(){
    
    switch(tipo.value){
        case "carro":
            bancoCarro.push(new Cadastro(tipo.value, modelo.value, cor.value, fabricante.value))
            tipo.setAttribute('enable')
            banco.push(bancoCarro)
            break

        case "moto":
            bancoMoto.push(new Cadastro(tipo.value, modelo.value, cor.value, fabricante.value, cilindrada.value))
            tipo.setAttribute('enable')
            banco.push(bancoMoto)
            break

        case "barco": 
            bancoBarco.push(new Cadastro(tipo.value, modelo.value, cor.value, fabricante.value, pes.value))
            tipo.setAttribute('enable')
            banco.push(bancoBarco)
            break

        default:
            alert('Tipo de veículo inválido')
    }
    
    
}


    /*|------- FUNÇÃO EXIBIR ------ |*/

function exibir(){
    let tipo = document.getElementById('inputTipo')
    let cartoes = ''

    switch(tipo.value){
        
        case 'carro':        
            for(c in bancoCarro){
                cartoes += (bancoCarro[c].cardCarro())
            } 

        case 'moto':
            for(c in bancoMoto){
                cartoes += (bancoMoto[c].cardMoto())
            } 
        break

        case 'barco':
            for(c in bancoBarco){
                cartoes += (bancoBarco[c].cardBarco())
            } 
        break

        default:
            alert('Exiba um cadastro válido')
    }
    limpa.reset()
    div.innerHTML = cartoes
}


    /*|------- FUNÇÃO EXIBIR TIPO ------ |*/

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
