// HomeWork 01
// Media de alunos

var notas = [3.8, 9.5, 7.5, 8.7, 6.4];
var soma = 0;

for(let i=0; i<notas.length; i++){
    soma += notas[i];
    console.log(soma);
}

var media = (soma)/notas.length;
console.log('\nMédia: '+ media);

if(media >= 5){
    console.log('Situação: Aprovado');
}else {
    console.log('Situação: Reprovado');
}

