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
        
                        "Nome: "            + this.nome         + "<br/>" +
                        "Sobrenome: "       + this.sobrenome    + "<br/>" +
                        "Idade: "           + this.idade        + "<br/>" +
                        "Curso: "           + this.curso        + "<br/>" +
                        "Turma: "           + this.turma        + "<br/>" +
                        "Turno: "           + this.turno        + "<br/>" +

                    '</div>';

        return cardAluno;
    }
}

// VAR GLOBAIS


var bancoAlunos                 = []
var bancoAlunosMenorIdade       = []
var bancoAlunosMaiorIdade       = []

var divCardAlunos                = document.getElementById('divConsultaAlunos')

var bancoProfessores                  = []
var divCardProfessores                = document.getElementById('divConsultaProfessores')


// FUNÇÕES DE CADASTRO
// ALUNO

function cadastrarAlunos(){
    let InputNome       = document.getElementById('inputlAlunoNome')
    let inputSobrenome  = document.getElementById('inputAlunoSobrenome')
    let inputIdade      = document.getElementById('inputAlunoIdade')
    let inputCurso      = document.getElementById('inputAlunoCurso')
    let inputTurma      = document.getElementById('inputAlunoTurma')
    let inputTurno      = document.getElementById('inputAlunoTurno')

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
}

function exibirAlunoMenor(){
    let cartoes = ''

    for(let i in bancoAlunosMenorIdade){ 
        cartoes += bancoAlunosMenorIdade[i].cardAluno();
    }
    divCardAlunos.innerHTML = cartoes;
}


// FUNÇÃO DE EXIBIÇÃO DE CADASTRO NA TELA
function exibeOptionAluno(tipo) {
    let sessaoCadastro          = document.getElementById('container-cadastro')
    let opAluno                 = document.getElementById('divCadastroAlunos')
    let opProfessor             = document.getElementById('divCadastroProfessores')
    let opCurso                 = document.getElementById('divCadastroCursos')

    // O valor de tipo vem do param 'tipo' que cada função 'exibeOption' recebe
    switch (tipo) {
      case 0:
        sessaoCadastro.style.display    = 'block'
        opAluno.style.display           = 'block'
        break

      case 1:
        sessaoCadastro.style.display    = 'block'
        opProfessor.style.display       = 'block'
        break

      case 2:
        sessaoCadastro.style.display    = 'block'
        opCurso.style.display           = 'block'
        break
    }
  }

// FUNÇÃO DE EXIBIÇÃO DE CONSULTA NA TELA
function exibeAlunosConsulta(tipo) {
    let sessaoConsulta          = document.getElementById('container-consulta')
    let opAlunoTodos            = document.getElementById('divConsultaAlunos')
    let opAlunoMaior            = document.getElementById('divConsultaAlunos')
    let opAlunoMenor            = document.getElementById('divConsultaAlunos')


    switch (tipo) {

        case 0:
            sessaoConsulta.style.display    = 'block'
            opAlunoTodos.style.display      = 'block'
            exibirAlunoTodos()
            break

        case 1:

            sessaoConsulta.style.display    = 'block'
            opAlunoMaior.style.display      = 'block'
            exibirAlunoMaior()
            break
    
        case 2:
            sessaoConsulta.style.display    = 'block'
            opAlunoMenor.style.display      = 'block'
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
                        "Idade: "           + this.idadeP       + "<br/>" +
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
}



function exibeProfConsulta(tipo) {
    let sessaoConsulta  = document.getElementById('container-consulta')
    let opProfTodos     = document.getElementById('divConsultaProfessores')


    switch (tipo) {

        case 0:
            sessaoConsulta.style.display = 'block'
            opProfTodos.style.display = 'block'
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
}

function exibeTurnoManha(){
    let cartoes = ''

    for(let i in TurnoManha){ 
        cartoes += TurnoManha[i].card();
    }
    divCardTurma.innerHTML = cartoes;
}

function exibeTurnoTarde(){
    let cartoes = ''

    for(let i in TurnoTarde){ 
        cartoes += TurnoTarde[i].card();
    }
    divCardTurma.innerHTML = cartoes;
}

function exibeTurnoNoite(){
    let cartoes = ''

    for(let i in TurnoNoite){ 
        cartoes += TurnoNoite[i].card();
    }
    divCardTurma.innerHTML = cartoes;
}



function exibeTurmasConsulta(tipo) {
    let sessaoConsulta = document.getElementById('container-consulta')
    let opTurmaTodas = document.getElementById('divConsultaTurmas')
    let opTurmaManha = document.getElementById('divConsultaTurmas')
    let opTurmaTarde = document.getElementById('divConsultaTurmas')
    let opTurmaNoite = document.getElementById('divConsultaTurmas')


    switch (tipo) {

        case 0:
            sessaoConsulta.style.display    = 'block'
            opTurmaTodas.style.display      = 'block'
            exibirTurmas()
            break
        
        case 1:
            sessaoConsulta.style.display    = 'block'
            opTurmaManha.style.display      = 'block'
            exibeTurnoManha()
            break

        case 2:
            sessaoConsulta.style.display    = 'block'
            opTurmaTarde.style.display      = 'block'
            opTurmaTarde()
            break
        
        case 3:
            sessaoConsulta.style.display    = 'block'
            opTurmaNoite.style.display      = 'block'
            opTurmaNoite()
            break
        

        default:
            alert('ERRO')
    

}
  }

////////////////////////////////-- GERAL -- /////////////////////////////////


function exibeGeral(tipo) {
    let cartoesAluno            = ''
    let cartoesTurma            = ''
    let cartoesProf             = ''

    let sessaoConsulta          = document.getElementById('container-consulta')
    let Aluno                   = document.getElementById('divConsultaGeral')
    let Professor               = document.getElementById('divConsultaGeral')
    let Turma                   = document.getElementById('divConsultaGeral')


    switch (tipo) {
        
        case 0:
            sessaoConsulta.style.display        = 'block'
            Aluno.style.display                 = 'block'
            for(let i in bancoAlunos){ 
                cartoesAluno += bancoAlunos[i].cardAluno();
            }
            Aluno.innerHTML = cartoesAluno;
            break

        case 1:
            sessaoConsulta.style.display        = 'block'
            Professor.style.display             = 'block'
            for(let i in bancoProfessores){ 
                cartoesProf += bancoProfessores[i].card();
            }
            Professor.innerHTML = cartoesProf;
            break

        case 2:
            sessaoConsulta.style.display        = 'block'
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