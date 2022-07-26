
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


var divResposta     = document.getElementById('resposta')

var inputTitular    = document.getElementById('inputNome')
var Cpf        = document.getElementById('inputCpf')
var inputConta      = document.getElementById('inputConta')
var inputAgencia    = document.getElementById('inputAgencia')
var inputTipo       = document.getElementById('inputTipo')

var limpaForm       = document.getElementById('formConta')
var banco           = []

function cadastrar(){
    
    // for(let c in banco){
    //     if(banco[c].Cpf == Cpf.value){
    //         alert("Não pode ter duas contas com o mesmo CPF.")
    //         return;
    //     }

    // }
    for(let c in banco){
        if(banco[c].Cpf == Cpf.value){
            alert("Não pode ter duas contas com o mesmo CPF.")
            return;
        }else{
            alert('!')
        }
        //ao usar o && as duas, ou mais, condições precisam ser verdade
        // if(contas[c].conta == conta.value && contas[c].agencia == agencia.value){
        //     alert("Não pode ter duas contas com o mesmo número e agência.")
        //     return;
        // }
    }

    banco.push(new cadastro(inputConta.value, inputAgencia.value, inputTitular.value, inputTipo.value, Cpf.value))
    

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

