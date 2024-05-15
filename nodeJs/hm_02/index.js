
// Biblioteca                           // ==== AUTOEXPLICAÇÃO DO CÓDIGO ====            
var nomeLivro = 'Os Sertões'    
var id        = 'a123'

const evento = require('node:events')  // Importação do módulo: events


// Evento 1 - Retirada de livro                                                            
const retiradaDeLivro = new evento();  // Instanciação da classe EventEmitter chamada aqui de  'retiradaDeLivro'

retiradaDeLivro.on('retirarLivro',    // Utilização do método on para registrar um listner (ouvinte) para o método 'retirar livro'

    () => {(console.log(`O livro: ${nomeLivro}\nId: ${id} foi retirado`))}  
    /* utilizacao de uma função simples que executará um código dentro dela quando o evento 'retirar livro' for emitido.
    Nesse caso a função de call back ou arrow function apenas imprimira a mensagem 'um livro foi retirado'*/
    
)

console.log("\nCarregando o sistema...\nRetirada de livro")
retiradaDeLivro.emit('retirarLivro')  // Utilização do método 'emit' para emtir o evento criado lá em cima 'retirarLivro'


// Evento 2 - Devolução de livro
const devolucaoDeLivro = new evento();

devolucaoDeLivro.on('devolucaoDeLivro',
    () => {(console.log(`O livro ${nomeLivro}\nId: ${id} foi devolvido`))}
)

console.log('==============================================')
console.log("\nCarregando o sistema...\nDevolucao de livro")
devolucaoDeLivro.emit('devolucaoDeLivro')


