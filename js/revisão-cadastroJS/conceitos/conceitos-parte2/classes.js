// Construtores são funções que como o nome diz, constrói o objeto ao ser instanciado.
// Objetivos do Construtor: Garantir um padrão de comportamento para criação de classe

// #1
class Animal{
    // nome
    // raca
    // som
            // Não necessidade de declarar as propriedades em cima. 
            // js aceita elas pelo construtor.
            
    constructor(){
        this.nome = 'rex' // Desta classe propriedade 'nome'
        this.raca = 'cao'
        this.som =  'late'

        this.idade = Math.floor(Math.random()*4 + 2) 
        // O construtor abre possíbilidades de colocar funções e outras funcionalidades dentro da classe.

        alert('Animal padrão criado')
        console.log(this) // O this se refere a Classe. 

        // Obs: O Alert não exibe o conteúdo do objeto.
    }
}

var dog1 = new Animal()
console.log(dog1)
///////////////////////////////////////////////////////////// 


// #2
class Pessoa{
    constructor(){
        this.nome = window.prompt('Informe o nome: ')
        this.idade = window.prompt('Informe a idade: ')
    }
}

var p1 = new Pessoa()
console.log(p1)
/////////////////////////////////////////////////////////////


// #3
// Adicionando parâmetros ao construtor 
// O construtor é uma função.

class Aluno{
    constructor(nome, turma, turno){ // |nome, turma e turno são parâmetros do construtor
        this.nome = nome // Dessa classe a propriedade nome |This.nome| recebe o valor de nome |nome| que chegou pelo parâmetro nome |cons(nome)
        this.turma = turma
        this.turno = turno
    }
}

var a1 = new Aluno('Ana', 'WPS2022', 'Manhã') // Esse parênteses é uma função,É O CONSTRUTOR DA CLASSE. 

// Vantagem - Limpeza do código. Ex

var alunos = []
alunos.push(new Aluno('Bia', '202', 'Tarde'))
console.log(alunos)
// Fazendo dessa forma não há necessidade de se criar uma variável para guardar o objeto,
// Porque a nesse caso a váriável já é a casa do array

// A orientação a objetos além de facilitar a manutenção faz com que você tenha por bom hábito sempre
// trabalhar na classe e o principal da classe é o construtor.

//#4
class Veiculo{
    constructor(modelo, ano, cor){
        this.modelo = modelo
        this.ano = ano
        this.cor = cor
    }

    exibeCard = function(){
        console.log('Modelo: ' + this.modelo) // Lembrando que this.modelo irá exibir o valor que lhe foi passado através do paramêtro modelo
        console.log('Ano: ' + this.ano)       
        console.log('Cor: ' + this.cor)
    }

    ExibeCarro = function(){
        let card = (`<div class="divCarro">

                        Modelo: ${this.modelo}
                        Ano:    ${this.ano}
                        Cor:    ${this.cor}

                    </div>`)
        
        return card
    }
}

var carro = new Veiculo('Fiat', '2021', 'Preto')

carro.exibeCard()

document.getElementById('resposta').innerHTML = carro.ExibeCarro() 
/*  Após criarmos o objeto carro (vindo da classe veículo), chamamos 
    o método 'ExibeCarro' e colocamos ele dentro do innerHtml.
*/

//// EXERCÍCIO  ////

/*
    Crie uma página contatos.html, que possua um formulário para cadastro, com nome, telefone e e-mail.
    Exiba os cards cadastrados abaixo do formulário.
    USE CLASSES COM CONSTRUTORES E FUNCTIONS.
*/