
class ClienteModelo{
    constructor(conta, agencia, nome, tipoConta){
        this.conta = conta
        this.agencia = agencia
        this.nome = nome
        this.tipoConta = tipoConta  
        
    }
}

var banco = []

function cadastrar(){
    var cliente = new ClienteModelo()

    cliente.nome = document.getElementById('inputNome').value
    cliente.conta = document.getElementById('inputConta').value
    cliente.agencia = document.getElementById('inputAgencia').value
    cliente.tipoConta = document.getElementById('inputTipo').value

    banco.push(cliente.nome, cliente.conta, cliente.agencia, cliente.tipoConta)

    document.getElementById('inputNome').value = ''
    document.getElementById('inputConta').value = ''
    document.getElementById('inputAgencia').value = ''
    document.getElementById('inputTipo').value = ''

    exibir()

    // for(c=0; c<= banco.length; c++){

    //             var card = (`<div class="col-md-2 card">
    //                             Titular:            ${cliente.nome}         <br>
    //                             Conta:              ${cliente.conta}        <br>
    //                             Agência:            ${cliente.agencia}      <br>
    //                             Tipo de Conta:      ${cliente.tipoConta}
    //                         </div>`)
    //         }
    // document.getElementById('resposta').innerHTML += card

}



function exibir(){
    for(c=0; c<= banco.length; c++){
        var card = (`<div class="col-md-2 card">
                        Titular: ${c.nome}
                        Conta: ${c.conta}
                        Agência: ${c.agencia}
                        Tipo de Conta: ${c.tipoConta}
                    </div>`)
    }
    document.getElementById('resposta').innerHTML += card //0 + 1 ; 1 + 1 ...
}

