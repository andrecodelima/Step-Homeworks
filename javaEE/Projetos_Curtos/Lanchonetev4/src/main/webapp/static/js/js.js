function validaProduto(){
    let nome    	= formProduto.inputNome.value;
    let descricao   = formProduto.inputDescricao.value;
    let preco   	= formProduto.inputPreco.value;

    //Nome
    if(nome == ""){
        alert("CAMPO PRODUTO VAZIO")  
        formProduto.inputNome.focus();
        return;  
    } else if(nome[0] >=0){
        alert("PRODUTO INVÁLIDO")
        formProduto.inputNome.focus();
        return;  
    }

    //Descrição
    if(descricao == ""){
        alert("CAMPO DESCRIÇÃO VAZIO")
        formProduto.inputdescricao.focus();
        return;
    }

    //PREÇO
    if(preco == ""){
        alert("CAMPO PREÇO VAZIO")  
        formProduto.inputPreco.focus();
        return; 
    }
    
    formProduto.submit();
}


function validaCliente(){
    let nome    	= formProduto.inputNome.value;
    let descricao   = formProduto.inputTelefone.value;

    //Nome
    if(nome == ""){
        alert("Campo nome vazio!")  
        formProduto.inputNome.focus();
        return;  
     }

    //Telefone
    if(descricao == ""){
        alert("Campo telefone vazio")
        formProduto.inputTelefone.focus();
        return;
    }

    
    formProduto.submit();
}

function limparForm(){
	 document.getElementById('formProduto').reset();
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

function confirmaSaidaVenda(){
	if(window.confirm("Deseja encessar a venda e sair?")){
		window.location.href = "index.html";
	}
	 
		
}


//VALIDAÇÃO DA VENDA
function validaVenda(){
    let nome    		= formVendaProduto.inputIdProduto.value;
    let quantidade   	= formVendaProduto.inputQuantidade.value;

    //Nome
    if(nome == ""){
        alert("Insira o produto")  
        formVendaProduto.inputIdProduto.focus();
        return;  
  }

    //Quantidade
    if(quantidade == ""){
        alert("insira a Quantidade")  
        formVendaProduto.inputQuantidade.focus();
        return; 
    }
    
    formProduto.submit();
}

