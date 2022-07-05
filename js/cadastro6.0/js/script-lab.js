
class ClienteModelo{
    constructor(conta, agencia, nome, tipoConta, cpf){ // Passando parâmetros ao construtor.
        // this.conta = conta // Traduz esse this pfv.
        // this.agencia = agencia
        // this.nome = nome
        // this.tipoConta = tipoConta  
        // this.cpf = cpf
    }

}

var banco = []
nome      =        document.getElementById('inputNome') 
// nome, que foi declarado na classe' recebe o valor do inputNome 
conta     =        document.getElementById('inputConta')
// agencia   =        document.getElementById('inputAgencia')  .value
// tipoConta =        document.getElementById('inputTipo')     .value
// cpf       =        document.getElementById('inputCpf')      .value


function cadastrar(){
    banco.push(nome.value, conta.value)
    alert(banco)
}





















// // Var Globais
// var banco           =      []
// var nome        =      document.getElementById('InputNome') 
// var conta       =      document.getElementById('inputConta')
// var agencia     =      document.getElementById('inputAgencia')
// var tipo        =      document.getElementById('inputTipo')


// function cadastrar(){
//     // var cliente = new ClienteModelo()

//     banco.push(new ClienteModelo(nome.value, // Inicializei o objeto no array
//                                  conta.value,
//                                  agencia.value,
//                                  tipo.value))

//     exibir()
// }


// function exibir(){
//     for(c=0; c<=banco.length; c++){
//         var card = (`<div class="resposta card" >
//                       Nome: ${nome}<br>
//                       Conta: ${conta} <br>
//                       Agencia: ${agencia}<br>
//                       Tipo da Conta: ${tipo}
//                       </div>`)
//     }document.getElementById('resposta').innerHTML += card                   
    
// }