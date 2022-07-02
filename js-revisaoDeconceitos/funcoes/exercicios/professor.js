const tela = document.getElementById('tela') // Pegando um valor e armanzenando na variavel tela

function mostrarTabuada(){
    let n = parseInt(prompt('Digite um número: '))
    let msg = ''

    for(let i = 0; i<=10; i++){
        msg += `${n} X ${i} = ${(n*i)} <br>`
    }
    tela.innerHTML = msg
}

function limparTabuada(){
    tela.innerHTML = ''
}
