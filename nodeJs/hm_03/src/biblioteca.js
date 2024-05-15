const notifier = require('./notifier')

function devolverLivro(livro){
    
    console.log('\nDevolução de livros...')
    if(livro == null){
        console.log('Não há livros para devolução')
    }else{
        console.log('\nDevolvendo')
        notifier.emit('depositar', livro)
        notifier.emit('listarLivros')
    }
}


function listarLivros(){
    console.log('listando livros')
    notifier.emit('listarLivros')
}


function retirarLivro(livro){
    if(livro == null){
        console.log('Não há livros para devolução')
    }else{
        console.log('\nRetirando')
        notifier.emit('retirar', livro)
        notifier.emit('listarLivros')
    }
}

module.exports = {devolverLivro, listarLivros, retirarLivro} // Exportando as funções
 
