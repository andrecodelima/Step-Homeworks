function somar(n1, n2){
    return n1 + n2
}
// A funcao somar possui 2 parametros: n1 e n2.
// Ela retorna a soma desses parametros.

/* Na variavel soma atribuimos a funcao somar e 
passamos o valores aos parametros n1 e n2 */
let soma = somar(3, 5)
console.log(soma)
console.log(somar(10, 2))
// alert(somar(20,5))


// Quando não temos certeza de qual valor um parametro irá receber
// podemos declarar um valor Padrão. Ex.

function somar2(n1 = 0, n2 = 0){
    return n1 + n2
}

// Embora nenhum valor tenha sido passado para n2, como informamos
// que ele vale 0, não houve erro no código 

console.log(somar2(15))
