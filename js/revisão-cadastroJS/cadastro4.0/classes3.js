// Cadastro de Alunos

class Estudante{ // Criação da classe
    nome        //  Atributos ou Propriedades da classe
    nascimento
    turma
    turno
}

var escola = [] // Criação do array

var InputNome         =     document.getElementById('nome')         // Variaveis recebem valores dos inputs 
var InputNascimento   =     document.getElementById('nascimento')  //  (São essas variaveis que passarão esses valores 
var InputTurma        =     document.getElementById('turma')      //   as propriedades do objeto na função. Elas precisam ser 
var InputTurno        =     document.getElementById('turno')     //    globais para poderem ser enxergadas na função.)

function cadastrar(){

    let aluno = new Estudante()                 // Criacao do objeto

    aluno.nome = InputNome.value                // Atribuição do valor do input(no html) a propriedade do objeto
    aluno.nascimento = InputNascimento.value
    aluno.turma = InputTurma.value
    aluno.turno = InputTurno.value

    escola.push(aluno) // Envio ao array do objeto
    exibir()
    document.getElementById('Form-Cadastro').reset()
}

function exibir(){
    for(c=0; c<escola.length; c++){ 
                              // escola -> (array) | [c] -> Indice do array (objeto que foi enviado) | .nome - atributo do objeto
        card = (`Nome:       ${escola[c].nome} 
                 Nascimento: ${escola[c].nascimento}
                 Turma:      ${escola[c].turma}
                 Turno:      ${escola[c].turno}`)
    }document.getElementById('resposta').innerHTML += card
}