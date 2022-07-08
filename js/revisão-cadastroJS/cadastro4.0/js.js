// 1º Forma

class AlunoModelo{
    nome
    dataNascimento
    turma
    turno
}

var aluno = new AlunoModelo()

var InputNome = document.getElementById('nome')
var InputDataNascimento = document.getElementById('nascimento')
var InputTurma = document.getElementById('turma')
var InputTurno = document.getElementById('Turno')


// Criando a função cadastrar
function cadastra(){
    aluno.push(InputNome.value,
               InputDataNascimento.value,
               InputTurma.value,
               InputTurno.value)
    
    alert(aluno)
}