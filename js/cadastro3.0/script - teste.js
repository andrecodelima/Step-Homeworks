
var banco_cadastro = []
// var c = 0;
 

// CADASTRO
function cadastra(){
    banco_cadastro.push(document.getElementById('nome').value);
    banco_cadastro.push(document.getElementById('idade').value);
    banco_cadastro.push(document.getElementById('telefone').value);

    exibe();

    //Limpa os inputs após a iteração.
    document.getElementById('nome').value = '';
    document.getElementById('idade').value = '';
    document.getElementById('telefone').value = '';

    
}

//EXIBIÇÃO

function exibe(){
    tam = banco_cadastro.length
    for(let c=0; c<= tam-1; c++){
         var card = (`<div class="col-md-2 card">
                        Nome:${banco_cadastro[c+2]} 
                        Nome:${banco_cadastro[c+1]} 
                        Nome:${banco_cadastro[c]} 
                    </div>`)
        // alert(tam)       
        // alert(banco_cadastro[c] + banco_cadastro[c+1] + banco_cadastro[c+2])
    }document.getElementById('cadastro').innerHTML += card; 

    // let card = (`<div class="col-md-2 card"> 
    //                 Nome:${banco_cadastro[c]}
    //                 Idade:${banco_cadastro[c+1]}
    //                 Telefone:${banco_cadastro[c+2]}
    //             </div>`)
    

    // document.getElementById('cadastro').innerHTML += card; //Acrescentando outro 'card';

    // alert(banco_cadastro.length)
}



