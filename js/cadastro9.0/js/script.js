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

var banco           = []
var volutarios      = []
var funcionarios    = []
var atendidos       = []

var Limpar          = document.getElementById('formulario')
var divResposta     = document.getElementById('resposta')

var nome            = document.getElementById('inputNome')
var cpf             = document.getElementById('inputIdade')
var cidade          = document.getElementById('inputCidade')
var tipo            = document.getElementById('inputTipo')

var chekVol            = document.getElementById('chkVoluntarios')
var chekFun            = document.getElementById('chkFuncionarios')
// var chekVol            = document.getElementById('chkVoluntarios')


function cadastrar(){

    switch(chekVol){
        case chekVol:
            console.log(chekVol.value)
    }

    banco.push(new cadastro(nome.value, cpf.value, cidade.value))
    console.log(banco)
}


function exibir(){
    let cartoes = ''
    for(c in banco){
        cartoes += banco[c].card()
    }

    divResposta.innerHTML = cartoes
}