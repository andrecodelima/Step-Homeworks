
function validaAluno(){

    let nome = formAluno.inputNome.value;
    let genero = formAluno.inputGenero.value;
    let email = formAluno.inputEmail.value;

    let tam = email.length;
    let opcao = "";

    switch(opcao){

        case nome:
            if(nome == ""){
                alert("CAMPO NOME VAZIO")
                formAluno.inputNome.focus();
                return
            }
        
        case genero:
            if(genero == ""){
                alert("CAMPO GÊNERO VAZIO")
                formAluno.inputGenero.focus();
                return
            }

        case email:
            if(email == ""){
                alert("CAMPO E-MAIL VAZIO")
                formAluno.inputEmail.focus();
                return
            
            }else if(email.indexOf("@") == 0 || (email.indexOf("@") - tam) == -1){
                alert("E-mail inválido!")
                formAluno.inputEmail.focus();
                return;
             }

    }

    formAluno.submit();

}
