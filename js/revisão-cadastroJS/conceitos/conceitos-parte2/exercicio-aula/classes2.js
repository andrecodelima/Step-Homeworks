
//// EXERCÍCIO  ////

/*
    Crie uma página contatos.html, que possua um formulário para cadastro, com nome, telefone e e-mail.
    Exiba os cards cadastrados abaixo do formulário.
    USE CLASSES COM CONSTRUTORES E FUNCTIONS.
*/

class Cadastro{
    constructor(p_nome, p_telefone, p_email){
        this.nome       = p_nome         
        this.telefone   = p_telefone     
        this.email      = p_email       
    }

    card = function(){
        let card = (`<div class="divContato">
                         Nome: ${this.nome}
                    </div>`)
        return card
    }
}

var arquivo = []

var p_nome           = document.getElementById('nome') 
var p_email          = document.getElementById('email')
var p_telefone       = document.getElementById('telefone')


function cadastrar(){
    arquivo.push(new Cadastro(p_nome.value, p_telefone.value, p_email.value))  
    document.getElementById('Form-Cadastro').reset()
}

function exibir(){
    document.getElementById('resposta').innerHTML = ''
    for(c=0; c<arquivo.length; c++){
        document.getElementById('resposta').innerHTML += arquivo[c].card()
    }
} 










 