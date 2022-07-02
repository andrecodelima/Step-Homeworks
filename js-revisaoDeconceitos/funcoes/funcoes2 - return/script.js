// Retorno de valores

/* É importante que uma função além de executar várias vezes um 
bloco de códigos, possa retornar algum valor. Ex. */

function obtemDiaSemana(){
    return 6
}

/*A funcao retorna um valor. No caso 6. Mas só isso não acontece nada, uma vez que esse valor
não está armazenado em lugar nenhum.
*/

// Com a criacao da variavel dia, fazemos com que tudo que está na função 
// seja armazenado na variavel dia.

let dia = obtemDiaSemana()

console.log(dia)
