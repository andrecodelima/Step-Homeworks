// HM 06

const http = require('http');
const fs = require('fs');

const server = http.createServer((req, resp) => {

    if(req.url == '/' || req.url == '/artigos'){
        fs.readFile(__dirname + '/artigos.html', 'utf-8', (err, data)=>{
            if(err){
                console.log(`Erro ${err}`)
                resp.writeHead(500, {'Content-Type': 'text/plain'})
                resp.end('Erro interno')
                return
            }

            console.log(data);
            resp.writeHead(200, { 'Content-Type': 'text/html' });
            resp.end(data);
        })
    
    }else if(req.url == '/contatos' || req.url == '/contato'){
        fs.readFile(__dirname + '/contatos.html', 'utf-8', (err, data)=>{

            if(data){
                console.log(data)
                resp.writeHead(200, {'Content-Type':'text/html'})
                resp.end(data)
            }else{
                console.log(`Erro ${err}`)
                resp.writeHead(500, {'Content-Type': 'text/plain'})
                resp.end('Erro interno')
                return 
            }

        })
    
    }else{
        fs.readFile(__dirname + '/erro.html', 'utf-8', (err, data)=>{
            if(data){
                console.log(data)
                resp.writeHead(200, {'Content-Type':'text/html'})
                resp.end(data)
            }else{
                console.log(`Erro ${err}`)
                resp.writeHead(500, {'Content-Type': 'text/plain'})
                resp.end('Erro interno')
                return 
            }
        })  
    }  
});  
const porta = 3000;
server.listen(porta, () => {
    console.log(`Servidor rodando na porta ${porta}`);
});
