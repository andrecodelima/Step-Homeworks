
// ================= MEDIA DE ALUNOS =================== //

var nome = window.prompt("Digite seu nome: ");
var nota1 = Number(window.prompt("Digite sua 1º nota: "));
var nota2 = Number(window.prompt("Digite sua 2º nota: "));
var nota3 = Number(window.prompt("Digite sua 3º nota: "));

sorteio = Math.random();
notaSurpresa = (sorteio * (6)+5);
// notaSurpresa = notaSurpresa.toFixed(1);
notaSurpresa = Number(notaSurpresa.toFixed(1));


var media = (nota1 + nota2 + nota3 + notaSurpresa)/4;
media = media.toFixed(1);

window.alert("Olá " + nome + "," + " Segue a baixo seu resultado: " 
+ "\n" + "\n"

+ "Nota 1: " + nota1 + "\n"
+ "Nota 2: " + nota2 + "\n"
+ "Nota 3: " + nota3 + "\n"
+ "Nota Surpresa: " + notaSurpresa + "\n"
+ "Média: " + Number(media) + "\n" + "\n"

+ "Muito obrigado!" + "\n" 
+ "Para fechar cliquem em 'OK'");

//============DESAFIO SOLUCIONADO. ====================//

//Selecionando as casas decimais: ToFixed(x quantidade de casas);
//Atenção que ele transforma o valor em String, tive que converter em Number.
//Usei typeof pra descobrir o tipo da variável.