class Cadastro{
    constructor(modelo, ano, placa, cor){
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor
        
    }

    Cadastra = function(){
        var banco = []
        banco.push(document.getElementById("fabricante").value)
        banco.push(document.getElementById("modelo").value)
        banco.push(document.getAnimations("ano").value)
        banco.push(document.getElementById("placa").value)
        banco.push(document.getElementById("cor").value)

    }
    

}

var cadastros = new Cadastro;
cadastros.Cadastra