window.onload = function cadastre(){
    var nome = window.prompt("Informe seu nome: ");
    var idade = Number(window.prompt("Informe sua idade: "));
    var peso = Number(window.prompt("Informe seu peso: " + 
    "\n" + "[Ex: 80]"));
    var altura = Number(window.prompt("Informe seu altura: "
    + "\n" + "[Ex: 1.90]"))

    document.getElementById("nome").innerHTML = nome;
    document.getElementById("idade").innerHTML = idade;
    document.getElementById("peso").innerHTML = peso;
    document.getElementById("altura").innerHTML = altura;
}

function sair(){
    window.alert("Não vá embora ainda ...")
}