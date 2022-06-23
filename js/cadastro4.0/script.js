
// var banco_cadastro = []
// // var c = 0;
 

// // CADASTRO
// function cadastra(){
//     banco_cadastro.push(document.getElementById('nome').value);
//     banco_cadastro.push(document.getElementById('idade').value);
//     banco_cadastro.push(document.getElementById('telefone').value);

//     exibe();

//     //Limpa os inputs após a iteração.
//     document.getElementById('nome').value = '';
//     document.getElementById('idade').value = '';
//     document.getElementById('telefone').value = '';

    
// }

// //EXIBIÇÃO

// function exibe(){
//     tam = banco_cadastro.length // Recebe o tamanho da variavel banco
//     /*Criação do laço FOR inserir de forma automatica os indices.*/
//     for(let c=0; c<= tam-1; c++){ 
//          var card = (`<div class="col-md-2 card">
//                       Nome:${banco_cadastro[c-2]}
//                       <br>Idade:${banco_cadastro[c-1]}
//                       <br>Telefone:${banco_cadastro[c]}
//                     </div>`)

//     }document.getElementById('cadastro').innerHTML += card; 
// }






var banco = [];
class Aluno{
    nome;
    nascimento;
    turma;
    turno
}

function cadastra(){

    var alunoTemp = new Aluno;
    alunoTemp.nome = document.getElementById("nome").value;
    alunoTemp.nascimento = document.getElementById("nascimento").value;
    alunoTemp.turma = document.getElementById("turma").value;
    alunoTemp.turno = document.getElementById("turno").value;

    banco.push(alunoTemp.nome, alunoTemp.nascimento, alunoTemp.turma, alunoTemp.turno)

    document.getElementById("nome").value = '';
    document.getElementById("nascimento").value = '';
    document.getElementById("turma").value = '';
    document.getElementById("turno").value = '';

    exibe()
}

function exibe(){
    for(c=0; c<= banco.length; c++ ){
    }
    document.getElementById("cadastro").innerHTML = '</br>' + banco + '<br>';
}