function soma(n1, n2){    // Duas variáveis qualquer passadas como parâmetros. 
    n1 = Number(document.getElementById("valor1-soma").value); 
    //A variável n1 recebe o valor que está no doc.html, de id "valor1-soma".
    n2 = Number(document.getElementById("valor2-soma").value);
    //A variável n2 recebe o valor que está no doc.html, de id "valor1-soma".

    resp = (n1 + n2); // Criada uma variável chamada resp que recebe a soma de n1 + n2;

    window.alert("Função rodando..." + "\n"
    + "Clique em 'OK' para prosseguir.") // O alert exibe uma mensagem.
    document.getElementById("resultado-soma").innerHTML = resp; 
    // Na pagina html, no id "resultadosoma" é informado o valor da variavel resp.
    
}


function subtrair(n1, n2){
    n1 = Number(document.getElementById("valor1-diminui").value);
    n2 = Number(document.getElementById("valor2-diminui").value);
    resp = (n1 - n2);

    window.alert("Função rodando..." + "\n"
    + "Clique em 'OK' para prosseguir."); 
    document.getElementById("resultado-diminui").innerHTML = resp;
}

function dividir(n1, n2){
    n1 = Number(document.getElementById("valor1-divide").value);
    n2 = Number(document.getElementById("valor2-divide").value);
    resp = (n1 / n2).toFixed(1);

    window.alert("Função rodando..." + "\n"
    + "Clique em 'OK' para prosseguir.")  
    document.getElementById("resultado-divide").innerHTML = resp; 
}

function multiplicar(n1, n2){
    n1 = Number(document.getElementById("valor1-produto").value);
    n2 = Number(document.getElementById("valor2-produto").value);
    resp = (n1 * n2);

    window.alert("Função rodando..." + "\n"
    + "Clique em 'OK' para prosseguir."); 
    document.getElementById("resultado-produto").innerHTML = resp; 

}

