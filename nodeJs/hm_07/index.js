// HM_07

// importacao do módulo.
const express   = require('express')
const app       = express()

// variávies para guardar o texto simples das páginas.
var home        = "<h1>Home</h1> <h2>Loja Virtual<h2>"
var artigos     = "<h1>Artigos</h1>"
var contatos    = "<h1>Contatos</h1>"


// Rotas 'normais'
app.get('/',
    function (req, resp) {
        resp.send(`${home}`)
    }
)

app.get('/artigos',
    function(req, resp){
        resp.send(`${artigos}`)
    }
)

app.get('/contatos',
    function(req, resp){
        resp.send(`${contatos}`)
    }
)

// Rota dinâmica
    /* Aqui, eu vou pegar (get) o argumento (ou valor) que vou por na url
        e em seguida passar para o parâmetro 'item'*/

app.get('/artigos/:item',
    function(req, resp){
        resp.send(req.params.item)
    }
)


var porta = 3000
app.listen(porta,
    function () {

        // Tentativa de tratar o erro
        if (app.listen) {
            console.log(`Servidor rodando.\nAcesse http://localhost:3000`)
        } else {
            console.log('Erro.')
        }
    }
)

