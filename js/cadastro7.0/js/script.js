
class Equipamento{
    constructor(p_nome, p_atividade, p_descricao, p_preco){
        this.nome = p_nome
        this.atividade = p_atividade
        this.descricao = p_descricao
        this.preco = p_preco
    }
}

// Variaveis Globais

var estoque = []

InputNome = document.getElementById('inputNome')
InputAtividade = document.getElementById('inputTipo')
InputDescricao = document.getElementById('inputDescricao')
InputPreco = document.getElementById('inputPreco')


// Funções  Globais

function cadastrar(){
    // Usando o Objeto
    estoque.push(new Equipamento(inputNome, InputAtividade, InputDescricao, InputPreco))
    // O inputNome envia o valor para o parametro do construtor
    console.log(`Nome: ${this.nome}`)
    // O this. referencia o valor na classe

}

function exibir(){
    for(c in estoque){
        var card = (`<div class="col-md-2 card">
                    Nome: 
                </div>`)
    }
}document.getElementById('resposta').innerHTML = card