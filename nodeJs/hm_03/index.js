const initDepositoLivro = require("./src/deposito");
const initRetiradaLivro = require('./src/retirada')
const {devolverLivro, retirarLivro} = require('./src/biblioteca') 

initDepositoLivro()
initRetiradaLivro()

devolverLivro("Os Sertões")
retirarLivro("Poderá viver para sempre")
