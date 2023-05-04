
function validaAluno(){

    let nome = formAluno.inputNome.value;
    let genero = formAluno.inputGenero.value;
    let email = formAluno.inputEmail.value;

    let tam = email.length;

    
    
  				
	if(nome[0] >= 0){
		alert("Nome inválido!");
	} 
    
   
  	if(email[0] == "@" || (email.indexOf("@") - tam) == -1){
		  alert("E-mail inválido!");
	  }  
    

}
