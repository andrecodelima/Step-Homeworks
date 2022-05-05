
// ================= MEDIA DE ALUNOS =================== //

//Entrada de dados nas variáveis
var nome = window.prompt("Digite seu nome: ");
var nota1 = Number(window.prompt("Digite sua 1º nota: "));
var nota2 = Number(window.prompt("Digite sua 2º nota: "));
var nota3 = Number(window.prompt("Digite sua 3º nota: "));


//Criação da variável e do cálculo para a nota que deve ser entre 5 e 10.
sorteio = Math.random();
notaSurpresa = (sorteio * (6)+5);


// Utilização de uma condição para impedir que número da nota passe de 10.
if (notaSurpresa > 10){
    notaSurpresa = 10;
}

// Utilização do método toFixed para selecionar o número de casas decimais.
// Transformação (Cast) da variável para um tipo númerico com o "Number".
    //Isso foi necessário porque o método toFixed retorna um valor não númerico (String)
notaSurpresa = Number(notaSurpresa.toFixed(1));

//Cálculo da média
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
