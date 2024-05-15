const notifier = require('./notifier')
let livros = ["Poderá viver para sempre", "Sua juventude"]
// msg = 'DEPÓSITO || Lista de livros atualizada'

function initDepositoLivro() {
    console.log('\nDepósito de livros.')
    notifier.on('depositar', (livro) => {
        livros.push(livro)
        console.log(`Livro: ${livro} realocado no depósito`)
    }
    )

    notifier.on('listarLivros', () => {

        // console.log(`\n${'='.repeat(msg.length)}`)
        // console.log(`${msg}\n`)
        // for (let i = 0; i < livros.length; i++) {
        //     console.log('# ' + livros[i].toString())
        // }

        console.log(`\n====================================`)
        console.log(`DEPÓSITO || Lista de livros atualizada`)
        for (let i = 0; i < livros.length; i++) {
            console.log('# ' + livros[i].toString())
        }
    })


}

module.exports = initDepositoLivro

