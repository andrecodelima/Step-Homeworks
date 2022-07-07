
class Equipamento{
    constructor(p_nome){
        this.nome = p_nome
    }

    
}

// Variaveis Globais

var estoque = []
InputNome = document.getElementById('inputNome')


// Funções  Globais

function cadastrar(){
    // Usando o Objeto
    estoque.push(new Equipamento(inputNome.value))
    // O inputNome envia o valor para o parametro do construtor
    console.log(`Nome: ${this.nome}`)
    // O this. referencia o valor na classe

}



function exibir(){
    
    for(c=0; c<= estoque.length; c++){
        var card = (`<div class="col-md-2 card">

                    Nome:       ${this.nome}
                    
                </div>`)
    }
    document.getElementById('resposta').innerHTML += card
}