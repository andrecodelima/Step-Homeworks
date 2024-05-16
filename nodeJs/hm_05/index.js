// HM_5
// Urls: '/', 'acesso', 'quemsomos'

const http = require('http')

const server = http.createServer(
    function (req, resp) {

        resp.writeHead(200, { 'Content_Type': 'text/html' })

        // Página inicial (home)
        if (req.url == '/') {
            resp.write(`
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
                <title>Home</title>
                <style>
                body{
                    background-color: #CDCDCD;
                }
                h1{
                    color: blue;
                    padding: 20px;
                    text-align: center;
                    background-color: aliceblue;
                }
                </style>
            </head>
            <body>

                <h1>Seja Bem vindo ao nosso sistema!</h1>
    
            </body>
            </html>

            `)

        }// 'bem-vindo ao sistema(Login)
        else if(req.url == '/acesso'){
            resp.write(`
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
                <title>Acesso</title>
                <style>
                body{
                    background-color: #CDCDCD;
                }
                h1{
                    color: blue;
                    padding: 20px;
                    text-align: center;
                    background-color: aliceblue;
                }
                </style>
            </head>
            <body>

            <form>
    
                <h1>Bem vindo ao nosso sistema</h1>
                <h2>Faça o login para continuar</h2>
                
                <label>Usuário</label>
                <input type="text"> 
        
                <label>Usuário</label>
                <input type="text"></br></br>
        
                <button>login</button>
            </form>
    
            </body>
            </html>

            `)

        }// quem somos
        else if(req.url == '/quemsomos'){
            resp.write(`
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
                <title>Quem somos</title>
                <style>
                body{
                    background-color: #CDCDCD;
                }
                h1{
                    color: blue;
                    padding: 20px;
                    text-align: center;
                    background-color: aliceblue;
                }
                </style>
            </head>
            <body>

                <h1>Quem somos</h1>
    
            </body>
            </html>

            `)

        }// Not Found
        else{
            resp.write(`
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>404</title>
                <style>
                    body {
                        background-color: #CDCDCD;
                    }

                    h1 {
                        color: blue;
                        padding: 20px;
                        text-align: center;
                        background-color: aliceblue;
                    }

                    .erro {
                        background-color: #ff0000;
                        color: #fff;
                    }
                </style>
            </head>

            <body>

                <h1 class="erro">Página não encontrada</h1>

            </body>
            </html>
            `)
        }
    
    
    } 
)

let porta = 3000

server.listen(porta, function(){
    console.log(`Servidor rodando na porta ${porta}`)
})

