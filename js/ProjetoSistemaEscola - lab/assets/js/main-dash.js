// CLASSE ALUNO
class cadastroAluno{
    constructor(pNome, pSobrenome, pIdade, pCurso, pTurma, pTurno){
        this.nome         = pNome
        this.sobrenome    = pSobrenome
        this.idade        = pIdade
        this.curso        = pCurso
        this.turma        = pTurma
        this.turno        = pTurno
  
      }

    cardAluno = function(){
        let cardAluno = '<div class="card">' +
        
                        "Nome: "             + this.nome         + "<br/>" +
                        "Sobrenome: "        + this.sobrenome    + "<br/>" +
                        "Idade: "            + this.idade        + "<br/>" +
                        "Curso: "            + this.curso        + "<br/>" +
                        "Turma: "            + this.turma        + "<br/>" +
                        "Turno: "            + this.turno        + "<br/>" +

                    '</div>';

        return cardAluno;
    }
}

// VAR GLOBAIS


var bancoAlunos                       = []
var bancoAlunosMenorIdade             = []
var bancoAlunosMaiorIdade             = []

var divCardAlunos                     = document.getElementById('divConsultaAlunos')

var bancoProfessores                  = []
var divCardProfessores                = document.getElementById('divConsultaProfessores')

var opProfTodos                       = document.getElementById('divConsultaProfessores')
var opAlunoTodos                      = document.getElementById('divConsultaAlunos')
var opTurmaTodas                      = document.getElementById('divConsultaTurmas')

var sessaoConsultaAlunos                    = document.getElementById('container-consulta-alunos')
var sessaoConsultaProfessores                    = document.getElementById('container-consulta-prof')
var sessaoConsultaTurmas                    = document.getElementById('container-consulta-turmas')

var sessaoCadastro                    = document.getElementById('container-cadastro')



////////////////////////////////-- ALUNOS -- /////////////////////////////////

function cadastrarAlunos(){
    let InputNome                       = document.getElementById('inputlAlunoNome')
    let inputSobrenome                  = document.getElementById('inputAlunoSobrenome')
    let inputIdade                      = document.getElementById('inputAlunoIdade')
    let inputCurso                      = document.getElementById('inputAlunoCurso')
    let inputTurma                      = document.getElementById('inputAlunoTurma')
    let inputTurno                      = document.getElementById('inputAlunoTurno')

    let form = document.getElementById('formaluno')

    bancoAlunos.push(new cadastroAluno( InputNome.value, 
                                        inputSobrenome.value,
                                        inputIdade.value,
                                        inputCurso.value,
                                        inputTurma.value,
                                        inputTurno.value

                                        ))
    

    if(inputIdade.value > 18){
        bancoAlunosMaiorIdade.push(new cadastroAluno(InputNome.value, 
                                                    inputSobrenome.value,
                                                    inputIdade.value,
                                                    inputCurso.value,
                                                    inputTurma.value,
                                                    inputTurno.value
                                                    ))
    }else{
        bancoAlunosMenorIdade.push(new cadastroAluno(InputNome.value, 
                                                    inputSobrenome.value,
                                                    inputIdade.value,
                                                    inputCurso.value,
                                                    inputTurma.value,
                                                    inputTurno.value
                                                    ))
    }

    form.reset()
    // console.log(bancoAlunos)
    // console.log(bancoAlunosMaiorIdade)
    // console.log(bancoAlunosMenorIdade)

}


function exibirAlunoTodos(){
    let cartoes = ''

    for(let i in bancoAlunos){ 
        cartoes += bancoAlunos[i].cardAluno();
    }
    divCardAlunos.innerHTML = cartoes;
    return cartoes
}

function exibirAlunoMaior(){
    let cartoes = ''

    for(let i in bancoAlunosMaiorIdade){ 
        cartoes += bancoAlunosMaiorIdade[i].cardAluno();
    }
    divCardAlunos.innerHTML = cartoes;
    return cartoes
}

function exibirAlunoMenor(){
    let cartoes = ''

    for(let i in bancoAlunosMenorIdade){ 
        cartoes += bancoAlunosMenorIdade[i].cardAluno();
    }
    divCardAlunos.innerHTML = cartoes;
    return cartoes
}


// EXIBIÇÃO DE CADASTRO NA TELA
function exibeOptionAluno(tipo) {
    let sessaoCadastro          = document.getElementById('container-cadastro')
    let opAluno                 = document.getElementById('divCadastroAlunos')
    let opProfessor             = document.getElementById('divCadastroProfessores')
    let opTurmas                 = document.getElementById('divCadastroTurmas')

    // O valor de tipo vem do param 'tipo' que cada função 'exibeOption' recebe
    switch (tipo) {

        //Alunos
      case 0:
        sessaoCadastro.style.display    = 'block'

        sessaoConsultaAlunos.style.display    = 'none'
        sessaoConsultaProfessores.style.display    = 'none'
        sessaoConsultaTurmas .style.display    = 'none'
        
        opAluno.style.display           = 'block'
        opProfessor.style.display       = 'none'
        opTurmas.style.display          = 'none'
        break

        //Professores
      case 1:
        sessaoCadastro.style.display    = 'block'

        sessaoConsultaAlunos.style.display    = 'none'
        sessaoConsultaProfessores.style.display    = 'none'
        sessaoConsultaTurmas .style.display    = 'none'


        opProfessor.style.display       = 'block'
        opAluno.style.display           = 'none'
        opTurmas.style.display          = 'none'
        break

        //Turmas
      case 2:
        sessaoCadastro.style.display    = 'block'

        sessaoConsultaAlunos.style.display    = 'none'
        sessaoConsultaProfessores.style.display    = 'none'
        sessaoConsultaTurmas .style.display    = 'none'

        opTurmas.style.display          = 'block'
        opAluno.style.display           = 'none'
        opProfessor.style.display       = 'none'

        break
    }
  }

  
// FUNÇÃO DE EXIBIÇÃO DE CONSULTA NA TELA - ALUNOS
function exibeAlunosConsulta(tipo) {
    let sessaoConsultaAlunos                  = document.getElementById('container-consulta-alunos')
    let opAlunoTodos                    = document.getElementById('divConsultaAlunos')
    let opAlunoMaior                    = document.getElementById('divConsultaAlunos')
    let opAlunoMenor                    = document.getElementById('divConsultaAlunos')


    switch (tipo) {

        case 0:
            sessaoConsultaAlunos.style.display    = 'block'
            sessaoConsultaProfessores.style.display    = 'none'
            sessaoConsultaTurmas.style.display    = 'none'

            opAlunoTodos.style.display      = 'block'

            sessaoCadastro.style.display    = 'none'

            opProfTodos.style.display       = 'none'
            opTurmaTodas.style.display      = 'none'

            exibirAlunoTodos()
            break

        case 1:

            sessaoConsultaAlunos.style.display    = 'block'
            sessaoConsultaProfessores.style.display    = 'none'
            sessaoConsultaTurmas.style.display    = 'none'


            opAlunoMaior.style.display      = 'block'
            sessaoCadastro.style.display    = 'none'

            opProfTodos.style.display       = 'none'
            opTurmaTodas.style.display      = 'none'

            exibirAlunoMaior()
            break
    
        case 2:
            sessaoConsultaAlunos.style.display    = 'block'
            sessaoConsultaProfessores.style.display    = 'none'
            sessaoConsultaTurmas.style.display    = 'none'

            opAlunoMenor.style.display      = 'block'

            sessaoCadastro.style.display    = 'none'

            opProfTodos.style.display       = 'none'
            opTurmaTodas.style.display      = 'none'

            exibirAlunoMenor()
            break

        default:
            alert('ERRO')

}
  }


  ////////////////////////////////--PROFESSORES -- /////////////////////////////////

  class cadastroProfessor{
    constructor(pNomeP, pSobrenomeP, pIdadeP, pCursoP, pTurnoP){
        this.nomeP         = pNomeP
        this.sobrenomeP    = pSobrenomeP
        this.idadeP        = pIdadeP
        this.cursoP        = pCursoP
        this.turnoP        = pTurnoP
  
      }

    card = function(){
        let card = '<div class="card">'     +
        
                        "Nome: "            + this.nomeP         + "<br/>" +
                        "Sobrenome: "       + this.sobrenomeP    + "<br/>" +
                        "Idade: "           + this.idadeP        + "<br/>" +
                        "Curso: "           + this.cursoP        + "<br/>" +
                        "Turno: "           + this.turnoP        + "<br/>" +

                    '</div>';

        return card;
    }
}


// FUNÇÕES DE CADASTRO
// PROFESSORES

function cadastrarProfessores(){

    let InputNome       = document.getElementById('inputProfNome')
    let inputSobrenome  = document.getElementById('inputProfSobrenome')
    let inputIdade      = document.getElementById('inputProfIdade')
    let inputCurso      = document.getElementById('inputProfCurso')
    let inputTurno      = document.getElementById('inputProfTurno')

    let form            = document.getElementById('formProf')

    bancoProfessores.push(new cadastroProfessor(InputNome.value, 
                                                inputSobrenome.value,
                                                inputIdade.value,
                                                inputCurso.value,
                                                inputTurno.value
                                                ))


    form.reset()
    console.log(bancoProfessores)

}

function exibirProfTodos(){
    let cartoes = ''

    for(let i in bancoProfessores){ 
        cartoes += bancoProfessores[i].card();
    }
    divCardProfessores.innerHTML = cartoes;
    return cartoes
}


/// CONSULTA - PROFESSORES
function exibeProfConsulta(tipo) {
    let sessaoConsultaProfessores  = document.getElementById('container-consulta-prof')
    let opProfTodos     = document.getElementById('divConsultaProfessores')


    switch (tipo) {

        case 0:
            sessaoConsultaProfessores.style.display = 'block'
            sessaoConsultaAlunos.style.display = 'none'
            sessaoConsultaTurmas.style.display = 'none'


            opProfTodos.style.display    = 'block'

            sessaoCadastro.style.display    = 'none'

            opAlunoTodos.style.display    = 'none'
            exibirProfTodos()
            break

        default:
            alert('ERRO')
}
  }


   ////////////////////////////////-- TURMA -- /////////////////////////////////

   class cadastroTurma{

    constructor(pNomeT, pTurnoT){
        this.nomeT          = pNomeT
        this.turnoT         = pTurnoT
  
      }

    card = function(){
        let cardTurma = '<div class="card">' +
        
                        "Turma: "            + this.nomeT        + "<br/>" +
                        "Turno: "            + this.turnoT       + "<br/>" +

                        '</div>';

        return cardTurma;
    }
}

var bancoTurma                        = []

var TurnoManha                        = []
var TurnoTarde                        = []
var TurnoNoite                        = []

var divCardTurma                      = document.getElementById('divConsultaTurmas')



function cadastrarTurmas(){

    let InputNome           = document.getElementById('inputTurmaNome')
    let inputTurno          = document.getElementById('inputTurmaTurno')

    let form                = document.getElementById('formTurma')

    bancoTurma.push(new cadastroTurma(InputNome.value, 
                                      inputTurno.value
                ))



    if(inputTurno.value == 'Manhã'){
        TurnoManha.push(new cadastroTurma(InputNome.value, 
                                            inputTurno.value       
                                          ))
        
        
    }else if(inputTurno.value  == 'Tarde'){
        TurnoTarde.push(new cadastroTurma(InputNome.value, 
                                          inputTurno.value
                                          ))

    }else if(inputTurno.value  == 'Noite'){
        TurnoNoite.push(new cadastroTurma(InputNome.value, 
                                          inputTurno.value
                                          ))
    }


    form.reset()
    // console.log(bancoTurma)
    // console.log(TurnoManha)
    // console.log(TurnoTarde)
    // console.log(TurnoNoite)

}


function exibirTurmas(){
    let cartoes = ''

    for(let i in bancoTurma){ 
        cartoes += bancoTurma[i].card();
    }
     divCardTurma.innerHTML = cartoes;
     return cartoes
}

function exibeTurnoManha(){
    let cartoes = ''

    for(let i in TurnoManha){ 
        cartoes += TurnoManha[i].card();
    }
    divCardTurma.innerHTML = cartoes;
    return cartoes
}

function exibeTurnoTarde(){
    let cartoes = ''

    for(let i in TurnoTarde){ 
        cartoes += TurnoTarde[i].card();
    }
    divCardTurma.innerHTML = cartoes;
    return cartoes
}

function exibeTurnoNoite(){
    let cartoes = ''

    for(let i in TurnoNoite){ 
        cartoes += TurnoNoite[i].card();
    }
    divCardTurma.innerHTML = cartoes;
    return cartoes
}


/////// CONSULTA TURMA 
function exibeTurmasConsulta(tipo) {
    let  sessaoConsultaTurmas = document.getElementById('container-consulta-turmas')
    let opTurmaTodas = document.getElementById('divConsultaTurmas')
    let opTurmaManha = document.getElementById('divConsultaTurmas')
    let opTurmaTarde = document.getElementById('divConsultaTurmas')
    let opTurmaNoite = document.getElementById('divConsultaTurmas')


    switch (tipo) {

        case 0:
            sessaoConsultaTurmas.style.display    = 'block'
            sessaoConsultaAlunos.style.display    = 'none'
            sessaoConsultaProfessores.style.display    = 'none'

            opTurmaTodas.style.display      = 'block'

            sessaoCadastro.style.display    = 'none'
            
            opAlunoTodos.style.display       = 'none'
            opProfTodos.style.display        = 'none'

            exibirTurmas()
            break
        
        case 1:
            sessaoConsultaTurmas.style.display    = 'block'
            sessaoConsultaAlunos.style.display    = 'none'
            sessaoConsultaProfessores.style.display    = 'none'

            opTurmaManha.style.display      = 'block'
            exibeTurnoManha()
            break

        case 2:
            sessaoConsultaTurmas.style.display    = 'block'
            sessaoConsultaAlunos.style.display    = 'none'
            sessaoConsultaProfessores.style.display    = 'none'

            opTurmaTarde.style.display      = 'block'
            opTurmaTarde()
            break
        
        case 3:
            sessaoConsultaTurmas.style.display    = 'block'
            sessaoConsultaAlunos.style.display    = 'none'
            sessaoConsultaProfessores.style.display    = 'none'

            opTurmaNoite.style.display      = 'block'
            opTurmaNoite()
            break
        

        default:
            alert('ERRO')
    

}
  }

////////////////////////////////-- GERAL -- /////////////////////////////////

// var alunoGeral = exibirAlunoTodos()
// var profGeral  = exibirProfTodos()
// var turmaGeral = exibirTurmas()

// var geral = [alunoGeral, profGeral, turmaGeral]

// function exibeGeral(tipo) {

//     switch(tipo){
//         case 0:
//             exibirAlunoTodos()
//             break
//     }
// }

function exibeGeral(tipo) {
    let cartoesAluno            = ''
    let cartoesTurma            = ''
    let cartoesProf             = ''

    let sessaoConsultaAlunos         = document.getElementById('container-consulta-alunos')
    let sessaoConsultaProfessores    = document.getElementById('container-consulta-prof')
    let sessaoConsultaTurmas         = document.getElementById('container-consulta-turmas')

    let Aluno                   = document.getElementById('divConsultaAlunos')
    let Professor               = document.getElementById('divConsultaProfessores')
    let Turma                   = document.getElementById('divConsultaTurmas')


    switch (tipo) {
        
        case 0:
            sessaoCadastro.style.display    = 'none'

            sessaoConsultaAlunos.style.display        = 'block'
            sessaoConsultaProfessores.style.display   = 'none'
            sessaoConsultaTurmas.style.display        = 'none'

            Aluno.style.display                 = 'block'
            for(let i in bancoAlunos){ 
                cartoesAluno += bancoAlunos[i].cardAluno();
            }
            Aluno.innerHTML = cartoesAluno;
            break

        case 1:
            sessaoCadastro.style.display    = 'none'

            sessaoConsultaAlunos.style.display        = 'none'
            sessaoConsultaProfessores.style.display   = 'block'
            sessaoConsultaTurmas.style.display        = 'none'

            Professor.style.display             = 'block'
            for(let i in bancoProfessores){ 
                cartoesProf += bancoProfessores[i].card();
            }
            Professor.innerHTML = cartoesProf;
            break

        case 2:

            sessaoCadastro.style.display    = 'none'

            sessaoConsultaAlunos.style.display        = 'none'
            sessaoConsultaProfessores.style.display   = 'none'
            sessaoConsultaTurmas.style.display        = 'block'

            Turma.style.display                 = 'block'
            for(let i in bancoTurma){ 
                cartoesTurma += bancoTurma[i].card();
            }
            Turma.innerHTML = cartoesTurma;
            break

        default:
                alert('ERRO')
    

}
  }