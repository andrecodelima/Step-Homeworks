
function validaAluno(){

    let nome = formAluno.inputNome.value;
    let email = formAluno.inputEmail.value;
    let genero = formAluno.inputEmail.value;

    if(nome == ""){
        alert("Campo Nome está vazio!");
        formAluno.inputNome.focus();
        return;

    }else if(email == ""){
        alert("Campo E-mail está vazio!");
        formAluno.inputEmail.focus();
        return;
    
    }else if(genero == ""){
        alert("Campo Gênero está vazio!");
        formAluno.inputGenero.focus();
        return;
    }

    formAluno.submit();

}