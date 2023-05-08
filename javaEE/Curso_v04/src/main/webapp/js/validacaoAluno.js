/**
 * VALIDAÇÃO ALUNO
 */


function validaAluno(){

    let nome    = formAluno.inputNome.value;
    let genero  = formAluno.inputGenero.value;
    let email   = formAluno.inputEmail.value;

    let tam = email.length;

    //Nome
    if(nome == ""){
        alert("CAMPO NOME VAZIO")  
        formAluno.inputNome.focus();
        return;  
    	
    }else if(nome[0] >=0){
        alert("NOME INVÁLIDO")
        formAluno.inputNome.focus();
        return;  

    }


    //Gênero
    if(genero == ""){
        alert("CAMPO GÊNERO VAZIO")
        formAluno.inputGenero.focus();
        return;
    }


    //EMAIL
    if(email == ""){
        alert("CAMPO EMAIL VAZIO")
        formAluno.inputEmail.focus();
        return

    }else if(email[0] == "@" || (email.indexOf("@") - tam) == -1){
        alert("EMAIL-INVÁLIDO")
        formAluno.inputEmail.focus();
        return;

    }
    
    
    formAluno.submit();
}