class cadastro{
    constructor(pnome, pidade, pcidade, ptipo){
        this.nome   = pnome
        this.idade  = pidade
        this.cidade = pcidade
        this.tipo   = ptipo
    }

    card = function(){
        let cartao = ("<div class= 'card'>"                +

                    "Nome: "    + this.nome     +   "<br>" + 
                    "Idade: "   + this.idade    +   "<br>" + 
                    "Cidade: "  + this.cidade   +   "<br>" + 
                    "Tipo: "    + this.tipo     +   "<br>" +

                 "</div>")
        return cartao
    }
}

var banco               = []

var voluntarios         = []
var funcionarios        = []
var atendidos           = []

var limpa               = document.getElementById('formulario')
var divResposta         = document.getElementById('resposta')

var nome                = document.getElementById('inputNome')
var cpf                 = document.getElementById('inputIdade')
var cidade              = document.getElementById('inputCidade')


function cadastrar(){
let chekVol             = document.getElementById('chkVoluntarios')     .checked
let chekFun             = document.getElementById('chkFuncionarios')    .checked
let chekAtn             = document.getElementById('chkAtendidos')       .checked

let tipo = [chekVol, chekFun, chekAtn].indexOf(true)
    switch(tipo){
       case 0:
            if(chekVol.value == undefined){
                voluntarios.push(new cadastro(nome.value, cpf.value, cidade.value, 'Voluntários'))
                console.log(voluntarios)
            }
            break
       
        case 1:
            if(chekFun.value == undefined){
                funcionarios.push(new cadastro(nome.value, cpf.value, cidade.value, 'Funcionários'))
                console.log(funcionarios)
            }
            break

        case 2:
            if(chekAtn.value == undefined){
                atendidos.push(new cadastro(nome.value, cpf.value, cidade.value, 'Atendidos'))
                console.log(atendidos)
            }
            break

       }
    
    limpa.reset()
}


function exibir(){
    let cartoes = ''
    for(c in voluntarios){
        cartoes += voluntarios[c].card()
    }

    for(c in funcionarios){
        cartoes += funcionarios[c].card()
    }

    for(c in atendidos){
        cartoes += atendidos[c].card()
    }

    divResposta.innerHTML = cartoes
}