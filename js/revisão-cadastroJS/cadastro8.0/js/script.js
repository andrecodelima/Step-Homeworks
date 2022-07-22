class cadastro{
    constructor(pNome, pEmail, pNascimento, pTurma){
        
        this.nome       = pNome
        this.email      = pEmail
        this.nascimento = pNascimento
        this.turma      = pTurma

    }

    card = function(){
        let card = '<div class="card">' +
        
                        "Nome: "        + this.nome         + "<br/>" +
                        "E-mail: "      + this.email        + "<br/>" +
                        "Nascimento: "  + this.nascimento   + "<br/>" +
                        "Turma: "       + this.turma        + "<br/>" +

                    '</div>';

        return card;
    }
}

var escola = []
var form = document.getElementById('formulario')
var divCard = document.getElementById('resposta')

var InputNome       = document.getElementById('inputNome')
var InputEmail      = document.getElementById('inputEmail')
var inputNascimento = document.getElementById('inputNascimento')
var inputTurma      = document.getElementById('inputTurma')

function cadastrar(){
    escola.push(new cadastro(InputNome.value, 
                             InputEmail.value,
                             inputNascimento.value,
                             inputTurma.value
                ))

    form.reset()
}

function exibir(){
    let cartoes = ''

    for(let i in escola){ // i pega os indices do array banco
        cartoes += escola[i].card();
    }
    divCard.innerHTML = cartoes;

    // console.log(escola)
}