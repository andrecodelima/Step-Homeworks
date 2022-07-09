class Pessoa{
    nome
    idade
    genero
}

var p1 = new Pessoa()
p1.nome = 'André'
p1.genero = 'M'
p1.idade = '32'

console.log(p1)

var p2 = new Pessoa()
p2.nome = 'Luiz'
p2.genero = 'M'
p2.idade = '43'

console.log(p2)

if(p1 > p2){
    console.log('P1 é mais velho')
}else{
    console.log('P2 é mais velho')
}

// ==================================== //

class Forma{
    base
    altura
    vertices
}


let trapezio = new Forma()

trapezio.altura = 4
trapezio.base = 10
trapezio.vertices = 4

let generico = new Forma()

generico.altura = 13
generico.base = 12
generico.vertices = 3

// ========================== //

class Cachorro{
    nome = 'totó'
    cor = 'caramelo'
    raca = 'Vira-Lata'
}

let cao = new Cachorro()
console.log(cao)

cao.nome = 'Rex'
console.log(cao)

// =========================== //

var pessoas = [p1, p2]
console.log(pessoas)

for(c=0; c<pessoas.length; c++){
    console.log(`Nome: ${pessoas[c].nome}  Idade: ${pessoas[c].idade}  Gênero: ${pessoas[c].genero}`)
    console.log('====================================')
}


/* Exercício */

/*  Crie uma classe com modelo, ano, cor e placa.
    Cadastre 3 carros em um array,
    imprima na tela os carros cadastrados   */

class Veiculo{
    modelo
    ano
    cor
    placa
}


let carro1 = new Veiculo()
carro1.modelo = 'Ford'
carro1.ano = 2019
carro1.cor = 'Preto'
carro1.placa = 'Rio2021'

let carro2 = new Veiculo()
carro2.modelo = 'Fiat'
carro2.ano = 2011
carro2.cor = 'Vermelho'
carro2.placa = 'Rio221A'

let carro3 = new Veiculo()
carro3.modelo = 'Toyota'
carro3.ano = 2018
carro3.cor = 'Branco'
carro3.placa = 'SP32A'

var garagem = [carro1, carro2, carro3]

for(c=0; c<garagem.length; c++){

    console.log(`Carro ${c+1}`)
    console.log('================')
    console.log(garagem[c].modelo)
    console.log(garagem[c].ano)
    console.log(garagem[c].cor)
    console.log(garagem[c].placa)
    console.log('================')

}