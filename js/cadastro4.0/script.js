
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

    for(c=0; c<= banco.length-1; c++ ){
        var card = (`<div class="col-md-2 card">

                     Nome: ${alunoTemp.nome}<br>
                     Nascimento: ${alunoTemp.nascimento}<br>
                     Turma: ${alunoTemp.turma}<br>
                     Turno: ${alunoTemp.turno}

                     </div>`)
    }
    document.getElementById("cadastro").innerHTML += card
}

