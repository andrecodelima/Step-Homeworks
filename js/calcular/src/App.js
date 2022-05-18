function soma(n1, n2){    
    n1 = Number(document.getElementById("valor1").value);
    n2 = Number(document.getElementById("valor2").value);
    // return (n1 + n2);
    resp = (n1 + n2);

    document.getElementById("resultado").innerHTML = resp;
}





function subtrair(n1, n2){
    return (n1 - n2);
}

function dividir(n1, n2){
    return (n1/n2);
}

function multiplicar(n1, n2){
    return (n1*n2);
}



