
function validaAluno(){

    let nome = formAluno.inputNome.value;
    let genero = formAluno.inputGenero.value;
    let email = formAluno.inputEmail.value;

    let tam = email.length;

    if(nome == ""){
        alert("Campo Nome está vazio!");
        formAluno.inputNome.focus();
        return;

    }
    
    else if(genero == ""){
        alert("Campo Gênero está vazio!");
        formAluno.inputGenero.focus();
        return;
    
    
    }else if((genero != "Feminino") || (genero != "Masculino")){
		  alert("Campo Gênero inválido");
  		  formAluno.inputGenero.focus();
          return;
    
	
	}else if(email == ""){
        alert("Campo E-mail está vazio!");
        formAluno.inputEmail.focus();
        return;
    
    }else if(email.indexOf("@") == 0 || (email.indexOf("@") - tam) == -1){
        alert("E-mail inválido!")
    	return;
    }
  
    
    formAluno.submit();

}
