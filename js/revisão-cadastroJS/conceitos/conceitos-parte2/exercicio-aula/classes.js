
//// EXERCÍCIO  ////

/*
    Crie uma página contatos.html, que possua um formulário para cadastro, com nome, telefone e e-mail.
    Exiba os cards cadastrados abaixo do formulário.
    USE CLASSES COM CONSTRUTORES E FUNCTIONS.
*/

class Cadastro{
    constructor(p_nome, p_telefone, p_email){
        this.nome       = p_nome        // 'p_nome' é uma variavel global que está sendo passada como parâmetro.
        this.telefone   = p_telefone    // 'p_telefone' é uma variavel global que está sendo passada como parâmetro.
        this.email      = p_email       // 'p_email' é uma variavel global que está sendo passada como parâmetro.
    }

}

var arquivo = []

var p_nome           = document.getElementById('nome') 
var p_email          = document.getElementById('email')
var p_telefone       = document.getElementById('telefone')


function cadastrar(){
    arquivo.push(new Cadastro(p_nome.value, p_telefone.value, p_email.value)) // Inicializando ou tornando o indice desse array um objeto.
}

function exibir(){
    let card = (`<div class="divContato">
                    Nome: ${this.nome}
                </div>`)
    return card
}document.getElementById('resposta').innerHTML += card












    /*
        O array arquivo recebeu um objeto no seu índice inicial.
        Esse objeto que foi criado a partir da classe Cadastro, recebeu os parâmetros que por sua vez,
        receberam os valores do html.
    */

    // Exemplificando
    // arquivo[0] = new Cadastro)
