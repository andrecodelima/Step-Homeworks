

function validaProduto(){

    formProduto.submit();
}

function retornarPagina(){
    setTimeout(() =>{

        window.location.href="main";
    }, 3000);
    
}

function retornarPaginaLogar(){
    setTimeout(() =>{

        window.location.href="acesso";
    }, 3000);
    
}

function erroSenha(){
			alert("Senha ou usuário incorreto! Tente novamente")

}