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

var banco       = []
var Limpar      = document.getElementById('formulario')
var divResposta = document.getElementById('resposta')

var nome        = document.getElementById('inputNome')
var cpf         = document.getElementById('inputIdade')
var cidade      = document.getElementById('inputCidade')
var tipo        = document.getElementById('inputTipo')

function cadastrar(){
    banco.push(new cadastro(nome.value, cpf.value, cidade.value, tipo.value))
    console.log(banco)
}


function exibir(){
    let cartoes = ''
    for(c in banco){
        cartoes += banco[c].card()
    }

    divResposta.innerHTML = cartoes
}