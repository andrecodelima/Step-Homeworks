
function localize(){
    var fabricante = document.getElementById("fabricante").value;
    var modelo = document.getElementById("modelo").value;
    var ano = document.getElementById("ano").value;
    var placa = document.getElementById("placa").value;
    var cor = document.getElementById("cor").value;

    // window.alert("Fabricante: " + fabricante
    // + "\n" + "Modelo: " + modelo
    // + "\n" + "Ano: " + ano
    // + "\n" + "Placa: " + placa
    // + "\n" + "Cor: " + cor);

    document.getElementById("resp-fab").innerHTML = fabricante;
    document.getElementById("resp-model").innerHTML = modelo;
    document.getElementById("resp-ano").innerHTML = ano;
    document.getElementById("resp-placa").innerHTML = placa;
    document.getElementById("resp-cor").innerHTML = cor;
}