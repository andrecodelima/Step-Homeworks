const notifier = require('./notifier')
let livros = ["Poderá viver para sempre", "Sua juventude"]

function initRetiradaLivro() {
    console.log('\nRetirada de livros.')
    notifier.on('retirar', (livro) => {

        if (livro == null) {
            console.log('Não há livros para retirada')
        } else {
            livros.pop()
            console.log(`Livro ** ${livro} ** retirado do depósito`)
        }
    }
    )

    notifier.on('listarLivros', () => {

        console.log(`\n====================================`)
        console.log(`RETIRADA || Lista de livros atualizada`)
        for (let i = 0; i < livros.length; i++) {
            console.log('# ' + livros[i].toString())
        }
    })
}

module.exports = initRetiradaLivro