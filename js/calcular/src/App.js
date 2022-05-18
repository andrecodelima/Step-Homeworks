function soma(n1, n2){    
    n1 = Number(document.getElementById("valor1-soma").value);
    n2 = Number(document.getElementById("valor2-soma").value);
    // return (n1 + n2);
    resp = (n1 + n2);

    document.getElementById("resultado-soma").innerHTML = resp;
}


function subtrair(n1, n2){
    n1 = Number(document.getElementById("valor1-diminui").value);
    n2 = Number(document.getElementById("valor2-diminui").value);
    // return (n1 + n2);
    resp = (n1 - n2);

    document.getElementById("resultado-diminui").innerHTML = resp;
}

function dividir(n1, n2){
    n1 = Number(document.getElementById("valor1-divide").value);
    n2 = Number(document.getElementById("valor2-divide").value);
    // return (n1 + n2);
    resp = (n1 / n2);

    document.getElementById("resultado-divide").innerHTML = resp;
}

function multiplicar(n1, n2){
    n1 = Number(document.getElementById("valor1-produto").value);
    n2 = Number(document.getElementById("valor2-produto").value);
    // return (n1 + n2);
    resp = (n1 * n2);

    document.getElementById("resultado-produto").innerHTML = resp;
}



