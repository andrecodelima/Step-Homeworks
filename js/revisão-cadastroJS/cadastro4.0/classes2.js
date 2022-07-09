// Cadastro de Alunos

class Estudante{
    nome
    dataNascimento
    turma
    turno
}

var sala = [] // Criacao de array

var aluno = new Estudante() // Criacao de Objeto

var InputNome = document.getElementById('nome')
var InputNascimento = document.getElementById('nascimento')
var InputTurma = document.getElementById('turma')
var InputTurno = document.getElementById('turno')

function cadastrar(){
    aluno.nome = InputNome.value  // Aqui atribuímos as propriedades do objeto os valores dos inputs.
    // Atributo nome do objeto aluno recebe valor do InputNome.

    aluno.dataNascimento = InputNascimento.value
    aluno.turma = InputTurma.value
    aluno.turno = InputTurno.value

    sala.push(aluno.nome, aluno.dataNascimento, aluno.turma, aluno.turno)

    // alert(`Nome: ${sala[0]}`)// Dá certo mas é trabalhoso, especialmente se houver muitos registros.

    exibir()
}

function exibir(){
    let card = ''
    for(c=0; c<sala.length; c++){
        //Fazendo o acesso e exibição dos atributos do objeto.
        card = (`Nome: ${aluno.nome} 
                 Turma: ${aluno.turma}
                 Sala: ${sala}<br>`) //Exibindo o array
                 
    }document.getElementById('resposta').innerHTML += card
}