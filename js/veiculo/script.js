
function localize(){
    var fabricante = document.getElementById("fabricante").value;
    var modelo = document.getElementById("modelo").value; //Armazeno o valor na variavel modelo.
    var ano = document.getElementById("ano").value;
    var placa = document.getElementById("placa").value;
    var cor = document.getElementById("cor").value;

    // window.alert("Fabricante: " + fabricante
    // + "\n" + "Modelo: " + modelo
    // + "\n" + "Ano: " + ano
    // + "\n" + "Placa: " + placa
    // + "\n" + "Cor: " + cor);

    document.getElementById("resp-fab").innerHTML = fabricante;
    document.getElementById("resp-model").innerHTML = modelo; //Exibo valor da variavel modelo com o Inner
    document.getElementById("resp-ano").innerHTML = ano;
    document.getElementById("resp-placa").innerHTML = placa;
    document.getElementById("resp-cor").innerHTML = cor;
}

// function limpe(){

//     var fabricante = document.getElementById("resp-fab").innerHTML;
//     var modelo = document.getElementById("resp-model").innerHTML;
//     var ano = document.getElementById("resp-ano").innerHTML;
//     var placa = document.getElementById("resp-placa").innerHTML;
//     var cor = document.getElementById("resp-cor").innerHTML;

   
//     fabricante = fabricante.replace(fabricante, " ");
//     fabricante = document.getElementById("resp-fab").innerHTML;

//     // window.alert(fabricante);

//     // document.location.reload();
// }