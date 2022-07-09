// Cadastro de Alunos

class Estudante{
    nome
    dataNascimento
    turma
    turno
}

var sala = [] // Criacao de array

var aluno = new Estudante() // Criacao de Objeto


function cadastrar(){ // Criacao de funcao
    aluno.nome = document.getElementById('nome').value // objeto em sua propriedade 'nome' recebe valores do html 
    aluno.dataNascimento = document.getElementById('nascimento').value
    aluno.turma = document.getElementById('turma').value
    aluno.turno = document.getElementById('turno').value

    sala.push(aluno.nome, aluno.dataNascimento, aluno.turma, aluno.turno) // Array recebe valores dos objetos com suas propriedades.

                    // alert(sala[1])
                    // O 'erro' aqui, que não é erro, é porque será exibido apenas o valor que está na posição 1 do array.
                    // Voce solicitou o conteúdo que está no índice 1. Nesse array só há um objeto.

                    // document.write(sala[0]) // Correto.

                    // console.log(sala[0].nome)
                    // Aqui aparece 'undefinid' porque já está se tentando exibir o array com a propriedade. Sem sentido.

    // Limpando os inputs
    document.getElementById('nome').value = ''
    document.getElementById('nascimento').value = ''
    document.getElementById('turma').value = ''
    document.getElementById('turno').value = ''

    for(c = 0; c<sala.length; c++){
        var card = (`Nome: ${}`)
    }document.write(card)

}

