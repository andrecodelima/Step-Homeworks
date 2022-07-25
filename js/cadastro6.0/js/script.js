
class cadastro{
    constructor(pConta, pAgencia, pTitular, pTipo, pCpf){

        this.conta      = pConta
        this.agencia    = pAgencia
        this.titular    = pTitular
        this.tipo       = pTipo
        this.cpf        = pCpf
               
    }

    card = function(){
        let cartao = '<div class = "card">'               +  
                     
                            'Titular: ' + this.titular    + '<br>' +
                            'Agência: ' + this.agencia    + '<br>' +
                            'Conta: '   + this.conta      + '<br>' +
                            'Tipo: '    + this.tipo       + '<br>' +
                            'CPF: '     + this.cpf        + '<br>' +

                     '</div>'
        
        return cartao
    }


}


var banco           = []
var divResposta     = document.getElementById('resposta')

var inputTitular    = document.getElementById('inputNome')
var inputCpf        = document.getElementById('inputCpf')
var inputConta      = document.getElementById('inputConta')
var inputAgencia    = document.getElementById('inputAgencia')
var inputTipo       = document.getElementById('inputTipo')

var limpaForm       = document.getElementById('formConta')

function cadastrar(){
    
    while(banco.indexOf(banco[4] = -1)){
        alert('!')
    }
    banco.push(new cadastro(inputConta.value,
                            inputAgencia.value,
                            inputTitular.value,
                            inputTipo.value,
                            inputCpf.value)
                )
    
    
    limpaForm.reset()
}

function exibir(){
    let cartoes = ''

    for(let c in banco){ // c pega os indices do array banco
        cartoes += banco[c].card()

    }
    divResposta.innerHTML = cartoes
    console.log(banco)

}

