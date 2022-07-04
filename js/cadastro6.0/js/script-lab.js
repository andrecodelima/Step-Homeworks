
class ClienteModelo{
    constructor(conta, agencia, nome, tipoConta){
        this.conta = conta
        this.agencia = agencia
        this.nome = nome
        this.tipoConta = tipoConta  
        
    }
}

// Globais
var banco           =      []
cadastroNome        =      document.getElementById('InputNome').value
cadastroConta       =      document.getElementById('inputConta').value
cadastroAgencia     =      document.getElementById('inputAgencia').value
cadastroTipo        =      document.getElementById('inputTipo').value


function cadastrar(){
    // var cliente = new ClienteModelo()
    banco.push(new ClienteModelo(cadastroNome, // Inicializei o objeto no array
                                 cadastroConta,
                                 cadastroAgencia,
                                 cadastroTipo))
}
