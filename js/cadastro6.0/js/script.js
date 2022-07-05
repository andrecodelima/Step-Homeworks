
class ClienteModelo{
    constructor(conta, agencia, nome, tipoConta, cpf){
        this.s = conta
        this.agencia = agencia
        this.nome = nome
        this.tipoConta = tipoConta  
        this.cpf = cpf
        
    }
}

   
function cadastrar(){
    
    var banco = []
    var cliente = new ClienteModelo()

    cliente.nome =      document.getElementById('inputNome')    .value    
    cliente.conta =     document.getElementById('inputConta')   .value
    cliente.agencia =   document.getElementById('inputAgencia') .value
    cliente.tipoConta = document.getElementById('inputTipo')    .value
    cliente.cpf =       document.getElementById('inputCpf')     .value

    banco.push(cliente.nome, cliente.conta, cliente.agencia, cliente.tipoConta)

    document.getElementById('inputNome')    .value = ''
    document.getElementById('inputConta')   .value = ''
    document.getElementById('inputAgencia') .value = ''
    document.getElementById('inputTipo')    .value = ''

    // exibir()

    for(c=0; c<= banco.length; c++){
        var card = (`<div class="col-md-2 card">
                        Titular:        ${cliente.nome}           <br>
                        Conta:          ${cliente.conta}            <br>
                        Agência:        ${cliente.agencia}          <br>
                        Tipo de Conta:  ${cliente.tipoConta}
                    </div>`)
    }
    document.getElementById('resposta').innerHTML += card //0 + 1 ; 1 + 1 ...



}

// function exibir(){
//     for(c=0; c<= banco.length; c++){
//         var card = (`<div class="col-md-2 card">
//                         Titular:        ${cliente.nome}           <br>
//                         Conta:          ${cliente.conta}            <br>
//                         Agência:        ${cliente.agencia}          <br>
//                         Tipo de Conta:  ${cliente.tipoConta}
//                     </div>`)
//     }
//     document.getElementById('resposta').innerHTML += card //0 + 1 ; 1 + 1 ...
// }

