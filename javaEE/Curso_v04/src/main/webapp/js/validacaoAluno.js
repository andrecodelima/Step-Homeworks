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
    
    }else if(nome[0] >=0){
        alert("NOME INVÁLIDO")
    }


    //Gênero
    if(genero == ""){
        alert("CAMPO GÊNERO VAZIO")
    }


    //EMAIL
    if(email == ""){
        alert("CAMPO EMAIL VAZIO")
    
    }else if(email[0] == "@" || (email.indexOf("@") - tam) == -1){
        
        alert("EMAIL-INVÁLIDO")
    }
    
    
    formAluno.submit();
}