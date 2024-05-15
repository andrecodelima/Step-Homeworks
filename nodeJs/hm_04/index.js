// Homework 04

const httpExemplo = require('http')

const server = httpExemplo.createServer(
    function (req, resp){
        console.log("Hello, World!")

        resp.writeHead(300, {'Content_Type':'text/html'})
        resp.write('<h1>Hello, World!</h1>')
        resp.end()
        console.log('Ok, respondido!')
    }
)

server.listen(3000)

// Explicação
/* 

*** SERVER
# const http = require('http') -> Aqui criamos uma constante chamada 'httpExemplo' e atribuímos a ela a importação do módulo 'http' usando o require. 
# const server = http.createServer() -> Aqui crimos uma constante chamada 'server' e atribuímos a ela um servidor HTTP usando o módulo 'httpExemplo' que
    importamos.

# http.createServer() -> O médodo 'createServer' cria um servidor que vai controlar as solicitações HTTP, através de um event Loop
# function (req, resp){} -> Dentro do método 'createServer' criamos uma função de 'CallBack' ou função de retorno.

    # resp.writeHead(300, {'Content_Type':'text/html'}) | Dentro dessa função de retorno criamos uma pequena pagina para servir de resposta.
    # resp.write('<h1>Hello, World!</h1>')
    # resp.end() -> Finalizamos a resposta.

    # console.log('Ok, respondido!') -> Essa linha fornece um retorno 'interno' de que o código foi executado.

)

*** BROWSER
No browser nós vemos o html renderizado com a mensagem construída no server.

*/
